<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/4/19
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Del</title>
</head>
<body>
<s:form action="del" method="post">
    <s:textfield name="userid" label="学号"/>
    <s:submit/>
</s:form>
</body>
</html>
