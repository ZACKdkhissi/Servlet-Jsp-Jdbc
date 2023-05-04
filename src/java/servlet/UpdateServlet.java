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

/**
 *
 * @author Abdelmourhit
 */
@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet {

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        int id=Integer.parseInt(request.getParameter("id"));

        HttpSession session=request.getSession();
        Student s=new Student(id,name,adress,qualification,email);
        StudentDAO dao=new StudentDAO(DBConnexion.connecter());
        boolean f=dao.updateStudent(s);
        
         if(f){
            session.setAttribute("succMsg","student update sucessfuly...");
            response.sendRedirect("index.jsp");
        }else{
            session.setAttribute("errorMsg","somting wrong on server...");
            response.sendRedirect("index.jsp");
        }
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
