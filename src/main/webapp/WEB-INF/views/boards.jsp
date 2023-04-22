<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: skinshy
  Date: 2023/04/15
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script
            src="https://code.jquery.com/jquery-3.6.4.min.js"
            integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
            crossorigin="anonymous"></script>
    <script src="<c:url value="/static/board/board.js"/>"></script>
    <link href="<c:url value="/static/reset.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/board/board.css"/>" rel="stylesheet">
</head>
<body>
  <div id="root"></div>
</body>
</html>
