<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Car-Service</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="container mt-4">
<h1>Car Service</h1><hr>
    <table class="table" border="1">
        <thead class="thead-dark">
        <tr>
            <th>brand</th>
            <th>model</th>
            <th>View</th>
            <th>update</th>
            <th>delete</th>
        </tr>
        <c:forEach var="car" items="${cars}">
            <tr>
                <td>${car.brand}</td>
                <td>${car.model}</td>
                <td><button type="button" class="btn btn-primary" onclick="window.location.href ='/${car.id}'">View</button></td>
                <td><button type="button" class="btn btn-success" onclick="window.location.href ='/update/${car.id}'">update</button></td>
                <td>
                    <form action="/delete/${car.id}" method="post">
                        <button type="submit" type="button" class="btn btn-danger">delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </thead>
    </table>
    <hr>
<%--    <a href="/create">Create Car</a>--%>
    <button type="button" class="btn btn-danger" type="submit" onclick="window.location.href ='/create'">Create Car</button>
</div>
</body>

</html>
