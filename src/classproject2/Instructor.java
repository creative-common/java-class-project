/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject2;

/**
 *
 * @author sanjeet
 */
public class Instructor {

    @Override
    public String toString() {
        return "Instructor{" + "lastName=" + lastName + ", firstName=" + firstName + ", officeName=" + officeName + '}';
    }


    String lastName;
    String firstName;
    String officeName;


    
    public Instructor(String lastName, String firstName, String officeName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeName = officeName;
    }
    
        
    public void set(String lastName, String firstName, String officeName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeName = officeName;
    }
    
    
    
    
    
}
