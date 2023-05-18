package com.King.Text;

import java.awt.*;

import javax.swing.*;

public class dsada{

	public JPanel createContentPane() {

		JPanel panel = new JPanel();

		JButton button1, button2, button3, button4;

		JPanel mainPanel = new JPanel(new GridLayout(2, 0, 40, 10));

//JPanel red = createSquareJPanel(Color.red, 50);

		button1 = new JButton("button1");

		button2 = new JButton("button2");

		button3 = new JButton("button3");

		button4 = new JButton("button4");

		Label one = new Label("Rohihtjthjhtjghjghmgfjgjghjghj");

//add(button1);

		mainPanel.add(button1);

		mainPanel.add(one);

		mainPanel.add(button2);

		mainPanel.add(button3);

		mainPanel.add(button4);

		panel.add(mainPanel);

		panel.setOpaque(true);

		return panel;

	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("GridLayout");

		dsada Display = new dsada();

		frame.setContentPane(Display.createContentPane());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

		frame.setVisible(true);

	}

}
