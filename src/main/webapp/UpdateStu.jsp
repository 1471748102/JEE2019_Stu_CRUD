<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/4/19
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<s:form action="update" method="post">
    <s:textfield name="userid" label="请输入要修改的学号"/>
    <s:textfield name="username" label="修改后姓名"/>
    <s:textfield name="userroom" label="修改后班级"/>
    <s:textfield name="userage" label="修改后年龄"/>
    <s:textfield name="usergrade" label="修改后JAVA成绩"/>
    <s:submit/>
</s:form>
</body>
</html>
