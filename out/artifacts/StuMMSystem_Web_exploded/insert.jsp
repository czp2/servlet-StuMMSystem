<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<jsp:useBean id="conn1" class="com.dbutil.StudentDao" scope="page"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style type="text/css">
	.s{
		width:245px;
		height:30px;
	}
	div{
		margin: 0 auto;
		width: 80%;
		text-align:center;
		border:1px solid;
	}
</style>
<title>insert</title>
</head>
<body>
	<div>
		请输入你要添加的学生信息
		<form action="insert" method="post">
			<p>学&emsp;&emsp;号：<input type="text" name="stuNo"/></p>
			<p>姓&emsp;&emsp;名：<input type="text" name="stuName"/></p>
			<p>性&emsp;&emsp;别：<input type="text" name="sex"/></p>
			<p>联系地址：<input type="text" name="address"/></p>
			<p>所属学院：<input type="text" name="college"/></p>
			<p><input type="submit" name="submit" vlaue="确认" class="s"/></p>
		</form>
	</div>

</body>
</html>