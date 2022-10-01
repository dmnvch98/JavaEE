<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/servlet/counter">
        <input type="submit" value="Increment">
    </form>
    <form method="get" action="${pageContext.request.contextPath}/servlet/counter">
        <input type="submit" value="Get Counter info">
    </form>
</body>
</html>