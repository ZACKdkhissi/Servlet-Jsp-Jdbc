/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Abdelmourhit
 */
public class Student {
    private int id;
    private String fullName;
    private String adress;
    private String qualification;
    private String email;

    public Student() {
    }

    public Student(String fullName, String adress, String qualification, String email) {
        this.fullName = fullName;
        this.adress = adress;
        this.qualification = qualification;
        this.email = email;
    }

    public Student(int id, String fullName, String adress, String qualification, String email) {
        this.id = id;
        this.fullName = fullName;
        this.adress = adress;
        this.qualification = qualification;
        this.email = email;
    }
    

    public int getId() {
        return id;
    }
    

    public String getFullName() {
        return fullName;
    }

    public String getAdress() {
        return adress;
    }

    public String getQualification() {
        return qualification;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", adress=" + adress + ", qualification=" + qualification + ", email=" + email + '}';
    }
    
    
    
    

    
     

    
    
}
