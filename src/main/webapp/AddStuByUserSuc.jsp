<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/4/19
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
通过User信息插入成功！<br>
学号：<s:property value="uk.userid"/><br>
姓名：<s:property value="uk.username"/><br>
班级：<s:property value="uk.userroom"/><br>
年龄：<s:property value="uk.userage"/><br>
JAVA成绩：<s:property value="uk.usergrade"/><br>
</body>
</html>
