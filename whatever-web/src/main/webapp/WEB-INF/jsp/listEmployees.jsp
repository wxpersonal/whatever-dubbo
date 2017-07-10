<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>职员列表</title>
</head>
<body>
	<h1>职员列表</h1>
	<table id="emptable" border="1">
		<tr>
			<td>emp_no</td>
			<td>birth_date</td>
			<td>first_name</td>
			<td>last_name</td>
			<td>gender</td>
			<td>hire_date</td>
		</tr>
	</table>
	
	<script src="${pageContext.request.contextPath}/js/common/jquery-3.0.0.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/doT.min.js" type="text/javascript" ></script>

	<script id="employeesTmp" type="text/x-dot-template">
		{{ for(var i=0; i < it.length; i ++){ }}
			<tr>
				<td>{{=it[i].empNo}}</td>
				<td>{{=it[i].birthDate}}</td>
				<td>{{=it[i].firstName}}</td>
				<td>{{=it[i].lastName}}</td>
				<td>{{=it[i].gender}}</td>
				<td>{{=it[i].hiredate}}</td>
			</<tr>
		{{ } }}
	</script>
	
	<script type="text/javascript">
		
		var employeesTmp = $("#employeesTmp").text();
		
		//text（）方法获取不到，使用html（）（兼容ie8及以下浏览器）
		if(!employeesTmp){
			employeesTmp = $("#employeesTmp").html();
		}
		
		var employeesInfo = doT.template(employeesTmp);
		
		$(function(){
			searchEmployees();
		})
		
		function searchEmployees(){
			$.ajax({
				cache : true,
				type : "POST",
				url : "/whatever/employees/searchEmployees",
				data : null,
				async : true,
				error : function(request) {
					alert("error");
				},
				success : function(data) {
					$("#emptable").append(employeesInfo(data));
				}
			});
		}
	</script>
</body>
</html>