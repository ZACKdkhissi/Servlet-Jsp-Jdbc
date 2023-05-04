<%-- 
    Document   : add_student
    Created on : 2 mai 2023, 14:55:06
    Author     : Abdelmourhit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajouter Student</title>
    </head>
    <body>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

        <%@include file="navbar.jsp" %>
        <div class="container p-4">
            <div class="card">
                <div class="card-body">
                    <h2 class="text-center">Ajouter Student</h2>
                    <c:if test="${not empty sessionScope.succMsg}">
                        <div class="text-success">${sessionScope.succMsg}</div>
                        <c:remove var="succMsg"/>
                    </c:if>
                    <c:if test="${not empty sessionScope.errorMsg}">
                        <div class="error">${sessionScope.errorMsg}</div>
                        <c:remove var="errorMsg"/>
                    </c:if>
                    <form action="RegisterServlet" method="post">
                        <div class="mb-3">
                          <label  class="form-label">Full Name</label>
                          <input type="text" class="form-control" name="name">
                        </div>
                        <div class="mb-3">
                          <label  class="form-label">Adress</label>
                          <input type="text" class="form-control" name="adress" >
                        </div>
                        <div class="mb-3">
                          <label  class="form-label">Qualification</label>
                          <input type="text" class="form-control" name="qualification" >
                        </div>
                        <div class="mb-3">
                          <label  class="form-label">Email</label>
                          <input type="email" class="form-control" name="email" >
                        </div>
                       
                        
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>  
                </div>

            </div>       
        </div>
        
    </body>
</html>
