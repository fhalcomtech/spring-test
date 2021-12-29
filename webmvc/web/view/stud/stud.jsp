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
    <div class="container">

        <h1 class="h1">Ingrese la informaci&oacute;n del estudiante</h1>
        <form:form action="alumpro" modelAttribute="student">
            <div class="mb-3">    
                <label for="name-form" class="form-label">Name</label>
                <form:input id="name-form" path="name" class="form-control form-control-sm"/>
                <form:errors path="name" class="text-danger"/>
            </div>
            
            <div class="mb-3">
                <label for="age-form" class="form-label">Age</label>
                <form:input path="edad" class="form-control form-control-sm" id="age-form"/>
                <form:errors path="edad" class="text-danger"/>
            </div>
            
            <div class="mb-3">
                <label for="email-form" class="form-label">Email</label>
                <form:input path="email" class="form-control form-control-sm" id="email-form"/>
                <form:errors path="email" class="text-danger"/>
            </div>

            <div class="mb-3">
                <label for="postalcode-form" class="form-label">Postal Code</label>
                <form:input path="postalCode" class="form-control form-control-sm" id="postalcode-form"/>
                <form:errors path="postalCode" class="text-danger"/>
            </div>

            <div class="mb-3">
                <label for="favorite-form" class="form-label">Favorite Signature</label>
                <form:select path="favorite" class="form-select form-control-sm" id="favorite-form" >
                    <form:options items="${student.signatures}" itemValue="code" itemLabel="name"/>
                </form:select>
            </div>
            
            <h6>Hobbies</h6>
            <div class="mb-3">
                <div class="form-check">
                    <label for="hobbie-futbol" class="form-label">Futbol</label>
                    <form:checkbox path="hobbies" value="futbol" id="hobbie-futbol"/>
                </div>

                <div class="form-check">
                    <label for="hobbie-tennis" class="form-label">Tennis</label>
                    <form:checkbox path="hobbies" value="futbol" id="hobbie-tennis"/>
                </div>

                <div class="form-check">
                    <label for="hobbie-baseball" class="form-label">Baseball</label>
                    <form:checkbox path="hobbies" value="futbol" id="hobbie-baseball"/>
                </div>
            </div>

            <h6>Sexo</h6>
            <div class="mb-3">
                <div class="form-check">
                    <label for="man-form" class="form-label">Man</label>
                    <form:radiobutton path="sexo" value="hombre" id="man-form"/>
                </div>
                <div class="form-check">
                    <label for="woman-form" class="form-label">Woman</label> 
                    <form:radiobutton path="sexo" value="mujer" id="woman-form"/>
                </div>
            </div>
            
            <button type="submit" class="btn btn-primary">Send</button>
        </form:form>
    </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>