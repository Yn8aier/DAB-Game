package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GamemodeSelect {

	public static JFrame frmSelectGameMode;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private boolean huhu = false;
	private boolean huma = false;
	private boolean mama = false;
	private boolean three = false;
	private boolean four = false;
	private boolean five = false;
	private boolean six = false;
	private boolean seven = false;
	private boolean god = false;
	public static int gamemode = -1;
	private File directory = new File("");


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

	public static void OpenModeSelect() {
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
	public GamemodeSelect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		frmSelectGameMode = new JFrame();
		frmSelectGameMode.setTitle("Select game mode");
		frmSelectGameMode.setBounds(100, 100, 972, 617);
		frmSelectGameMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectGameMode.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 946, 546);
		frmSelectGameMode.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblYouCanSelect = new JLabel("Select the gamemode!\r\n");
		lblYouCanSelect.setFont(new Font("Ink Free", Font.BOLD, 35));
		lblYouCanSelect.setBounds(48, 205, 431, 60);
		panel.add(lblYouCanSelect);

		JRadioButton rdbtnIWantTo = new JRadioButton("I want to play \r\nwith my friend");
		rdbtnIWantTo.setOpaque(false);
		rdbtnIWantTo.setContentAreaFilled(false);
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
		rdbtnIWantTo.setFont(new Font("Ink Free", Font.BOLD, 30));
		rdbtnIWantTo.setBackground(Color.WHITE);
		rdbtnIWantTo.setBounds(17, 270, 543, 60);
		panel.add(rdbtnIWantTo);

		JRadioButton rdbtnIWantTo_1 = new JRadioButton("I want to play with my lovely PC");
		rdbtnIWantTo_1.setOpaque(false);
		rdbtnIWantTo_1.setContentAreaFilled(false);
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
		rdbtnIWantTo_1.setFont(new Font("Ink Free", Font.BOLD, 30));
		rdbtnIWantTo_1.setBackground(Color.WHITE);
		rdbtnIWantTo_1.setBounds(17, 315, 543, 60);
		panel.add(rdbtnIWantTo_1);

		JRadioButton rdbtnIWantTo_2 = new JRadioButton("I want to see my PC Self-High");
		rdbtnIWantTo_2.setOpaque(false);
		rdbtnIWantTo_2.setContentAreaFilled(false);
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
		rdbtnIWantTo_2.setFont(new Font("Ink Free", Font.BOLD, 30));
		rdbtnIWantTo_2.setBackground(Color.WHITE);
		rdbtnIWantTo_2.setBounds(17, 359, 511, 60);
		panel.add(rdbtnIWantTo_2);

		JRadioButton rdbtnX = new JRadioButton("3 X 3");
		rdbtnX.setOpaque(false);
		rdbtnX.setContentAreaFilled(false);
		rdbtnX.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					three = true;
				}else {
					three = false;
				}
			}
		});
		rdbtnX.setFont(new Font("Ink Free", Font.BOLD, 36));
		buttonGroup_1.add(rdbtnX);
		rdbtnX.setBackground(Color.WHITE);
		rdbtnX.setBounds(573, 294, 139, 37);
		panel.add(rdbtnX);

		JRadioButton rdbtnX_1 = new JRadioButton("4 X 4");
		rdbtnX_1.setOpaque(false);
		rdbtnX_1.setContentAreaFilled(false);
		rdbtnX_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					four = true;
				}else {
					four = false;
				}
			}
		});
		rdbtnX_1.setFont(new Font("Ink Free", Font.BOLD, 36));
		buttonGroup_1.add(rdbtnX_1);
		rdbtnX_1.setBackground(Color.WHITE);
		rdbtnX_1.setBounds(573, 325, 139, 37);
		panel.add(rdbtnX_1);

		JRadioButton rdbtnX_2 = new JRadioButton("5 X 5");
		rdbtnX_2.setOpaque(false);
		rdbtnX_2.setContentAreaFilled(false);
		rdbtnX_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					five = true;
				}else {
					five = false;
				}
			}
		});
		rdbtnX_2.setFont(new Font("Ink Free", Font.BOLD, 36));
		buttonGroup_1.add(rdbtnX_2);
		rdbtnX_2.setBackground(Color.WHITE);
		rdbtnX_2.setBounds(573, 359, 231, 37);
		panel.add(rdbtnX_2);

		JRadioButton rdbtnIAmThe = new JRadioButton("I am the God!");
		rdbtnIAmThe.setOpaque(false);
		rdbtnIAmThe.setContentAreaFilled(false);
		rdbtnIAmThe.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					god = true;
				}else {
					god = false;
				}
			}
		});
		rdbtnIAmThe.setFont(new Font("Ink Free", Font.BOLD, 36));
		rdbtnIAmThe.setEnabled(false);
		buttonGroup_1.add(rdbtnIAmThe);
		rdbtnIAmThe.setBackground(Color.WHITE);
		rdbtnIAmThe.setBounds(573, 393, 293, 37);
		panel.add(rdbtnIAmThe);

		JRadioButton rdbtnX_3 = new JRadioButton("6 X 6\r\n");
		buttonGroup_1.add(rdbtnX_3);
		rdbtnX_3.setOpaque(false);
		rdbtnX_3.setContentAreaFilled(false);
		rdbtnX_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					six = true;
				}else {
					six = false;
				}
			}
		});
		rdbtnX_3.setFont(new Font("Ink Free", Font.BOLD, 36));
		rdbtnX_3.setContentAreaFilled(false);
		rdbtnX_3.setBackground(Color.WHITE);
		rdbtnX_3.setBounds(715, 293, 231, 37);
		panel.add(rdbtnX_3);

		JRadioButton rdbtnX_4 = new JRadioButton("7 X 7");
		buttonGroup_1.add(rdbtnX_4);
		rdbtnX_4.setOpaque(false);
		rdbtnX_4.setContentAreaFilled(false);
		rdbtnX_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					seven = true;
				}else {
					seven = false;
				}
			}
		});
		rdbtnX_4.setFont(new Font("Ink Free", Font.BOLD, 36));
		rdbtnX_4.setContentAreaFilled(false);
		rdbtnX_4.setBackground(Color.WHITE);
		rdbtnX_4.setBounds(715, 327, 231, 37);
		panel.add(rdbtnX_4);

		JLabel lblSelectTheSize = new JLabel("chessboard");
		lblSelectTheSize.setFont(new Font("Ink Free", Font.BOLD, 34));
		lblSelectTheSize.setBounds(564, 201, 704, 126);
		panel.add(lblSelectTheSize);

		JButton btnGameStart = new JButton("New Game");
		btnGameStart.setFont(new Font("宋体", Font.PLAIN, 30));
		btnGameStart.setBackground(Color.LIGHT_GRAY);
		btnGameStart.addActionListener(new ActionListener() {
			void run(){
				if(huhu == false && huma == false && mama == false) {
					JOptionPane.showMessageDialog(null, "You have not choose the game mode", "Oops!", JOptionPane.ERROR_MESSAGE);
				}else if(three == false && four == false && five == false && god == false && six == false && seven == false) {
					JOptionPane.showMessageDialog(null, "You have not choose the gameboard size", "Oops!", JOptionPane.ERROR_MESSAGE);
				}else {

					if(huhu == true && three == true) {
						try {
							GameStart3.gamemode = 2;
							frmSelectGameMode.setVisible(false);
//							kernal3X3_HU_VS_HU.HU_VS_HU();
							GameStart3.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huma == true && three == true) {
						try {
							GameStart3.gamemode = 1;
							frmSelectGameMode.setVisible(false);
							GameStart3.GameStart();

						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(mama == true && three == true) {
						try {
							GameStart3.gamemode = 0;
							frmSelectGameMode.setVisible(false);
							GameStart3.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huhu == true && four == true) {
						try {
							GameStart4.gamemode = 2;
							frmSelectGameMode.setVisible(false);
//							kernal3X3_HU_VS_HU.HU_VS_HU();
							GameStart4.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huma == true && four == true) {
						try {
							GameStart4.gamemode = 1;
							frmSelectGameMode.setVisible(false);
							GameStart4.GameStart();

						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(mama == true && four == true) {
						try {
							GameStart4.gamemode = 0;
							frmSelectGameMode.setVisible(false);
							GameStart4.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huhu == true && five == true) {
						try {
							GameStart5.gamemode = 2;
							frmSelectGameMode.setVisible(false);
//							kernal3X3_HU_VS_HU.HU_VS_HU();
							GameStart5.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huma == true && five == true) {
						try {
							GameStart5.gamemode = 1;
							frmSelectGameMode.setVisible(false);
							GameStart5.GameStart();

						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(mama == true && five == true) {
						try {
							GameStart5.gamemode = 0;
							frmSelectGameMode.setVisible(false);
							GameStart5.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huhu == true && six == true) {
						try {
							GameStart6.gamemode = 2;
							frmSelectGameMode.setVisible(false);
//							kernal3X3_HU_VS_HU.HU_VS_HU();
							GameStart6.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huma == true && six == true) {
						try {
							GameStart6.gamemode = 1;
							frmSelectGameMode.setVisible(false);
							GameStart6.GameStart();

						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(mama == true && six == true) {
						try {
							GameStart6.gamemode = 0;
							frmSelectGameMode.setVisible(false);
							GameStart6.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huhu == true && seven == true) {
						try {
							GameStart7.gamemode = 2;
							frmSelectGameMode.setVisible(false);
//							kernal3X3_HU_VS_HU.HU_VS_HU();
							GameStart7.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(huma == true && seven == true) {
						try {
							GameStart7.gamemode = 1;
							frmSelectGameMode.setVisible(false);
							GameStart7.GameStart();

						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if(mama == true && seven == true) {
						try {
							GameStart7.gamemode = 0;
							frmSelectGameMode.setVisible(false);
							GameStart7.GameStart();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				}
			}

			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnGameStart) {
					new Thread(()->run()).start();
				}
			}
		});
		btnGameStart.setBounds(164, 469, 161, 45);
		panel.add(btnGameStart);

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("宋体", Font.PLAIN, 32));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.addActionListener(new ActionListener() {
			void run() {
				frmSelectGameMode.dispose();;
				ClientFAce.openClientFace();
			}
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack) {
					new Thread(()->run()).start();
				}
			}
		});
		btnBack.setBounds(381, 469, 161, 45);
		panel.add(btnBack);

		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("宋体", Font.PLAIN, 32));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.addActionListener(new ActionListener() {
			void run() {
				System.exit(0);
			}
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnExit) {
					new Thread(()->run()).start();
				}
			}
		});
		btnExit.setBounds(596, 469, 168, 45);
		panel.add(btnExit);

		JLabel label = new JLabel("Select the size of ");
		label.setFont(new Font("Ink Free", Font.BOLD, 34));
		label.setBounds(564, 162, 704, 126);
		panel.add(label);

		String path = "";
		try {
			path = directory.getCanonicalPath();
			path = path.replaceAll("\\\\","\\\\\\\\");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(path + "\\Logo.png"));
		Logo.setBounds(228, -2, 734, 237);
		panel.add(Logo);

		JLabel Background = new JLabel(" ");
		ImageIcon BAckground = new ImageIcon(path + "\\botton_notselected.png");

		Background.setIcon(new ImageIcon(path + "\\BA.jpg"));
		Background.setBounds(0, -2, 946, 546);
		panel.add(Background);
	}
}
