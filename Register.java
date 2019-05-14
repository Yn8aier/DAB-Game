package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Register {

	private JFrame frmRegister;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frmRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setTitle("Register");
		frmRegister.getContentPane().setBackground(Color.WHITE);
		frmRegister.setBounds(100, 100, 700, 517);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegister.getContentPane().setLayout(null);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setText("Your ID:");
		txtpnId.setBounds(55, 205, 135, 41);
		frmRegister.getContentPane().add(txtpnId);
		
		textField = new JTextField();
		textField.setBounds(194, 211, 309, 35);
		frmRegister.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnYourPw = new JTextPane();
		txtpnYourPw.setText("Your PW:");
		txtpnYourPw.setBounds(55, 267, 135, 41);
		frmRegister.getContentPane().add(txtpnYourPw);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(194, 273, 309, 35);
		frmRegister.getContentPane().add(textField_1);
		
		JButton btnOkIFinish = new JButton("OK! I finish!");
		btnOkIFinish.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		btnOkIFinish.setBounds(118, 343, 153, 37);
		frmRegister.getContentPane().add(btnOkIFinish);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		btnExit.setBounds(375, 341, 153, 37);
		frmRegister.getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 674, 446);
		frmRegister.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblHiOYou = new JLabel("Hi~ o(*\uFFE3\u25BD\uFFE3*)\u30D6, you may not have an account ");
		lblHiOYou.setBounds(60, 121, 564, 29);
		panel.add(lblHiOYou);
		
		JLabel lblFollowTheInstructions = new JLabel("Follow the instructions to creat one.");
		lblFollowTheInstructions.setBounds(102, 160, 551, 29);
		panel.add(lblFollowTheInstructions);
	}
}
