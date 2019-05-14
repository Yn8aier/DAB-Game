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
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ClientFAce {

	private JFrame frmWelcome;
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
					window.frmWelcome.setVisible(true);
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
		frmWelcome = new JFrame();
		frmWelcome.setTitle("WELCOME");
		frmWelcome.getContentPane().setBackground(Color.WHITE);
		frmWelcome.setBounds(100, 100, 700, 517);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcome.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(290, 143, 252, 35);
		frmWelcome.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(290, 206, 252, 35);
		textField_1.setColumns(10);
		frmWelcome.getContentPane().add(textField_1);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(136, 271, 153, 37);
		frmWelcome.getContentPane().add(btnLogIn);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(385, 271, 153, 37);
		frmWelcome.getContentPane().add(btnRegister);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 674, 446);
		frmWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAccount = new JLabel("Account");
		lblAccount.setBounds(157, 149, 84, 29);
		panel.add(lblAccount);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(145, 209, 108, 29);
		panel.add(lblPassword);
	}
}
