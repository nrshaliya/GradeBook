/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MRPC
 */
public class GradeBook {
    private String courseName;
    private String name;
    private int age;
    
    public void setcourseName(String courseName){
        this.courseName = courseName;
    }
    
    public void setname (String name){
        this.name= name;
    }
    
    public void setage (int age){
        this.age= age;
    }
    
    public String getcourseName(){
        return courseName;
    }
    
    public String getname(){
        return name;
    }
    
    public int getage(){
        return age;
    }
    
    public void displayMessage(){
        System.out.println("Welcome to the Grade Book for: " + courseName );
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}
