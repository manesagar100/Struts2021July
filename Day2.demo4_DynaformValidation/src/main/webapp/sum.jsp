<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
		<!DOCTYPE html>
		<html>
		<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		</head>
		<body>
		<H1>Sum = <bean:write name="calcForm"  property="sum" />
		</h1>
		</body>
		</html>