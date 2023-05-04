<%-- 
    Document   : edit_student
    Created on : 2 mai 2023, 14:55:21
    Author     : Abdelmourhit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="dao.*" %>
<%@page import="entity.*" %>
<%@page import="conn.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modifier Student</title>
    </head>
    <body>
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

        <%@include file="navbar.jsp" %>
        <div class="container p-4">
            <div class="card">
                <div class="card-body">
                    <h2 class="text-center">Modifier Student</h2>
                    <%
                     int id=Integer.parseInt(request.getParameter("id"));
                     StudentDAO dao=new StudentDAO(DBConnexion.connecter());
                     Student s=dao.GetStudentByID(id);
                    %>
                    
                    <form action="UpdateServlet" method="post">
                        <div class="mb-3">
                          <label  class="form-label">Full Name</label>
                          <input type="text" class="form-control" name="name" value="<%=s.getFullName()%>">
                        </div>
                        <div class="mb-3">
                          <label  class="form-label">Adress</label>
                          <input type="text" class="form-control" name="adress" value="<%=s.getAdress()%>">
                        </div>
                        <div class="mb-3">
                          <label  class="form-label">Qualification</label>
                          <input type="text" class="form-control" name="qualification" value="<%=s.getQualification()%>">
                        </div>
                        <div class="mb-3">
                          <label  class="form-label">Email</label>
                          <input type="email" class="form-control" name="email" value="<%=s.getEmail()%>">
                        </div>
                        <input type="hidden" name="id" value="<%=s.getId()%>"/>
                       
                        
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>  
                </div>

            </div>       
        </div>


    </body>
</html>
