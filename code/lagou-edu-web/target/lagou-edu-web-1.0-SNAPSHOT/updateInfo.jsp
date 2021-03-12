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

    <form action="/user/updateUserInfo" method="post" enctype="multipart/form-data">

        <p><input type="text" placeholder="请输入需要修改用户id..." name="id"></p>
        <p><input type="text" placeholder="请输入修改后的用户名..." name="name"></p>
        <input type="file" name="file">
        <br>
        <button>修改</button>
    </form>

    <div>
        <a href="index.jsp">首页</a>
        <a href="updatePassword.jsp">修改密码</a>
    </div>

</body>
</html>
