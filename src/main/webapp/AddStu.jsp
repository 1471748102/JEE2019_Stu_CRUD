<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/4/19
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>ADD</title>
</head>
<body>
<s:form action="add" method="post">
    <s:textfield name="userid" label="学号"/>
    <s:textfield name="username" label="姓名"/>
    <s:textfield name="userroom" label="班级"/>
    <s:textfield name="userage" label="年龄"/>
    <s:textfield name="usergrade" label="JAVA成绩"/>
    <s:submit/>
</s:form>
</body>
</html>
