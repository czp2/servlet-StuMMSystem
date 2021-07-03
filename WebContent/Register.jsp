<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.text {
	width: 150px;
	height: 20px;
}

.button {
	width: 200px;
	height: 30px;
}

select {
	width: 150px;
	height: 25px;
}

div {
	margin: 0 auto;
	width: 80%;
	text-align: center;
	border: 1px solid;
}
</style>
<title>注册页面</title>
</head>
<body>
	<div>
		<form action="register" method="post" style="text-align: center;">
			<h1>学 生 信 息 管 理 系 统</h1>
			<p>
				账号：<input type="text" name="name" class="text" />
			</p>
			<p>
				密码：<input type="password" name="pwd" class="text" />
			</p>
			<p>
				<input type="submit" value="注册" class="button" />
			</p>
			<p>
				<a href="Login.jsp">已经注册，直接登录</a>
			</p>
		</form>
	</div>
	<%-- <%
		Object message = session.getAttribute("message");
		if (!"".equals(message) && message != null) {
	%>
	<script type="text/javascript">
		alert("<%=message%>");
	</script>
	<%
		}
	%> --%>
</body>
</html>