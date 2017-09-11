<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 大森
  Date: 2017/9/10
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>问题详情</title>
</head>
<body>
<table border="1">

    <c:forEach var="forumDetail" items="${forumDetailList}">
        <c:if test="${forumDetail.replycontent == 'hihihi'}">
            <tr>
                <td>帖子:</td>
                <td>${forumDetail.forumcontent}</td>
                <td>${forumDetail.forumusername}</td>
                <td>${forumDetail.forumtime}</td>
            </tr>
        </c:if>
        <tr>
            <td>回复如下:</td>
            <td>${forumDetail.replycontent}</td>
            <td>${forumDetail.replyusername}</td>
            <td>${forumDetail.replytime}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
