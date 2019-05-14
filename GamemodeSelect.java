package Project;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GamemodeSelect {

	private JFrame frmSelectGameMode;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private boolean huhu = false;
	private boolean huma = false;
	private boolean mama = false;
	private boolean three = false;
	private boolean four = false;
	private boolean five = false;
	private boolean god = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamemodeSelect window = new GamemodeSelect();
					window.frmSelectGameMode.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GamemodeSelect() throws Exception{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception{
		frmSelectGameMode = new JFrame();
		frmSelectGameMode.setTitle("Select game mode");
		frmSelectGameMode.setBounds(100, 100, 899, 517);
		frmSelectGameMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectGameMode.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 884, 446);
		frmSelectGameMode.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblYouCanSelect = new JLabel("Select the gamemode!\r\n");
		lblYouCanSelect.setFont(new Font("宋体", Font.PLAIN, 35));
		lblYouCanSelect.setBounds(17, 51, 390, 60);
		panel.add(lblYouCanSelect);

		JRadioButton rdbtnIWantTo = new JRadioButton("I want to play \r\nwith my friend");
		rdbtnIWantTo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					huhu = true;
				}else {
					huhu = false;
				}
			}
		});
		buttonGroup.add(rdbtnIWantTo);
		rdbtnIWantTo.setFont(new Font("��Բ", Font.PLAIN, 24));
		rdbtnIWantTo.setBackground(Color.WHITE);
		rdbtnIWantTo.setBounds(17, 120, 424, 60);
		panel.add(rdbtnIWantTo);

		JRadioButton rdbtnIWantTo_1 = new JRadioButton("I want to play with my lovely PC");
		rdbtnIWantTo_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					huma = true;
				}else {
					huma = false;
				}
			}
		});
		buttonGroup.add(rdbtnIWantTo_1);
		rdbtnIWantTo_1.setFont(new Font("��Բ", Font.PLAIN, 24));
		rdbtnIWantTo_1.setBackground(Color.WHITE);
		rdbtnIWantTo_1.setBounds(17, 183, 424, 60);
		panel.add(rdbtnIWantTo_1);

		JRadioButton rdbtnIWantTo_2 = new JRadioButton("I want to see my PC Self-High");
		rdbtnIWantTo_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					mama = true;
				}else {
					mama = false;
				}
			}
		});
		buttonGroup.add(rdbtnIWantTo_2);
		rdbtnIWantTo_2.setFont(new Font("��Բ", Font.PLAIN, 24));
		rdbtnIWantTo_2.setBackground(Color.WHITE);
		rdbtnIWantTo_2.setBounds(17, 249, 424, 60);
		panel.add(rdbtnIWantTo_2);

		JRadioButton rdbtnX = new JRadioButton("3 X 3");
		rdbtnX.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					three = true;
				}else {
					three = false;
				}
			}
		});
		rdbtnX.setFont(new Font("宋体", Font.PLAIN, 36));
		buttonGroup_1.add(rdbtnX);
		rdbtnX.setBackground(Color.WHITE);
		rdbtnX.setBounds(503, 128, 231, 37);
		panel.add(rdbtnX);

		JRadioButton rdbtnX_1 = new JRadioButton("4 X 4");
		rdbtnX_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					four = true;
				}else {
					four = false;
				}
			}
		});
		rdbtnX_1.setFont(new Font("宋体", Font.PLAIN, 36));
		buttonGroup_1.add(rdbtnX_1);
		rdbtnX_1.setBackground(Color.WHITE);
		rdbtnX_1.setBounds(503, 171, 231, 37);
		panel.add(rdbtnX_1);

		JRadioButton rdbtnX_2 = new JRadioButton("5 X 5");
		rdbtnX_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					five = true;
				}else {
					five = false;
				}
			}
		});
		rdbtnX_2.setFont(new Font("宋体", Font.PLAIN, 36));
		buttonGroup_1.add(rdbtnX_2);
		rdbtnX_2.setBackground(Color.WHITE);
		rdbtnX_2.setBounds(503, 216, 231, 37);
		panel.add(rdbtnX_2);

		JRadioButton rdbtnIAmThe = new JRadioButton("I am the God!");
		rdbtnIAmThe.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					god = true;
				}else {
					god = false;
				}
			}
		});
		rdbtnIAmThe.setFont(new Font("宋体", Font.PLAIN, 36));
		rdbtnIAmThe.setEnabled(false);
		buttonGroup_1.add(rdbtnIAmThe);
		rdbtnIAmThe.setBackground(Color.WHITE);
		rdbtnIAmThe.setBounds(503, 260, 231, 37);
		panel.add(rdbtnIAmThe);

		JLabel lblSelectTheSize = new JLabel("chessboard");
		lblSelectTheSize.setFont(new Font("宋体", Font.PLAIN, 34));
		lblSelectTheSize.setBounds(458, 36, 704, 126);
		panel.add(lblSelectTheSize);

		JButton btnGameStart = new JButton("Game Start");
		btnGameStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnGameStart) {
					if(huhu == false && huma == false && mama == false) {
						JOptionPane.showMessageDialog(null, "You have not choose the game mode", "Oops!", JOptionPane.ERROR_MESSAGE);
					}else if(three == false && four == false && five == false && god == false) {
						JOptionPane.showMessageDialog(null, "You have not choose the gameboard size", "Oops!", JOptionPane.ERROR_MESSAGE);
					}else {

						if(huhu == true && three == true) {
							try {
								GameStart.gamemode = 2;
								frmSelectGameMode.dispose();
								kernal3X3_HU_VS_HU.HU_VS_HU();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						if(huma == true && three == true) {
							try {
								GameStart.gamemode = 1;
								frmSelectGameMode.dispose();
								kernal3X3_HU_VS_MA.HU_vs_MA();

							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						if(mama == true && three == true) {
							try {
								GameStart.gamemode = 0;
								frmSelectGameMode.dispose();
								kernal3X3_MA_VS_MA.MA_VS_MA();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}

					}
				}
			}
		});
		btnGameStart.setBounds(135, 347, 153, 37);
		panel.add(btnGameStart);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(352, 347, 153, 37);
		panel.add(btnBack);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(574, 347, 153, 37);
		panel.add(btnExit);

		JLabel label = new JLabel("Select the size of ");
		label.setFont(new Font("宋体", Font.PLAIN, 34));
		label.setBounds(458, 0, 704, 126);
		panel.add(label);
	}
}
