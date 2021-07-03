<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style type="text/css">
.s {
	width: 180px;
	height: 30px;
}

div {
	margin: 0 auto;
	width: 80%;
	text-align: center;
	border: 1px solid;
}
table {
	border: 2px solid;
}

td {
	border: 1px solid;
	text-align: center;
	width: 200px;
	height: 30px;
}
</style>
<title>search</title>
</head>
<body>
	<div>
		<form action="search" method="post">
			<p>
				请输入你要查询学生的学号：
			</p>
			<p>
				<input type="text" name="stuNo" />
			</p>
			<p>
				<input type="submit" vlaue="确认" class="s" />
			</p>
		</form>
		<table>
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>联系地址</td>
				<td>所属学院</td>
			</tr>
			<tr>
				<td>${student.stuNo}</td>
				<td>${student.stuName}</td>
				<td>${student.sex}</td>
				<td>${student.address}</td>
				<td>${student.college}</td>
			</tr>
		</table>
	</div>
</body>
</html>