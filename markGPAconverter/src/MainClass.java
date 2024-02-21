

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainClass implements ActionListener {
    JTextField tf1,tf3;
    JButton b1,b2;
    MainClass(){
        JFrame f= new JFrame("Converter");
        tf1=new JTextField();
        tf1.setBounds(50,50,250,50);
        tf3=new JTextField();
        tf3.setBounds(50,150,250,50);
        tf3.setEditable(false);
        b1=new JButton("M to GPA");
        b1.setBounds(50,100,120,50);
        b2=new JButton("GPA to M");
        b2.setBounds(175,100,125,50);
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
    @Override
    public void actionPerformed( ActionEvent e) {

        if(e.getSource()==b1){
            double a= Double.parseDouble(tf1.getText());
            if(a>=0.00 && a<=100){
                if(a>=80.00 && a<=100){
                    tf3.setText("4.00");
                }

                if(a>=75.00 && a<80.00){
                    tf3.setText("3.75");
                }
                if(a>=70.00 && a<75.00){
                    tf3.setText("3.50");
                }
                if(a>=65.00 && a<70.00){
                    tf3.setText("3.25");
                }
                if(a>=60.00 && a<65.00){
                    tf3.setText("3.00");
                }
                if(a>=55.00 && a<60.00){
                    tf3.setText("2.75");
                }
                if(a>=50.00 && a<55.00){
                    tf3.setText("2.50");
                }
                if(a>=45.00 && a<50.00){
                    tf3.setText("2.25");
                }
                if(a>=40.00 && a<45.00){
                    tf3.setText("2.00");
                }
                if(a>=0.00 && a<40.00){
                    tf3.setText("Fail");

                }


            }
else{ tf3.setText("Invalid  Input");
}


        }

         if(e.getSource()==b2){
             double a= Double.parseDouble(tf1.getText());
             if(a>=0.00 && a<=4.00){
                 if(a==4.00){
                     tf3.setText("80-100");
                 }

                 if(a>=3.75 && a<4.00){
                     tf3.setText("75-80");
                 }
                 if(a>=3.50 && a<3.75){
                     tf3.setText("70-75");
                 }
                 if(a>=3.25 && a<3.50){
                     tf3.setText("65-70");
                 }
                 if(a>=3.00 && a<3.25){
                     tf3.setText("60-65");
                 }
                 if(a>=2.75 && a<3.00){
                     tf3.setText("55-60");
                 }
                 if(a>=2.50 && a<2.75){
                     tf3.setText("50-55");
                 }
                 if(a>=2.25 && a<2.50){
                     tf3.setText("45-50");
                 }
                 if(a>=2.00 && a<2.25){
                     tf3.setText("40-45");
                 }
                 if(a>=0.00 && a<2.00){
                     tf3.setText("Fail");

                 }


             }
             else{ tf3.setText("Invalid  Input"); }

        }


    }
    public static void main(String[] args) {

        new MainClass();
    } }
