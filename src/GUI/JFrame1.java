package GUI;

import javax.swing.*;
import java.awt.*;

public class JFrame1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("J Frame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);


        ImageIcon image = new ImageIcon("C:\\Users\\colle\\IdeaProjects\\Programm" +
                "ing Exercise\\src\\GUI\\b4a7672804d293036ed30e14db42b75a.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.green);
    }
}
