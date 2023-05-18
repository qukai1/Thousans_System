package com.King.Text.NE;

import javax.swing.JPanel;

import java.awt.Panel;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class pande1 extends JPanel {
	JPanel rigt;
	public pande1() {
		rigt = new Pande1_right1();
		rigt.setBounds(83, 5, 357, 295);
		add(rigt);
		JPanel lefe = new JPanel();
		setLayout(null);
		lefe.setBackground(Color.CYAN);
		lefe.setBounds(0, 5, 85, 300);
		add(lefe);

		JButton bt1 = new JButton("bt1");
		lefe.add(bt1);

		JButton bt2 = new JButton("bt2");
		lefe.add(bt2);

		JButton bt3 = new JButton("bt3");
		lefe.add(bt3);
		
		bt1.setBackground(new Color(255, 255, 255));
		bt2.setBackground(new Color(1, 1, 1));
		bt3.setBackground(new Color(1, 1, 1));
		
		chileBut(bt1, bt2, bt3, new Pande1_right1());
		chileBut(bt2, bt1, bt3, new Pande1_right2());
		chileBut(bt3, bt1, bt2, new Pande1_right3());
	}

	public void chileBut(JButton but, JButton but2, JButton but3, JPanel newRight) {
		but.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				but.setBackground(new Color(255, 255, 255));
				but2.setBackground(new Color(1, 1, 1));
				but3.setBackground(new Color(1, 1, 1));

				remove(rigt);
				newRight.setBounds(83, 5,1000, 1000);
				rigt = newRight;
				add(rigt);
				revalidate();// 对panel1面板中的组件重新布局并绘制
				repaint();// 对panel1本身进行重绘
			}
		});
	}
}
