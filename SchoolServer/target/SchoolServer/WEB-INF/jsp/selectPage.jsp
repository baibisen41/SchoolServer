<%--
  Created by IntelliJ IDEA.
  User: 大森
  Date: 2017/9/9
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
<head>
    <title>选择界面</title>
</head>
<br>
<form id="showTaskPage" action="/SchoolServer/task/showTaskMessage.do" method="post">
    <input id="showtask" name="showtask" type="submit" value="任务信息区"/></br>
</form>
<form id="forumPage" action="/SchoolServer/forum/showForumList.do" method="post">
    <input id="forum" name="forum" type="submit" value="问题讨论区"/></br>
</form>
<form id="bookPage" method="post">
    <input id="book" name="book" type="submit" value="图书管理区"/>
</form>
</body>
</html>
