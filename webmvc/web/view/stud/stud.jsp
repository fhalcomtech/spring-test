<%@ page language='java' contentType='text/html;charset=UTF-8'%>
<%@ taglib prefix='form' uri='http://www.springframework.org/tags/form'%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Ingrese los datos del estudiante</title>
</head>
<body>
    <h1 class="h1">Ingrese la informaci&oacute;n del estudiante</h1>
        <form:form action="alumpro" modelAttribute="userinfo" class="container">
            Name: <form:input path="name" class="form-text"/>
            <form:errors path="name"/>
            <br/>
            
            Edad: <form:input path="edad" class="form-text"/><br/>
            Email: <form:input path="email" class="form-text"/><br/>
            <form:select path="favorite" class="form-select">
                <form:options items="${userinfo.signatures}" itemValue="code" itemLabel="name"/>
            </form:select>
            
            Hobbies:
            <br/>
            Futbol<form:checkbox path="hobbies" value="futbol"/>
            Tennis<form:checkbox path="hobbies" value="tennis"/>
            Baseball<form:checkbox path="hobbies" value="Baseball"/>

            <br>
            Hombre:<form:radiobutton path="sexo" value="hombre"/>
            Mujer: <form:radiobutton path="sexo" value="mujer"/>

            <button type="submit" class="btn-primary">Send</button>
        </form:form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>