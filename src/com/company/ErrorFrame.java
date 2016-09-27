package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by thesecretaccount on 9/25/16.
 */
public class ErrorFrame extends JFrame{

    public static void error(String exceptionType) {

        JFrame error = new JFrame(); //Create JFrame
        error.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        error.setLocationRelativeTo(null); // Start position will exist on most screens because it isn't specific
        error.setResizable(true);
        error.setSize(500, 300);
        error.setTitle(LoginPage.applicationName + " Error: " + exceptionType); // Displays exception type
        error.setVisible(true);
        error.setBackground(Color.WHITE);

        JPanel errorPanel = new JPanel(new GridBagLayout()); // Create JPanel for error JFrame
        error.add(errorPanel); // If this doesn't work, add getContentPane() back in

        GridBagConstraints c = new GridBagConstraints(); //Create constraints for error window
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;

        // Add JLabel to window with error type
        errorPanel.add(new JLabel("A(n) " + exceptionType + " exception has occurred.\n" +
                "The application will quit now."), c); // Perhaps integrate autosaving function later
        c.gridx = 0; // Keep x coordinate the same for the JButton to keep things in line
        c.gridy = 2; // Adjust y coordinate so the button and label don't overlap

        // Add JButton to window that says "OK"
        JButton okButton = new JButton("OK");
        okButton.setPreferredSize(new Dimension(150, 50));
        errorPanel.add(okButton, c);
        okButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        LoginPage.quit();
                    }
                }
        );
    }
}
