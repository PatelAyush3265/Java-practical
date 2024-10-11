import java .util.*;
import java.io.*;


class UserDefinedException extends Exception {
    public UserDefinedException(String message) {
        super(message);
    }
}

public class pra_25
 {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new UserDefinedException("You are not eligible to vote.");
            }
        } catch (UserDefinedException e) {
            System.out.println(e.getMessage());
        }

        
        try {
        fileReader = new java.io.FileReader("nonexistentfile.txt");
    
            int result = 10 / 0;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }
}