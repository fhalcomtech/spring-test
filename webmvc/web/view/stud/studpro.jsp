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

    <title>Datos de estudiante procesados</title>
</head>
<body>
    <div class="container">
        <h1 class="h1"> Buenos dias ${student.name} </h1>
        <p class="container">
            Tu edad es: ${student.edad}
            <br/>Y tu email es ${student.email}
            <br/>Y tu materia favorita es ${student.favorite}
        </p>
            Sus hobbies son: 
            <c:forEach items="${student.hobbies}" var="hobby">
               <br/> ${hobby}
            </c:forEach>
            <br> Su sexo es: ${student.sexo}

        </p>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </div>

</body>
</html>