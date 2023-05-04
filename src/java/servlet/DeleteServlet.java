/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import conn.DBConnexion;
import dao.StudentDAO;
import entity.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "DeleteServlet", urlPatterns = {"/DeleteServlet"})
public class DeleteServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));

        HttpSession session=request.getSession();
        StudentDAO dao=new StudentDAO(DBConnexion.connecter());
        boolean f=dao.deleteStudent(id);
        
         if(f){
            session.setAttribute("succMsg","student Deleted sucessfuly...");
            response.sendRedirect("index.jsp");
        }else{
            session.setAttribute("errorMsg","somting wrong on server...");
            response.sendRedirect("index.jsp");
        }

    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
