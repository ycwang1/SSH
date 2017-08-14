<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%-- <%@papge isELIgnored="false"%>
 --%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>展示产品</title>
</head>
<body>
	<table border="1" cellspacing="0" width="500px">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>price</td>
		</tr>
		<s:iterator value="products" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.name}</td>
				<td>${p.price}</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>