package com.sd.address;

import java.awt.*;
import javax.swing.*;

public class AddressGUIMain {
public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel panel=new JPanel(new GridLayout(8,2));
        f.getContentPane().add(panel);
        JLabel label1=new JLabel("연락처 추가");
        JLabel label2=new JLabel("이름");
        JLabel label3=new JLabel("전화번호");
        JLabel label4=new JLabel("연락처 검색");
        JLabel label5=new JLabel("연락처 삭제");
        JLabel label6=new JLabel("정보");
        JLabel blank1=new JLabel(" ");
        JLabel blank2=new JLabel(" ");
        JLabel blank3=new JLabel(" ");
        JLabel blank4=new JLabel(" ");
        JTextField name=new JTextField(20);
        JTextField phonenum=new JTextField(20);
        JTextField numsearch=new JTextField(20);
        JTextField numdel=new JTextField(20);
        JButton b1=new JButton("등록");
        JButton b2=new JButton("검색");
        JButton b3=new JButton("삭제");
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