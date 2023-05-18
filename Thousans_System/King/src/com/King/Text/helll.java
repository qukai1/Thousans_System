package com.King.Text;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
@SuppressWarnings("serial")
public class helll extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helll frame = new helll();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public helll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1100);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 31, 1000, 1000);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		for (int i = 0; i < 20; i++) {

			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(12,123,233));
			panel.add(panel_1);
			JLabel jLabel = new JLabel(i+"");
			panel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					JOptionPane.showMessageDialog(panel_1, jLabel.getText());
				}
			});
			panel_1.add(jLabel);
		}
		
		JButton btnNewButton = new JButton("\u9996\u9875");
		btnNewButton.setBounds(0, 10, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4E2A\u4EBA\u4FE1\u606F");
		btnNewButton_1.setBounds(107, 10, 93, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(210, 10, 93, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1.setBounds(310, 10, 93, 23);
		contentPane.add(btnNewButton_1_1_1);
	
	}
}
