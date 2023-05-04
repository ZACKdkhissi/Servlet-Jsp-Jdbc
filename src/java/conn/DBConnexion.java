package conn;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnexion {
    
    private static Connection conn=null;
    
    public static Connection connecter(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_dbs","root","Zakaria1234@");
          System.out.println("success");       
        }catch(Exception ex){
        
            System.out.println(ex);
        
        
          }
        
        
        
        return conn;
    }
    
}
