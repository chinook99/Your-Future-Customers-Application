package com.company;
import java.io.*;
import java.util.*;

/**
 * Created by Luke on 9/25/16.
 */
public class Validation {

    static ArrayList<String> usernameArrayList = new ArrayList<>(); //Arraylist for storing usernames
    static ArrayList<String> passwordArrayList = new ArrayList<>(); //Arraylist for storing passwords

    public static void usernameIndex() {

        //Define variables inside method so the names can be recycled
        //as needed between username and password verification
        int arrayPosition = 0; //ArrayList position index
        String input;
        //Don't add file extension on the end of the file if it's in the same package
        InputStream usernameInputStream = Validation.class.getResourceAsStream("usernames");
        String[] usernameReferenceArray = null;

        try {
            Scanner readFile = new Scanner(usernameInputStream);

            while (readFile.hasNextLine()) {
                input = readFile.nextLine(); //Using nextLine() because nextLine() considers spaces and doesn't restart at \n
                usernameReferenceArray = input.split(","); //Saves username strings into an array at the commas
            }

            for (int i = 0; i < usernameReferenceArray.length; i++) {
                usernameArrayList.add(i, usernameReferenceArray[i]);
                System.out.println(usernameArrayList.get(i)); //Just to verify that it works
            }
        }
        catch(Exception e){
            String exceptionType = e.getMessage();
            ErrorFrame.error(exceptionType);
        }

    }



    public static void passwordIndex() {

        //Recycle variable names from usernameIndex()
        int arrayPosition = 0; //ArrayList position index
        String input;
        //Don't add file extension on the end of the file if it's in the same package
        InputStream passwordInputStream = Validation.class.getResourceAsStream("passwords");
        String[] passwordReferenceArray = null;

        try {
            Scanner readFile = new Scanner(passwordInputStream);

            while (readFile.hasNextLine()) {
                input = readFile.nextLine(); //Using nextLine() because nextLine() considers spaces and doesn't restart at \n
                passwordReferenceArray = input.split(","); //Saves password strings into an array at the commas
            }

            for (int i = 0; i < passwordReferenceArray.length; i++) {
                passwordArrayList.add(i, passwordReferenceArray[i]);
                System.out.println(passwordArrayList.get(i)); //Just to verify that it works
            }
        }
        catch(Exception e){
            String exceptionType = e.getMessage();
            ErrorFrame.error(exceptionType);
        }

    }

    public static void validate() {
        // Insert code for comparing position in array of username and password
        // for validation here
    }
}
