<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Car-Info</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-4">
        <h1>Car Info</h1><hr>
        <hr>
        Brand: ${car.brand}<br><br>
        Model: ${car.model}<br><br>
        Engine: ${car.engine}<br><br>
        Ls: ${car.ls}<br><br>
        Owner: ${car.owner}<br><br>
        PhoneNumber: ${car.phoneNumber}<br><br>
        Email: ${car.email}<br><br>

        <a href="/">Back to all Cars</a>
    </div>
</body>

</html>