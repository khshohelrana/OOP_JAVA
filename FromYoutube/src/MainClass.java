


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class MainClass {
    private JFrame frame;
    private JTextField name;
    private JTextField sid;
    private JTextField section;
    private JTextField enrollment;
    private JTable table;

    int row;
    ArrayList<Student> studentList;
    DefaultTableModel dtm;
    String header[]= new String[]{"Student Name","Student ID","Section","Enrollment"};


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainClass window = new MainClass();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void displayStudentDetails(){
        dtm.setRowCount(0);
        for(int i=0; i<studentList.size();i++){
            Object[] obj={studentList.get(i).name,studentList.get(i).sid,studentList.get(i).section,studentList.get(i).enrollment};
            dtm.addRow(obj);
        }
    }

    /**
     * Create the application.
     */
    public MainClass() {
        initialize();
        studentList=new ArrayList<>();
        dtm=new DefaultTableModel(header,0);
        table.setModel(dtm);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();

        frame.setBounds(100, 100, 1079, 546);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblStudentName = new JLabel("Student Name");
        lblStudentName.setForeground(new Color(0, 0, 128));

        lblStudentName.setBounds(29, 29, 102, 26);
        frame.getContentPane().add(lblStudentName);

        name = new JTextField();
        name.setBounds(127, 35, 111, 20);
        frame.getContentPane().add(name);
        name.setColumns(10);

        JLabel lblStudentId = new JLabel("Student ID");
        lblStudentId.setForeground(new Color(0, 0, 128));

        lblStudentId.setBounds(29, 66, 102, 26);
        frame.getContentPane().add(lblStudentId);

        sid = new JTextField();
        sid.setColumns(10);
        sid.setBounds(127, 72, 111, 20);
        frame.getContentPane().add(sid);

        JLabel lblSection = new JLabel("Section");
        lblSection.setForeground(new Color(0, 0, 128));

        lblSection.setBounds(29, 103, 102, 26);
        frame.getContentPane().add(lblSection);

        section = new JTextField();
        section.setColumns(10);
        section.setBounds(127, 109, 111, 20);
        frame.getContentPane().add(section);

        JLabel lblEnrollment = new JLabel("Enrollment");
        lblEnrollment.setForeground(new Color(0, 0, 128));

        lblEnrollment.setBounds(29, 140, 102, 26);
        frame.getContentPane().add(lblEnrollment);

        enrollment = new JTextField();
        enrollment.setColumns(10);
        enrollment.setBounds(127, 146, 111, 20);
        frame.getContentPane().add(enrollment);

        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Student data=new Student(name.getText(),sid.getText(),section.getText(),enrollment.getText());
                studentList.add(data);
                displayStudentDetails();
            }
        });

        btnAdd.setBounds(29, 194, 89, 23);
        frame.getContentPane().add(btnAdd);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice=JOptionPane.showConfirmDialog(null, "Delete this data ?", "Delete",JOptionPane.YES_NO_OPTION);
                if(choice==0){
                    dtm.removeRow(row);
                    studentList.remove(row);
                    displayStudentDetails();
                }

            }
        });

        btnDelete.setBounds(142, 194, 89, 23);
        frame.getContentPane().add(btnDelete);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentList.get(row).name=name.getText();
                studentList.get(row).sid=sid.getText();
                studentList.get(row).section=section.getText();
                studentList.get(row).enrollment=enrollment.getText();
                displayStudentDetails();
            }
        });

        btnUpdate.setBounds(29, 232, 89, 23);
        frame.getContentPane().add(btnUpdate);

        JButton btnRefresh = new JButton("Refresh");
        btnRefresh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                name.setText("");
                sid.setText("");
                section.setText("");
                enrollment.setText("");
            }
        });

        btnRefresh.setBounds(142, 232, 89, 23);
        frame.getContentPane().add(btnRefresh);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(279, 36, 737, 339);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                row=table.getSelectedRow();

                name.setText(dtm.getValueAt(row, 0).toString());
                sid.setText(dtm.getValueAt(row, 1).toString());
                section.setText(dtm.getValueAt(row, 2).toString());
                enrollment.setText(dtm.getValueAt(row, 3).toString());

            }
        });
        scrollPane.setViewportView(table);
    }

}