package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by thesecretaccount on 9/25/16.
 */
public class ErrorFrame extends JFrame{

    public static void error(String exceptionType) {

        JFrame error = new JFrame();
        error.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        error.setLocationRelativeTo(null); //Start position will exist on most screens because it isn't specific
        error.setResizable(true);
        error.setSize(500, 300);
        error.setTitle(LoginPage.applicationName + " Error: " + exceptionType);
        error.setVisible(true);
        error.setBackground(Color.WHITE);


    }
}
