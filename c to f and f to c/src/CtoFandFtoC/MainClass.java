package CtoFandFtoC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass implements ActionListener {
    JTextField tf1,tf3;
    JButton b1,b2;
    MainClass(){
        JFrame f= new JFrame("Converter");
        tf1=new JTextField();
        tf1.setBounds(50,50,200,50);
        tf3=new JTextField();
        tf3.setBounds(50,150,200,50);
        tf3.setEditable(false);
        b1=new JButton("C to F");
        b1.setBounds(50,100,75,50);
        b2=new JButton("F to C");
        b2.setBounds(175,100,75,50);
        b1.addActionListener(this);
        b2.addActionListener(this);


        f.add(tf1);

        f.add(tf3);
        f.add(b1);
        f.add(b2);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed( ActionEvent e) {
       double s1= Double.parseDouble(tf1.getText());

        double a=Double.parseDouble(String.valueOf(s1));

        double c=0;
        if(e.getSource()==b1){
            c=(double)((a*1.8)+32);
        }
       else if(e.getSource()==b2){
            c=(double) ((a-32)*0.5);
        }

        String result=String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String[] args) {

        new MainClass();
    } }