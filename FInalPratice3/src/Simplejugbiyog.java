import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simplejugbiyog implements ActionListener {

JTextField jt1,jt2;
JButton jb1,jb2;
    Simplejugbiyog(){

JFrame f=new JFrame("Simplejugbiyog");
        jt1=new JTextField();
        jt1.setBounds(50, 50,50,50);
        jt2=new JTextField();
        jt2.setBounds(100,50,50,50);
        jt2.setEditable(false);
        jb1=new JButton("+");
        jb1.setBounds(50,110,50,50);
        jb2=new JButton("-");
        jb2.setBounds(100,110,50,50);
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        f.add(jt1);
        f.add(jt2);
        f.add(jb1);
        f.add(jb2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

double a=Double.parseDouble(jt1.getText());
double b=Double.parseDouble(String.valueOf(a));
double c=0;
if(e.getSource()==jb1){

   c=b+5;

}
else if(e.getSource()==jb2){

     c=b+10;

}
        String result=String.valueOf(c);
        jt2.setText(result);
    }

    public static void main(String[] args) {
        new Simplejugbiyog();
    }
}
