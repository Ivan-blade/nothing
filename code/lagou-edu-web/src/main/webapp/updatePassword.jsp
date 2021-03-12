<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/8
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/user/updatePassword" method="post">
        <p><input type="text" placeholder="请输入id..." name="id"></p>
        <p><input type="text" placeholder="请输入密码..." name="password"></p>
        <p><button>修改</button></p>
    </form>

    <div>
        <a href="updateInfo.jsp">修改用户信息</a>
        <a href="index.jsp">首页</a>
    </div>

</body>
</html>
