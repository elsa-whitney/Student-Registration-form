import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration {
    public static void main(String[] args){

        //create the frame (window)
        JFrame frame = new JFrame("Student Registration form");

        //create labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel1 = new JLabel("Age: ");
        JLabel courseLabel1 = new JLabel("Course");

        //create text fields

        JTextField nameField = new JTextField(15);
        JTextField ageField = new JTextField(15);
        JTextField courseField = new JTextField(15);

        //create button
        JButton registerButton = new JButton("Register");

        //create panel

        JPanel panel = new JPanel();

        //set layout (Gridlayout: 4 rows, 2 columns)
        panel.setLayout(new GridLayout(0,2));

        //add components to panel
        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(ageLabel1);
        panel.add(ageField);

        panel.add(courseLabel1);
        panel.add(courseField);

        panel.add(new JLabel(""));
        panel.add(registerButton);
        frame.add(panel);
        frame.setSize(400,250);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        registerButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String course = courseField.getText();

                JOptionPane.showMessageDialog(frame, "Student Registered!\nName: " + name + "\nAge: " + age+ "\nCourse:" + course);

            }
        }
    );
    }
}
