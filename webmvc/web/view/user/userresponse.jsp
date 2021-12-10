<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
    <title>Respuesta Usuarios</title>
</head>
<body>
    <img src="${pageContext.request.contextPath}/resources/img/clock.jpg" alt="clock" height="250"/>
    <h1>Bienvenido</h1>
    <p>${param.username}....</p>

    <p>${fhalcommsg}</p>
</body>
</html>