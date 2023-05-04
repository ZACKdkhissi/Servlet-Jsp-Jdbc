/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;
import java.sql.*;
import entity.*;
import dao.*;
import conn.*;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abdelmourhit
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name=request.getParameter("name");
        String adress=request.getParameter("adress");
        String qualification=request.getParameter("qualification");
        String email=request.getParameter("email");
        HttpSession session=request.getSession();
        
        Student s=new Student(name,adress,qualification,email);
        StudentDAO dao=new StudentDAO(DBConnexion.connecter());
        boolean f=dao.addStudent(s);
        if(f){
            session.setAttribute("succMsg","student submit sucessfuly...");
            response.sendRedirect("add_student.jsp");
        }else{
            session.setAttribute("errorMsg","somting wrong on server...");
            response.sendRedirect("add_student.jsp");
        }

        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
