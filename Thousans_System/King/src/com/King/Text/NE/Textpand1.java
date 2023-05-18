package com.King.Text.NE;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Textpand1 extends JFrame {
	//下部
	JPanel jPanel=new pande1();;
	public Textpand1() {
		setSize(500, 500);
		setLayout(null);
		
		jPanel.setBounds(0, 72, 486, 391);
		add(jPanel);

		Panel panel = new Panel();
		panel.setBounds(10, 7, 453, 59);
		add(panel);

		JButton bt1 = new JButton("bt1");
		panel.add(bt1);
		JButton bt2 = new JButton("bt2");
		panel.add(bt2);
		JButton bt3 = new JButton("bt3");
		panel.add(bt3);
		
		bt1.setBackground(new Color(255,255,255));
		bt2.setBackground(new Color(1,1,1));
		bt3.setBackground(new Color(1,1,1));
		
		chileBut(bt1,bt2,bt3,new pande1());
		chileBut(bt2,bt1,bt3,new pande2());
		chileBut(bt3,bt2,bt1,new pande3());
	}

	public static void main(String[] args) {
		new Textpand1().setVisible(true);
	}
	public void chileBut(JButton but,JButton but2,JButton but3,JPanel p) {

		but.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				but.setBackground(new Color(255,255,255));
				but2.setBackground(new Color(1,1,1));
				but3.setBackground(new Color(1,1,1));
				
				remove(jPanel);
				jPanel=p;
				jPanel.setBounds(0, 72, 486, 391);
				add(jPanel);// panel1添加新的组件
				revalidate();// 对panel1面板中的组件重新布局并绘制
				repaint();// 对panel1本身进行重绘
			}
		});
	}
}
