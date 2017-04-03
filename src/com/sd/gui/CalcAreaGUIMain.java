package com.sd.gui;
import java.awt.*;
import javax.swing.*;

public class CalcAreaGUIMain {
  public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel panel=new JPanel(new GridLayout(3,2));
        f.getContentPane().add(panel);
        JLabel label1=new JLabel("반지름");
        JLabel label2=new JLabel("면적");
        JTextField radiusTf1=new JTextField(20);
        JTextField areaTf2=new JTextField(20);
        JButton b1=new JButton("계산");
        JButton b2=new JButton("취소");
        b1.addActionListener(new CalcAreaListener());
        panel.add(label1);
        panel.add(radiusTf1);
        panel.add(label2);
        panel.add(areaTf2);
        panel.add(b1);
        panel.add(b2);
        f.pack();
        f.setVisible(true);
  }
}