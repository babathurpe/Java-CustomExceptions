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
public class UserNameMustHaveNumberException extends Exception {
    private String username;

    public UserNameMustHaveNumberException(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Your username must contain a number.\nUsername given is: " + username;
    }
}
