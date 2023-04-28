package com.groupproject;

import javax.swing.*;
import java.awt.*;

public class App {
    private JPanel panel1;
    private JPasswordField passwordField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}


