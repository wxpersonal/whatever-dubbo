package com.wx.whatever.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * spring mvc文件上传下载
 * <p>Title:FileController</p>
 * <p>Description:</p>
 * <p>Company:</p>
 *
 * @author weix
 * @date 2016年8月30日 上午9:22:39
 */
@Controller
@RequestMapping("fileOperation")
public class FileController {

    /**
     * <p>Title: initUpload</p>
     * <p>@Description:上传界面初始化</p>
     *
     * @param
     * @return @return ModelAndView @throws
     */
    @RequestMapping("initUpload")
    public ModelAndView initUpload() {
        return new ModelAndView("fileUpload");
    }

    /**
     * ajax上传文件(流方式)，并返回上传信息
     *
     * @throws IOException @throws FileNotFoundException
     *                     <p>Title:ajaxUpload</p>
     */
    @RequestMapping("ajaxUploadByStream")
    @ResponseBody
    public String ajaxUploadByStream(@RequestParam("file") CommonsMultipartFile[] files,
                                     HttpServletRequest request) {

        for (int i = 0; i < files.length; i++) {
            System.out.println("fileName---------->" + files[i].getOriginalFilename());

            if (!files[i].isEmpty()) {
                int pre = (int) System.currentTimeMillis();
                try {
                    // 拿到输出流，同时重命名上传的文件
                    File f = new File("E:\\upload");
                    if (!f.exists()) {
                        f.mkdirs();
                    }

                    //	/whatever/src/main/webapp/upload
                    FileOutputStream os = new FileOutputStream("E:\\upload\\"
                            + new Date().getTime() + files[i].getOriginalFilename());
                    // 拿到上传文件的输入流
                    InputStream in = files[i].getInputStream();
                    int b = 0;
                    byte[] tmp = new byte[1024];
                    while ((b = in.read(tmp)) != -1) {
                        os.write(tmp, 0, b);
                    }
                    os.flush();
                    os.close();
                    in.close();
                    int finaltime = (int) System.currentTimeMillis();
                    System.out.println(finaltime - pre);

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("上传出错");
                }
            }
        }
        return "success";
    }

    /**
     * <p>Title: upload2</p>
     *
     * @param @param  request
     * @param @param  response
     * @param @return
     * @param @throws IllegalStateException
     * @param @throws IOException
     * @return String
     * @throws
     */
    @RequestMapping("/ajaxUploadByTransfer")
    @ResponseBody
    public String upload2(HttpServletRequest request, HttpServletResponse response)
            throws IllegalStateException, IOException {
        //创建一个通用的多部分解析器  
        CommonsMultipartResolver multipartResolver =
                new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断 request 是否有文件上传,即多部分请求  
        if (multipartResolver.isMultipart(request)) {
            //转换成多部分request    
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //取得request中的所有文件名  
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                //记录上传过程起始时的时间，用来计算上传时间  
                int pre = (int) System.currentTimeMillis();
                //取得上传文件  
                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {
                    //取得当前上传文件的文件名称  
                    String myFileName = file.getOriginalFilename();
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
                    if (myFileName.trim() != "") {
                        System.out.println(myFileName);
                        //定义上传路径  

                        String path = "E:\\upload\\" + new Date().getTime() + file.getOriginalFilename();
                        File localFile = new File(path);
                        file.transferTo(localFile);
                    }
                }
                //记录上传该文件后的时间  
                int finaltime = (int) System.currentTimeMillis();
                System.out.println(finaltime - pre);
            }

        }
        return "success";
    }


    /**
     * <p>Title: springUpload</p>
     *
     * @param @param  request
     * @param @return
     * @param @throws IllegalStateException
     * @param @throws IOException
     * @throws
     */
    @RequestMapping("springUpload")
    public String springUpload(HttpServletRequest request) throws IllegalStateException, IOException {
        long startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();

            while (iter.hasNext()) {
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if (file != null) {
                    String path = "E:/springUpload" + file.getOriginalFilename();
                    //上传
                    file.transferTo(new File(path));
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
        return "/success";
    }
}
