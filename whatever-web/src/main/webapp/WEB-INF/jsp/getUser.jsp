<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

    <script src="/js/common/jquery-3.0.0.min.js" type="text/javascript"></script>
    
    <script type="text/javascript">
        
        $(function () {
            var data = {
                "addressId": 0,
                "birthday": "2017-06-21T10:22:55.468Z",
                "createBy": 0,
                "createTime": "2017-06-21T10:22:55.468Z",
                "email": "string",
                "gender": 0,
                "id": 0,
                "mobile": "string",
                "password": "string",
                "photoId": 0,
                "status": 0,
                "updateBy": 0,
                "updateTime": "2017-06-21T10:22:55.468Z",
                "username": "string"
            }
            //采用Ajax方式提交
            $.ajax({
                url: "user/addUser",
                type: "post",
                timeout: 600000,
                async:isasync,
                beforeSend:function (XMLHttpRequest) {
                    XMLHttpRequest.setRequestHeader("formtype","jqueryajax"); // 调用本次AJAX请求时传递的options参数,解决中文乱码问题
                },
                contentType: "application/x-www-form-urlencoded; charset=utf-8",
                processData:true,
                dataType:"json",
                data:data,
                success: function (data) {
                    alert(1111);
                },
                error:function (data) {
                    alert(1111);
                }
            });
        })
    </script>
</head>
<body>
	<h1>${user.username }</h1>
	<h1>${user.password }</h1>
	<h1>${user.mobile }</h1>
</body>
</html>