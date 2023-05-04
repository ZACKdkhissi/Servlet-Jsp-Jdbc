/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import entity.*;
import java.util.*;

/**
 *
 * @author Abdelmourhit
 */
public class StudentDAO {
    
    private Connection conn;

    public StudentDAO(Connection conn) {
        this.conn = conn;
    }
    
    public boolean addStudent(Student s){
        boolean f=false;
        try{
            String sql="insert into Student(name,adress,qualification,email) values(?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, s.getFullName());
            ps.setString(2, s.getAdress());
            ps.setString(3, s.getQualification());
            ps.setString(4,s.getEmail());
            int i=ps.executeUpdate();
            
            if(i==1){
                f=true;
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
      
        
        return f;
    }
    
    public List<Student> getAllStudent(){
        List<Student> L=new ArrayList<Student>();
        Student s=null;
        try{
            String sql="select * from Student";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                s=new Student();
                s.setId(rs.getInt(1));
                s.setFullName(rs.getString(2));
                s.setAdress(rs.getString(3));
                s.setQualification(rs.getString(4));
                s.setEmail(rs.getString(5));
                L.add(s);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return L;
    }
    
    public Student GetStudentByID(int id){
        Student s=null;
        try{
            String sql="select * from Student where id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                s=new Student();
                s.setId(rs.getInt(1));
                s.setFullName(rs.getString(2));
                s.setAdress(rs.getString(3));
                s.setQualification(rs.getString(4));
                s.setEmail(rs.getString(5));
            }           
        }catch(Exception e){
            e.printStackTrace();
        }
        

        
        return s;
    }
    
    public boolean updateStudent(Student s){
        boolean f=false;
        try{
            String sql="UPDATE Student \n" +
                        "SET name = ?, adress = ?, qualification = ?, email = ? \n" +
                        "WHERE id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, s.getFullName());
            ps.setString(2, s.getAdress());
            ps.setString(3, s.getQualification());
            ps.setString(4,s.getEmail());
            ps.setInt(5,s.getId() );
            int i=ps.executeUpdate();
            
            if(i==1){
                f=true;
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
      
        
        return f;
    }
    
    public boolean deleteStudent(int id){
        boolean f=false;
        try{
            String sql="delete from Student where id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1, id);
           
            int i=ps.executeUpdate();
            
            if(i==1){
                f=true;
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
      
        
        return f;
    }
}
