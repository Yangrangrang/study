<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/static/reset.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/board/board.css"/>" rel="stylesheet">
    <title>Title</title>
</head>
<body>
    <header>
        <h1>Board</h1>
    </header>
    <main>
        <ul>
            <li>
                <div>num</div>
                <div>title</div>
                <div>writer</div>
                <div>date</div>
            </li>
            <c:forEach var="board" items="${boards}">
                <li>
                    <div>${board.seq}</div>
                    <div>${board.title}</div>
                    <div>${board.writer}</div>
                    <div>${board.createDate}</div>
                </li>
            </c:forEach>
        </ul>
    </main>
</body>
</html>
