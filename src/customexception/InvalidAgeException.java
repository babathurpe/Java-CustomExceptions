/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception;

/**
 *
 * @author macbookpro
 */
public class InvalidAgeException extends Exception {
    
    public InvalidAgeException() {
        super("Invalid age exception. Enter an age below 110.");
    }
}
