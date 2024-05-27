<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Data Page</title>
</head>
<body>
    <a href="/">+ Add More Items</a>
    <table border="1">
        <thead>
            <tr>
                <th>S.No</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${products}" var="product" varStatus="index">
                <tr>
                    <td>${index.count}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.qty}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>