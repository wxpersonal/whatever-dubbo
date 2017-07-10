<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

    <script src="js/common/jquery-3.0.0.min.js" type="text/javascript"></script>
    <script type="text/javascript">

        $(function () {
            var data = {"addressId": 11,"email": "111","gender": 11,"id": 11,"mobile": "111","password": "111","photoId": 11,"username": "111"};
            //采用Ajax方式提交
            $.ajax({
                url: "/whatever/user/addUser",
                type: "post",
                timeout: 600000,
                async: false,
                contentType : "application/json",
                dataType: "json",
                data: JSON.stringify(data),
                success: function (data) {
                },
                error: function (data) {
                }
            });
        })
    </script>
</head>
<body>
hello
</body>
</html>