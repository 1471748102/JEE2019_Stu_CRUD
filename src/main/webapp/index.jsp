<%--
  Created by IntelliJ IDEA.
  User: ljc
  Date: 2019/2/24
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<s:form action="Login" method="post">
    <s:textfield name="username" label="账号"/>
    <s:textfield name="password" label="密码"/>
    <s:submit/>
</s:form>
</body>
</html>
