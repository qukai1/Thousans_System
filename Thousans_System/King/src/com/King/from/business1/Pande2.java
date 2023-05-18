package com.King.from.business1;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * 订单管理模块
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande2 extends JPanel {
	//右边面板
	JPanel rigt=new JPanel();
	//左边面板
	JPanel lefe = new JPanel();
	public Pande2() {
		setLayout(null);
		//rigt默认Pande1_right1()
		rigt=new Pande2_right1();
		rigt.setBounds(195,0, 1397, 925);
		add(rigt);
		
		lefe.setBackground(new Color(255,140,0));
		lefe.setBounds(0,0, 196, 930);
		lefe.setLayout(null);
		add(lefe);

		JButton button1 = new JButton("确认订单");
		button1.setBounds(0, 0, 196, 80);

		JButton button2 = new JButton("确认派送");
		button2.setBounds(0, 79, 196, 80);

		JButton button3 = new JButton("正在派送");
		button3.setBounds(0, 158, 196, 80);
		
		JButton button4 = new JButton("历史订单");
		button4.setBounds(0, 237, 196, 80);
		
		buttonnStyle(button1,button2,button3,button4);
		UIManager.put("ToolBar.isPaintPlainBackground", Boolean.TRUE);
		chileBut(button1,button2,button3,button4);
	}
	/**
	 *按钮点击事件
	 * @param chileBut 点击按钮
	 * @param newRight 点击按钮对应右边面板
	 * @param button 其他按钮对应默认颜色
	 */
	public void chileBut(JButton...button) {
		for (JButton jButton : button) {
			jButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					remove(rigt);
					String button=jButton.getText();
					if(button.equals("历史订单")) {
						rigt=new Pande2_right4();
					}else if(button.equals("正在派送")) {
						rigt=new Pande2_right3();
					}else if(button.equals("确认派送")) {
						rigt=new Pande2_right2();
					}else {
						rigt=new Pande2_right1();
					}
					rigt.setBounds(195,0, 1397, 925);
					add(rigt);
					rigt.revalidate();
					rigt.revalidate();
					revalidate();
					repaint();
				}
			});
		}
	}
	/**
	 * 按钮共同样式
	 */
	public void buttonnStyle(JButton...button1) {
		for (JButton button : button1) {
			button.setFont(new Font("微软雅黑", Font.BOLD, 25));
			button.setBackground(Color.WHITE);
			lefe.add(button);
		}
	}
}
