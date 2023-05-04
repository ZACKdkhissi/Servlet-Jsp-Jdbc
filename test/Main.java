
import conn.DBConnexion;
import dao.StudentDAO;
import entity.Student;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Abdelmourhit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     Student s=new Student("test","test","test","test@gmail.com");
        StudentDAO dao=new StudentDAO(DBConnexion.connecter());
        //Student s=new Student(2,"tttt","tttt","tttt","tttttt");
        boolean f=dao.deleteStudent(2);
        //System.out.println(s);

//        boolean f=dao.addStudent(s);
//     List<Student> L=new ArrayList<Student>();
//     L=dao.getAllStudent();
//     for(Student ll:L){
//         System.out.println(ll);
//     }
     

    }
    
}
