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
    <h1>Car <c:if test="${create == true}">Create</c:if><c:if test="${create == false}">Update</c:if></h1>
    <hr>
    <form:form method="post" action="/create-update" modelAttribute="car">

        <form:hidden path="id"/>

        Brand: <form:input path="brand"/>
        <form:errors path="brand"/>
        <br><br>

        Model: <form:input path="model"/>
        <form:errors path="model"/>
        <br><br>

        Engine:<form:select path="engine">
        <form:option value="petrol" label="petrol"/>
        <form:option value="gas" label="gas"/>
        <form:option value="diesel" label="diesel"/>
        <form:option value="electro" label="electro"/>
    </form:select>
        <form:errors path="engine"/>
        <br><br>

        Ls:<form:input path="ls"/>
        <form:errors path="ls"/>
        <br><br>

        Transmission:
        <form:radiobutton path="transmission" value="Automatic" label="Automatic"/>
        <form:radiobutton path="transmission" value="Robot" label="Robot"/>
        <form:radiobutton path="transmission" value="stick shift" label="stick shift"/>
        <form:errors path="transmission"/>
        <br><br>

        Owner: <form:input path="owner"/>
        <form:errors path="owner"/>
        <br><br>

        PhoneNumber: <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>
        <br><br>

        Email: <form:input path="email"/>
        <form:errors path="email"/>
        <br><br>

        <button type="submit" class="btn btn-info">Submit</button>
    </form:form>
</div>
</body>

</html>