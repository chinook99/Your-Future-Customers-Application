package com.company;
import com.intellij.ide.ui.AppearanceOptionsTopHitProvider;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;
import java.awt.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Application { // JTextArea and stuff needs to be arranged, IO system needs to be made operational

    private static JFrame applicationFrame = new JFrame(); // Creates a window, essentially
    private static String time;
    private static String user;
    private static JTextArea reportArea;
    public static void Launch() { // Launch() method's applicationFrame and applicationPanel
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationFrame.setLocationRelativeTo(null); // Start position will exist on most screens because it isn't specific
        applicationFrame.setResizable(true);
        applicationFrame.setSize(1000, 800);
        applicationFrame.setTitle("Welcome, " + LoginPage.username + "!");
        applicationFrame.setVisible(true);
        applicationFrame.setBackground(Color.white);
        JPanel applicationPanel = new JPanel(new GridBagLayout()); // Creates new panel in window.
        applicationFrame.getContentPane().add(applicationPanel);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0; // Mira: Adjust these Constraints
        c.gridy = 0;
        applicationPanel.add(reportArea, c);
        // Create quit button
        JButton save = new JButton("Save"); // JJ made this JButton and ActionListener
        save.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        LoginPage.quit(); // C ASAP
                    }
                }
        );
        c.gridx = -2;
        c.gridy = 2;
        applicationPanel.add(save, c);


        JTextField reportTitle = new JTextArea(20); // JJ made this
        reportTitle.setPreferredSize(200,30); // JJ made this
        // Mira: Put constraints here
        applicationPanel.add(reportTitle, c); // JJ made this
        JTextArea reportArea = new JTextArea(15, 30); // JJ made this JTextArea

        /*  You guys will probably stay within this class for the application,
         * so this is likely all you'll need. Just do whatever makes the program fits the algorithm
         * and then we'll worry about making it fancier. Below are a few methods that might make it
         * easier for you guys to read/write to files (since the file i/o system was my responsibility
         * anyway). Feel free to create a few more methods to make you guys' process easier.
         */
            // jourdan
        JTable chart = new JTable(11,3);
        applicationPanel.add(chart, c);
    }
    
    // checkPermissions() was created by Luke
    private static boolean checkPermissions() { //Checks to see if user has the permission to create/modify files/folders
        File outputDirectory = new File(String.format("/Users/" + System.getProperty("user.name") + "/Documents/TT"));
        return(outputDirectory.canWrite());
    }


    // writeToFile(String filename) was created by Luke
    // The purpose of writeToFile is to write files and create directories when necessary
    private static void writeToFile(String fileName, JTextArea text) {
        File outputDirectory = new File(String.format("/Users/" + System.getProperty("user.name") + "/Documents/TT"), "read,write");
        if(checkPermissions() == false) {
            outputDirectory.setWritable(true);
            outputDirectory.setReadable(true);
            outputDirectory.setExecutable(true);
        }
        if (!outputDirectory.exists()) {
            outputDirectory = new File(String.format("/Users/" + System.getProperty("user.name") + "/Documents/TT"), "read,write");
        }
        File outputFile = new File(String.format("/Users/" + System.getProperty("user.name") + "/Documents/TT/" + fileName), "read,write");

    }

    // getTime() was created by Luke
    private static void getTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        time = timeFormat.format(calendar.getTime());
        System.out.println(time);
    }

}
