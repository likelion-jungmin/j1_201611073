package com.sd.address;

import java.awt.*;
import javax.swing.*;

public class AddressGUIMain {
public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel panel=new JPanel(new GridLayout(8,2));
        f.getContentPane().add(panel);
        JLabel label1=new JLabel("����ó �߰�");
        JLabel label2=new JLabel("�̸�");
        JLabel label3=new JLabel("��ȭ��ȣ");
        JLabel label4=new JLabel("����ó �˻�");
        JLabel label5=new JLabel("����ó ����");
        JLabel label6=new JLabel("����");
        JLabel blank1=new JLabel(" ");
        JLabel blank2=new JLabel(" ");
        JLabel blank3=new JLabel(" ");
        JLabel blank4=new JLabel(" ");
        JTextField name=new JTextField(20);
        JTextField phonenum=new JTextField(20);
        JTextField numsearch=new JTextField(20);
        JTextField numdel=new JTextField(20);
        JButton b1=new JButton("���");
        JButton b2=new JButton("�˻�");
        JButton b3=new JButton("����");
        b1.addActionListener(new AddressListener());
        panel.add(label1);
        panel.add(blank1);
        panel.add(label2);
        panel.add(name);
        panel.add(label3);
        panel.add(phonenum);
        panel.add(blank2);
        panel.add(b1);
        panel.add(label4);
        panel.add(numsearch);
        panel.add(blank3);
        panel.add(b2);
        panel.add(label5);
        panel.add(numdel);
        panel.add(blank4);
        panel.add(b3);
        f.pack();
        f.setVisible(true);
  }
}