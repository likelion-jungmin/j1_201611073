import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalcAreaOfCircle extends JFrame implements ActionListener {
    JTextField tf1;
    JTextField tf2;
    JButton button,button2;
    public void SimpleWindow1() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3)); // row, col
        getContentPane().add(panel);        
        JLabel label1 = new JLabel("반지름");
        tf1 = new JTextField(20);
        button = new JButton("계산");
        button.addActionListener(this);
        JLabel label2 = new JLabel("면적");
        tf2 = new JTextField(20);
        button2 = new JButton("취소");
        button2.addActionListener(this);              
        panel.add(label1);
        panel.add(tf1);
        panel.add(label2);
        panel.add(tf2);
        panel.add(button);
        panel.add(button2);   
    }
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(button)){
            Double r;
            JButton b = (JButton) e.getSource();
            String value = tf1.getText();
            r = Double.parseDouble(value);
            double area = (r*r*Math.PI);
            tf2.setText("" + area);
            b.setText("Done");
          }
          else if (e.getSource().equals(button2)) {
            tf1.setText("");
            tf2.setText("");
          }
    }

    public static void main(String[] args) {
        CalcAreaOfCircle s = new CalcAreaOfCircle();
        s.setTitle("Calc Area Of Circle");
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.SimpleWindow1();
        s.pack();
        s.setVisible(true);
    }
}
