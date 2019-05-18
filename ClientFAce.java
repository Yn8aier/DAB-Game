package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ClientFAce {

	public static JFrame frmWelcome;
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
					ClientFAce window = new ClientFAce();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void openClientFace() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 674, 446);
		frmWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAccount = new JLabel("Account");
		lblAccount.setFont(new Font("Ink Free", Font.BOLD, 36));
		lblAccount.setBounds(118, 198, 151, 29);
		panel.add(lblAccount);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.BOLD, 34));
		textField.setBounds(308, 197, 252, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("宋体", Font.PLAIN, 32));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.addActionListener(new ActionListener() {
			void run() {
				frmWelcome.dispose();
				Register.openRegister();
			}
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnRegister) {
					new Thread(()->run()).start();
				}
			}
		});
		btnRegister.setBounds(388, 333, 184, 37);
		panel.add(btnRegister);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("宋体", Font.PLAIN, 32));
		btnLogIn.setBackground(Color.LIGHT_GRAY);
		btnLogIn.setBounds(118, 333, 192, 37);
		panel.add(btnLogIn);
		btnLogIn.addActionListener(new ActionListener() {
			void run() {
				frmWelcome.dispose();
				GamemodeSelect.OpenModeSelect();
			}
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnLogIn) {
					ID = textField.getText().trim();
					PW = textField_1.getText().trim();
					new Thread(()->run()).start();
				}
			}
		});
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Ink Free", Font.BOLD, 36));
		lblPassword.setBounds(118, 264, 169, 29);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.BOLD, 34));
		textField_1.setBounds(308, 263, 252, 35);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		String path = "";
		try {
			path = directory.getCanonicalPath();
			path = path.replaceAll("\\\\","\\\\\\\\");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon(path + "\\Logo.png"));
		label.setBounds(111, -52, 727, 289);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setIcon(new ImageIcon(path + "\\BA.jpg"));
		lblNewLabel.setBounds(0, 0, 727, 446);
		panel.add(lblNewLabel);
	}
}
