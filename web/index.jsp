<%-- 
    Document   : index
    Created on : 2 mai 2023, 14:54:03
    Author     : Abdelmourhit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="dao.*" %>
<%@page import="entity.*" %>
<%@page import="conn.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

        <%@include file="navbar.jsp" %>
        <div class="container p-4">
            <div class="card">
                <div class="card-body">
                    <c:if test="${not empty sessionScope.succMsg}">
                        <div class="text-success">${sessionScope.succMsg}</div>
                        <c:remove var="succMsg"/>
                    </c:if>
                    <c:if test="${not empty sessionScope.errorMsg}">
                        <div class="error">${sessionScope.errorMsg}</div>
                        <c:remove var="errorMsg"/>
                    </c:if>
        <table class="table">
        <thead class="table-info">
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Full Name</th>
            <th scope="col">Adress</th>
            <th scope="col">Qualification</th>
            <th scope="col">Email</th>
            <th scope="col">Action</th>


          </tr>
        </thead>
        <tbody>
            <%  
            StudentDAO dao=new StudentDAO(DBConnexion.connecter());
            List<Student> L=new ArrayList<Student>();
            L=dao.getAllStudent();
            for(Student ll:L){
            %>
          <tr>
            <th scope="row"><%=ll.getId()%></th>
            <td><%=ll.getFullName()%></td>
            <td><%=ll.getAdress()%></td>
            <td><%=ll.getQualification()%></td>
            <td><%=ll.getEmail()%></td>
            <td><a class="btn btn-primary" href="edit_student.jsp?id=<%=ll.getId()%>" role="button">Edit</a>  <a class="btn btn-danger" href="DeleteServlet?id=<%=ll.getId()%>" role="button">Delate</a></td>
          </tr>
          <% }%>
        </tbody>
      </table>
                </div></div></div>
        
    </body>
</html>
