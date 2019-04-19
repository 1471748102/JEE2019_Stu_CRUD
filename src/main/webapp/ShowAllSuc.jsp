<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/4/19
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Suc</title>
</head>
<body>

<table border="1">
    <tr align="center">
        <td>学号</td>
        <td>姓名</td>
        <td>班级</td>
        <td>年龄</td>
        <td>JAVA成绩</td>
        <td colspan ="2">操作</td>
    </tr>
    <s:iterator  value="StudentList"  var="ux">
        <tr>
            <td><s:property value="#ux.getUserid()"/></td>
            <td><s:property value="#ux.getUsername()"/></td>
            <td><s:property value="#ux.getUserroom()"/></td>
            <td><s:property value="#ux.getUserage()"/></td>
            <td><s:property value="#ux.getUsergrade()"/></td>
            <td>
                <a href="del.action?user.userid=<s:property value="#ux.getUserid()"/>">删除</a>
            </td>
            <td>
                <a href="update.action?user.userid=<s:property value="#ux.getUserid()"/>">修改</a>
            </td>

        </tr>
    </s:iterator>
</table>
<p>
</body>
</html>
