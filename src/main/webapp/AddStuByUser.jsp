<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/4/19
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>通过User类来实现增加功能</title>
</head>
<body>
<s:form action="User" method="post">
    <s:textfield name="uk.userid" label="学号"/>
    <s:textfield name="uk.username" label="姓名"/>
    <s:textfield name="uk.userroom" label="班级"/>
    <s:textfield name="uk.userage" label="年龄"/>
    <s:textfield name="uk.usergrade" label="JAVA成绩"/>
    <s:submit/>
</s:form>
</body>
</html>
