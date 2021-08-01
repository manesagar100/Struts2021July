<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login Example</title>
		</head>
		<body>
		<html:messages id="message" message="true">
			<li><%= message  %></li>
		</html:messages>
			<hr />

			<logic:messagesPresent>
				<bean:message key="errors.header"/>
					<html:messages id="error">
						<li><bean:write name="error" /></li>
					</html:messages>
				<bean:message key="errors.footer"/>
			</logic:messagesPresent>
			<hr />


			<html:form action="/login" focus="password">
				<bean:message key="loginform.username" /> : <html:text
					property="userName" />
				<br>
				<bean:message key="loginform.pwd" /> : <html:password
					property="password" />
				<br>
				<html:submit value="Login" />
				<html:reset></html:reset>
			</html:form>

		</body>
		</html>