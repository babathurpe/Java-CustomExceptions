/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbookpro
 */
public class CustomException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean goodUsername = false;
        boolean goodAge = false;

        //Continually ask for username while exception is thrown / goodUsername return false
        do {
            System.out.print("Enter a username: ");
            String username = input.next();

            try {
                //Call method to check username
                checkForDigit(username);
                goodUsername = true;
            } catch (UserNameMustHaveNumberException ex) {
                System.out.println(ex + "\n");
            }
        } while (goodUsername == false);

        //Continually ask for age while exception is thrown / goodAge return false
        do {
            System.out.println("Testing Invalid Age Exception ");
            System.out.print("Enter age: ");
            int age = input.nextInt();

            try {
                //Call method to check age
                checkInvalidAge(age);
                goodAge = true;
            } catch (InvalidAgeException ex) {
                System.out.println(ex + "\n");;
            }
        } while (goodAge == false);

    }

    //Method to check for digits in a given username.
    public static void checkForDigit(String username) throws UserNameMustHaveNumberException {
        int digit = 0;
        //Loop through each character in username to check for any digit
        for (int i = 0; i < username.length(); i++) {
            if (Character.isDigit(username.charAt(i))) {
                //increase the value of digit
                digit++;
            }
        }
        //check if digit has increased
        if (digit == 0) {
            throw new UserNameMustHaveNumberException(username);
        }
    }

    //Method to check for age Exception.
    public static void checkInvalidAge(int age) throws InvalidAgeException {
        if (age > 110) {
            throw new InvalidAgeException();
        }
    }

}
