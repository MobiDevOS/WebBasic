<%--
  Created by IntelliJ IDEA.
  User: zhujiule
  Date: 2018/2/6
  Time: 下午6:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>

<p>result page</p>


request域名的相关取值问题
<p> ${requestScope.get("time")}</p>
<p> ${requestScope.get("list")}</p>

session域的相关取值问题：
<p> ${sessionScope.get("user")}</p>
<p> ${sessionScope.get("lev")}</p>


<body>

</body>
</html>
