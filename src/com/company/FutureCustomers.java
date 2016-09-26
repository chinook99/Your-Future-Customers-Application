package com.company;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Luke on 9/24/16.
 */
public class FutureCustomers extends JFrame {

    public FutureCustomers() {
        LoginPage.login();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override //FutureCustomers is now the frame class
            public void run() {
            new FutureCustomers().setVisible(false);
        }
    });
}

}

