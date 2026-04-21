/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MRPC
 */
import java.util.Scanner;

public class GradeBookTest {
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        
        GradeBook gb= new GradeBook();
        
        System.out.println("Please enter the course name: ");
        String Course = sc.nextLine();
        
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        gb.setcourseName(Course);
        gb.setname(name);
        gb.setage(age);
        gb.displayMessage();
    }
    
    
}
