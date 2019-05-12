package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;

public class ClientFAce {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ClientFAce window = new ClientFAce();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ClientFAce() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBounds(100, 100, 711, 452);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(290, 143, 252, 35);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JTextPane txtpnAcount = new JTextPane();
        txtpnAcount.setText("Account");
        txtpnAcount.setBounds(147, 143, 96, 35);
        frame.getContentPane().add(txtpnAcount);

        JTextPane txtpnPassword = new JTextPane();
        txtpnPassword.setText("Password");
        txtpnPassword.setBounds(147, 206, 104, 35);
        frame.getContentPane().add(txtpnPassword);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(290, 206, 252, 35);
        frame.getContentPane().add(textField_1);

        JButton btnLogIn = new JButton("Log In");
        btnLogIn.setBounds(136, 271, 153, 37);
        frame.getContentPane().add(btnLogIn);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(385, 271, 153, 37);
        frame.getContentPane().add(btnRegister);
    }
}
