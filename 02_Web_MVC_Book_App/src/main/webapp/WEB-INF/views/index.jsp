<%--
  Created by IntelliJ IDEA.
  User: babayaga
  Date: 18/05/24
  Time: 10:23 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
    <h3>Book Details</h3>
    <form action="book">
        Book Id : <input type="text" name="id"/>
        <input type="submit" value="Search">
    </form>
    <hr>
    Book ID : ${book.bookId} <br/>
    Book Name : ${book.bookName}<br/>
    Book Price : ${book.bookPrice}<br/>
</body>
</html>
