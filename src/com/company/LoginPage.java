package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

/**
 * Created by Luke on 9/24/16.
 */
public class LoginPage extends JFrame {

        public static String username; // Username and
        public static String password; // Password made global variables for ActionListeners
        public static String applicationName = "Application"; // Come up with cool name for application later
        private static JFrame loginFrame = new JFrame(); // Creates a window, essentially

public static void login() {
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null); // Start position will exist on most screens because it isn't specific
        loginFrame.setResizable(true);
        loginFrame.setSize(1000, 600);
        loginFrame.setTitle(applicationName);
        loginFrame.setVisible(true);
        loginFrame.setBackground(Color.white);
        JPanel loginPanel = new JPanel(new GridBagLayout()); // Creates new panel in window.
        loginFrame.getContentPane().add(loginPanel); /* getContentPane() adjusts the size of the panel automatically
        * based on what is in the loginFrame container (I think). If this doesn't work, add getContentPane()
        * back in */

        // Create GridBag constraints for window layout
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = -1;

        // Create labels
        loginPanel.add(new JLabel(String.format(applicationName + ": LOGIN")), c);
        c.gridx = -2;
        c.gridy = 1;
        loginPanel.add(new JLabel("Username: "), c);
        c.gridx = -2;
        c.gridy = 2;
        loginPanel.add(new JLabel("Password: "), c);

        // Create username field
        JTextField usernameField = new JTextField(20);
        usernameField.setPreferredSize(new Dimension(200, 30));
        c.gridx = 2;
        c.gridy = 1;
        loginPanel.add(usernameField, c); // Add username text field

        // Create password field
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setPreferredSize(new Dimension(200, 30));
        c.gridx = 2;
        c.gridy = -1;
        loginPanel.add(passwordField, c); // Add password field

        // Create login button
        JButton login = new JButton("Login");
        login.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // ErrorFrame.error("Test Error"); //Test error for Errorframe, uncomment below lines and delete this one
                        // when file I/O is ready
                        Validation.usernameIndex();
                        Validation.passwordIndex();
                        System.out.println();
                           /* username = usernameField.getText();
                            password = passwordField.getText(); //Deprecated and replaced by getPassword()
                        // But, for our current purposes, it is easiest to get the password in the form of a string */
                    }
                }
        );
        c.gridx = 6;
        c.gridy = 1;
        loginPanel.add(login, c); // Add login button

        // Create quit button
        JButton quit = new JButton("Quit");
        quit.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        quit();
                    }
                }
        );
        c.gridx = 6;
        c.gridy = 2;
        loginPanel.add(quit, c);
    }

    public static void quit() {
        loginFrame.dispose();
        System.exit(0); // Ends Process
    }

}