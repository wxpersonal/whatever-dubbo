<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录注册界面</title>
</head>
<body>
	<form id="loginform">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input id="username" type="text" name="username"
					placeholder="请输入账号">*<span id="usernamemsg"></span></td>
			</tr>
			<tr>
				<td>密&nbsp;码:</td>
				<td><input id="password" type="password" name="password"
					placeholder="请输入密码">*<span id="passwordmsg"></span></td>
			</tr>
			<tr>
				<td><input type="button" onclick="login();" value="登录"></td>
				<td><input type="button" onclick="" value="注册"></td>
			</tr>
		</table>
	</form>

	<script src="${pageContext.request.contextPath}/js/common/jquery-3.0.0.min.js"
		type="text/javascript"></script>

	<script type="text/javascript">
		function login() {
			$.ajax({
				cache : true,
				type : "POST",
				url : "/whatever/logincheck",
				data : $('#loginform').serialize(),
				async : true,
				error : function(request) {
					alert("Connection error");
				},
				success : function(data) {
					$("#usernamemsg").text(data.usernamemsg);
					$("#passwordmsg").text(data.passwordmsg);
				}
			});
		}
	</script>
</body>
</html>