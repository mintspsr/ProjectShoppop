package Shopop2;

import java.awt.*;
import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Start {

	private JFrame start;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.start.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		start = new JFrame();
		start.setBounds(450, 30, 650, 750);
		start.setResizable(false);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.getContentPane().setLayout(null);
		
		JButton StartButton = new JButton("Start");
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		StartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				shoppop sfd = new shoppop();
				sfd.Shoppop.setVisible(true);
				start.dispose();
			}
		});
		
		
		StartButton.setForeground(new Color(255, 255, 240));
		StartButton.setBackground(new Color(250, 128, 114));
		StartButton.setFont(new Font("Cooper Black", Font.BOLD, 40));
		StartButton.setBounds(230, 273, 174, 59);
		start.getContentPane().add(StartButton);
		
		JLabel title = new JLabel("Shop-pop");
		title.setBackground(new Color(205, 92, 92));
		title.setForeground(new Color(205, 92, 92));
		title.setFont(new Font("Cooper Black", Font.PLAIN, 70));
		title.setBounds(148, 138, 358, 81);
		start.getContentPane().add(title);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Start.class.getResource("/images/bg2.png")));
		background.setBounds(0, 0, 636, 713);
		start.getContentPane().add(background);
		
	}
}

