package com.wx.whatever.controller;

import com.github.pagehelper.Page;
import com.wx.whatever.pojo.SystemCode;
import com.wx.whatever.service.ISystemCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wxper on 2017/4/25.
 */

@Controller
@RequestMapping("systemCode")
public class SystemCodeController {

    @Autowired
    ISystemCodeService systemCodeService;

    @RequestMapping("list")
    public List<SystemCode> listCode(){
        Page page = new Page();
        systemCodeService.query();
        return null;
    }
}
