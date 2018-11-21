<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="mvc/login" method="post">
		账号：<input name="username" type="text"><br>
		密码：<input type="password" name="pwd"><br>
		生日：<input type="date" name="birthday"><br>
		<input type="submit" value="登录">
		
	</form>
	<a href="mvc/testMap">Map测试</a>${mess }<br>
	<a href="mvc/testMav">Mav测试</a>${stu.username }	${stu.birthday }<br>
	<a href="mvc/servletApi">ssesion测试</a>${stu.username }	${stu.birthday }<br>
	<div>
		<form action="mvc/upload" method="post" enctype="multipart/form-data">
			请选择文件:<input type="file" name="file"><br>
			<input name="miaoshu"><br>
			<input type="submit" value="上传">
		</form>
	</div>
</body>
</html>