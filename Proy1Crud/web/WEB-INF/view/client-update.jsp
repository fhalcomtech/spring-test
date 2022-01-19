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
    <title>Client Create</title>
</head>
<body>
    <div class="container">
    <form:form action="${pageContext.request.contextPath}/client/saveclient" modelAttribute="client"> 
        <form:hidden id="id-form" path="id"/>
        <div class="mb-3">    
            <label for="name-form" class="form-label">Name</label>
            <form:input id="name-form" path="name" class="form-control form-control-sm"/>
        </div>
        <div class="mb-3">    
            <label for="lastname-form" class="form-label">Last Name</label>
            <form:input id="lastname-form" path="lastname" class="form-control form-control-sm"/>
        </div>
        <div class="mb-3">    
            <label for="email-form" class="form-label">Email</label>
            <form:input id="email-form" path="email" class="form-control form-control-sm"/>
        </div>
        <button type="submit" class="btn btn-primary">Send</button>
    </form:form>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>