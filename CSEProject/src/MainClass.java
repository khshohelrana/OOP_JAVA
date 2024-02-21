

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass implements ActionListener {
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    JTextArea tf9;
    JButton b1,b2;
    MainClass(){
        JFrame f= new JFrame("Employee Management System");


        tf1=new JTextField("1.Add Employee's information");
        tf1.setBounds(50,20,220,30);
        tf1.setEditable(false);




        tf2=new JTextField("2.Search Employee's information");
        tf2.setBounds(50,50,220,30);
        tf2.setEditable(false);

        tf3=new JTextField("3.Update Employee's information");
        tf3.setBounds(50,80,220,30);
        tf3.setEditable(false);

        tf4=new JTextField("4.Delete Employee's information");
        tf4.setBounds(50,110,220,30);
        tf4.setEditable(false);

        tf5=new JTextField("5.Display Employee's information List");
        tf5.setBounds(50,140,220,30);
        tf5.setEditable(false);

        tf6=new JTextField("6.Exit");
        tf6.setBounds(50,170,220,30);
        tf6.setEditable(false);

        tf7=new JTextField();
        tf7.setBounds(50,200,220,30);

        b1=new JButton("Enter");
        b1.setBounds(110,230,100,50);
        tf8=new JTextField();
        tf8.setBounds(50,280,220,30);
        tf9= new JTextArea();
        tf9.setBounds(50,310,300,100);
        tf9.setEditable(true);

        //b2=new JButton("Press for 2");
       // b2.setBounds(50,200,200,50);
        b1.addActionListener(this);
       // b2.addActionListener(this);


        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(tf6);
        f.add(tf7);
       // f.add(tf8);
        //f.add(tf9);
        f.add(b1);


        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);


    }
    public void actionPerformed( ActionEvent e) {
        double s1= Double.parseDouble(tf7.getText());


        if(e.getSource()==b1){

            if(s1==1) {


                tf8.setText(tf7.getText());
                }
              else if (s1==2){
                    JFrame f2= new JFrame("Search Employee's information");
                    f2.setSize(500,500);
                    f2.setLayout(null);
                    f2.setVisible(true);
                    tf8.setText(tf7.getText());
                 }
            else if (s1==3){
                JFrame f3= new JFrame("Update Employee's information");
                f3.setSize(500,500);
                f3.setLayout(null);
                f3.setVisible(true);
                tf8.setText(tf7.getText());
            }
            else if (s1==4){
                JFrame f4= new JFrame("Delete Employee's information");
                f4.setSize(500,500);
                f4.setLayout(null);
                f4.setVisible(true);
                tf8.setText(tf7.getText());
            }
            else if (s1==5){
                JFrame f5= new JFrame("Display Employee's information List");
                f5.setSize(500,500);
                f5.setLayout(null);
                f5.setVisible(true);
                tf8.setText(tf7.getText());
            }
            else if (s1==6){
                JFrame f6= new JFrame("Empty");
                f6.setSize(500,500);
                f6.setLayout(null);
                f6.setVisible(true);
                tf8.setText(tf7.getText());
            }









        }


//        String result=String.valueOf(c);
//        tf2.setText(result);
    }




    public static void main(String[] args) {

        new MainClass();

        //StructClass first= new StructClass();
    } }