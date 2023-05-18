package com.King.from.business1;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * 个人信息模块
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande3 extends JPanel {
	//右边面板
	JPanel rigt=new Pande3_right1();
	//左边面板
	JPanel lefe = new JPanel();
	public Pande3() {
		setLayout(null);
		//默认Pande1_right1()
		rigt.setBounds(195,0, 1397, 925);
		add(rigt);
		
		lefe.setBackground(new Color(255,140,0));
		lefe.setBounds(0,0, 196, 930);
		lefe.setLayout(null);
		add(lefe);

		JButton button1 = new JButton("修改信息");
		button1.setBounds(0, 0, 196, 80);

		JButton button2 = new JButton("修改密码");
		button2.setBounds(0, 79, 196, 80);
		
		buttonnStyle(button1,button2);
		button1.setBackground(new Color(0, 51, 153,100));

		chileBut(button1, new Pande3_right1(),button2);
		chileBut(button2, new Pande3_right2(),button1);
	}
	/**
	 *按钮点击事件
	 * @param chileBut 点击按钮
	 * @param newRight 点击按钮对应右边面板
	 * @param button 其他按钮对应默认颜色
	 */
	public void chileBut(JButton chileBut,JPanel newRight,JButton...button) {
		chileBut.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				remove(rigt);
				rigt =newRight;
				rigt.setBounds(195,0, 1397, 925);
				add(rigt);
				revalidate();
				repaint();
			}
		});
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
