<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style type="text/css">
div {
	margin: 0 auto;
	width: 80%;
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
<title>show</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<td><a href="insert.jsp">添加</a></td>
				<td colspan="4">数据库中数据如下所示:</td>
				<td><a href="search.jsp">查询</a></td>
			</tr>
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>联系地址</td>
				<td>所属学院</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list}" var="item">
				<tr>
					<td>${item.stuNo}</td>
					<td>${item.stuName}</td>
					<td>${item.sex}</td>
					<td>${item.address}</td>
					<td>${item.college}</td>
					<td><a href="delete?stuNo=${item.stuNo}" onclick="return confirm('确定要删除么？');">删除</a>|<a
						href="update?stuNo=${item.stuNo}">修改</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>