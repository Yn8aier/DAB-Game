package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Register {

	private JFrame frmRegister;
	private JTextField textField;
	private JTextField textField_1;
	private File directory = new File("");
	private String ID = "";
	private String PW = "";

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
	
	public static void openRegister() {
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
		frmRegister.setBounds(100, 100, 756, 553);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegister.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 730, 482);
		frmRegister.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 32));
		textField.setBounds(310, 235, 309, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 32));
		textField_1.setBounds(310, 308, 309, 35);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOkIFinish = new JButton("OK! I finish!");
		btnOkIFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = textField.getText().trim();
				PW = textField_1.getText().trim();
			}
		});
		btnOkIFinish.setBackground(Color.LIGHT_GRAY);
		btnOkIFinish.setForeground(Color.BLACK);
		btnOkIFinish.setBounds(125, 381, 177, 46);
		panel.add(btnOkIFinish);
		btnOkIFinish.setFont(new Font("Dialog", Font.PLAIN, 26));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnExit) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(423, 381, 158, 46);
		panel.add(btnExit);
		btnExit.setFont(new Font("Dialog", Font.PLAIN, 32));
		
		JLabel lblHiOYou = new JLabel("Hi player , you may not have an account ");
		lblHiOYou.setFont(new Font("Ink Free", Font.BOLD, 34));
		lblHiOYou.setBounds(43, 72, 752, 87);
		panel.add(lblHiOYou);
		
		JLabel lblFollowSomeSteps = new JLabel("Follow some steps to create one!");
		lblFollowSomeSteps.setFont(new Font("Ink Free", Font.BOLD, 34));
		lblFollowSomeSteps.setBounds(75, 140, 752, 87);
		panel.add(lblFollowSomeSteps);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setOpaque(false);
		txtpnId.setBounds(114, 226, 190, 41);
		panel.add(txtpnId);
		txtpnId.setFont(new Font("Ink Free", Font.BOLD, 34));

		txtpnId.setText("Your ID:");
		
		JTextPane txtpnYourPw = new JTextPane();
		txtpnYourPw.setOpaque(false);
		txtpnYourPw.setBounds(115, 302, 177, 41);
		panel.add(txtpnYourPw);
		txtpnYourPw.setFont(new Font("Ink Free", Font.BOLD, 34));
		txtpnYourPw.setText("Password:");
		
		String path = "";
		try {
			path = directory.getCanonicalPath();
			path = path.replaceAll("\\\\","\\\\\\\\");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JLabel Background = new JLabel(" ");
		Background.setIcon(new ImageIcon(path + "\\BA.jpg"));
		Background.setBounds(-51, 0, 781, 482);
		panel.add(Background);
	}
}
