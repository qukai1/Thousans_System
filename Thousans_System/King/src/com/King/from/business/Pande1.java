package com.King.from.business;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * 菜单管理
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande1 extends JPanel {
	//右边面板
	JPanel rigt=new JPanel();
	//左边面板
	JPanel lefe = new JPanel();
	public Pande1() {
		setLayout(null);
		//默认Pande1_right1()
		rigt=new Pande1_right1();
		rigt.setBounds(195,0, 1397, 925);
		add(rigt);
		
		lefe.setBackground(new Color(255,140,0));
		lefe.setBounds(0,0, 196, 935);
		lefe.setLayout(null);
		add(lefe);

		JButton button1 = new JButton("菜单新增");
		button1.setBounds(0, 0, 196, 80);
		JButton button2 = new JButton("菜单修改");
		button2.setBounds(0, 79, 196, 80);
		
		buttonnStyle(button1,button2);
		UIManager.put("ToolBar.isPaintPlainBackground", Boolean.TRUE);
	}
	/**
	 * 按钮点击事件
	 */
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
					if(button.equals("菜单新增")) {
						rigt=new Pande1_right1();
					}else{
						rigt=new Pande1_right2();
					}
					rigt.setBounds(195,0, 1397, 925);
					add(rigt);
					rigt.revalidate();
					rigt.repaint();
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
		chileBut(button1);
		for (JButton button : button1) {
			button.setFont(new Font("微软雅黑", Font.BOLD, 25));
			lefe.add(button);
		}
	}
}
