
import java.awt.event.*;
import javax.swing.*;

public class Studentregistration extends JFrame implements ActionListener {

    //labels
    JLabel lblname, lblRoll, lblGender, lblBranch;

    //textfields
    JTextField txtName, txtRoll, txtBranch;

    //radio buttons
    JRadioButton male, female;
    ButtonGroup genderGroup;

    //checkbox
    JCheckBox terms;

    //buttons
    JButton submit, reset;

    //constructor
    public Studentregistration() {
        setTitle("Student Registration form");
        setSize(450, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // student name
        lblname = new JLabel("Student Name");
        lblname.setBounds(30, 30, 120, 30);
        add(lblname);

        txtName = new JTextField();
        txtName.setBounds(170, 30, 180, 30);
        add(txtName);

        //Roll number
        lblRoll = new JLabel("Roll Number");
        lblRoll.setBounds(30, 80, 120, 30);
        add(lblRoll);

        txtRoll = new JTextField();
        txtRoll.setBounds(170, 80, 180, 30);
        add(txtRoll);

        //gender
        lblGender = new JLabel("Gender");
        lblGender.setBounds(30, 130, 120, 30);
        add(lblGender);

        male = new JRadioButton("Male");
        male.setBounds(170, 130, 80, 30);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(260, 130, 100, 30);
        add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        //branch
        lblBranch = new JLabel("Branch");
        lblBranch.setBounds(30, 180, 120, 30);
        add(lblBranch);

        txtBranch = new JTextField();
        txtBranch.setBounds(170, 180, 180, 30);
        add(txtBranch);

        //terms and conditions
        terms = new JCheckBox("I Accept Terms & Conditions");
        terms.setBounds(30, 230, 250, 30);
        add(terms);

        //submit button
        submit = new JButton("Submit");
        submit.setBounds(80, 290, 100, 35);
        submit.addActionListener(this);
        add(submit);

        //reset button
        reset = new JButton("Reset");
        reset.setBounds(220, 290, 100, 35);
        reset.addActionListener(this);
        add(reset);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //reset button
        if (e.getSource() == reset) {
            txtName.setText("");
            txtRoll.setText("");
            txtBranch.setText("");

            genderGroup.clearSelection();
            terms.setSelected(false);
            return;

        }
        //submit button
        if (txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter student name");
            return;
        }
        if (txtRoll.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please select Roll Number");
            return;
        }
        if (!male.isSelected() && !female.isSelected()) {
            JOptionPane.showMessageDialog(this, "please select Gender");
            return;

        }
        if (txtBranch.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Branch");
            return;

        }
        if (!terms.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please accept terms and conditions");
            return;

        }
        String gender = male.isSelected() ? "Male" : "Female";
        JOptionPane.showMessageDialog(this, "Registration Successfull\n\n"
                + "Name:" + txtName.getText()
                + "\nRoll Number:" + txtRoll.getText()
                + "\nGender:" + gender
                + "\nBranch:" + txtBranch.getText());
    }

    public static void main(String[] args) {
        new Studentregistration();
    }

}
