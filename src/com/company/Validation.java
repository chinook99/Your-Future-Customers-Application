package com.company;
import java.io.*;
import java.util.*;

/**
 * Created by thesecretaccount on 9/25/16.
 */
public class Validation {

    public static void usernameIndex() { //FileReader will throw FileNotFoundException

        int arrayPosition = 0; //ArrayList position index
        String input;
        String fileLocation = "usernames.txt"; //replace with proper location if necessary
        String[] usernameReferenceArray = null;
        ArrayList<String> usernameArrayList = new ArrayList<>(); //Arraylist for storing strings

        try {
            Scanner readFile = new Scanner(new BufferedReader(new FileReader(fileLocation)));

            while (readFile.hasNextLine()) {
                input = readFile.nextLine(); //Using nextLine() because nextLine() considers spaces and doesn't restart at \n
                usernameReferenceArray = input.split(","); //Saves username strings into an array at the commas
            }

            for (int i = 0; i < usernameReferenceArray.length; i++) {
                usernameArrayList.add(i, usernameReferenceArray[i]);
                System.out.println(usernameArrayList.get(i));
            }
        }
        catch(Exception e){
            String exceptionType = e.getMessage();
            ErrorFrame.error(exceptionType);
        }

    }
}
