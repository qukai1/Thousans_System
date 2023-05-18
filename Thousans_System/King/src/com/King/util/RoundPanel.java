package com.King.util;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class RoundPanel extends JPanel {
 
private static final long serialVersionUID = 1L;
 
	public RoundPanel () {
		super();
		setOpaque(true);
		setSize(245, 172);
		setBackground(Color.white);
	}
 
	@Override
	public void paint(Graphics g) {
		int fieldX = 0;
		int fieldY = 0;
		int fieldWeight = getSize().width;
		int fieldHeight = getSize().height;
		RoundRectangle2D rect = new RoundRectangle2D.Double(fieldX, fieldY, fieldWeight, fieldHeight, 40, 40);
		g.setClip(rect);
		super.paint(g);
	}
 
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ô²½ÇÃæ°å");
		frame.setLayout(null);
		frame.setBounds(500, 300, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RoundPanel panel = new RoundPanel ();
		JLabel nameLabel = new JLabel("Ô²½ÇÃæ°å", JLabel.CENTER);
		nameLabel.setForeground(Color.black);
		nameLabel.setBounds(0, 0, 300, 500);
		nameLabel.setAlignmentY(0.1f);
		panel.add(nameLabel);
		panel.setLocation(100, 100);
		frame.add(panel);
		frame.setVisible(true);
	}
}