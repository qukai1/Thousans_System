package com.King.from.business1;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * ��������ģ��
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande2 extends JPanel {
	//�ұ����
	JPanel rigt=new JPanel();
	//������
	JPanel lefe = new JPanel();
	public Pande2() {
		setLayout(null);
		//rigtĬ��Pande1_right1()
		rigt=new Pande2_right1();
		rigt.setBounds(195,0, 1397, 925);
		add(rigt);
		
		lefe.setBackground(new Color(255,140,0));
		lefe.setBounds(0,0, 196, 930);
		lefe.setLayout(null);
		add(lefe);

		JButton button1 = new JButton("ȷ�϶���");
		button1.setBounds(0, 0, 196, 80);

		JButton button2 = new JButton("ȷ������");
		button2.setBounds(0, 79, 196, 80);

		JButton button3 = new JButton("��������");
		button3.setBounds(0, 158, 196, 80);
		
		JButton button4 = new JButton("��ʷ����");
		button4.setBounds(0, 237, 196, 80);
		
		buttonnStyle(button1,button2,button3,button4);
		UIManager.put("ToolBar.isPaintPlainBackground", Boolean.TRUE);
		chileBut(button1,button2,button3,button4);
	}
	/**
	 *��ť����¼�
	 * @param chileBut �����ť
	 * @param newRight �����ť��Ӧ�ұ����
	 * @param button ������ť��ӦĬ����ɫ
	 */
	public void chileBut(JButton...button) {
		for (JButton jButton : button) {
			jButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					remove(rigt);
					String button=jButton.getText();
					if(button.equals("��ʷ����")) {
						rigt=new Pande2_right4();
					}else if(button.equals("��������")) {
						rigt=new Pande2_right3();
					}else if(button.equals("ȷ������")) {
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
	 * ��ť��ͬ��ʽ
	 */
	public void buttonnStyle(JButton...button1) {
		for (JButton button : button1) {
			button.setFont(new Font("΢���ź�", Font.BOLD, 25));
			button.setBackground(Color.WHITE);
			lefe.add(button);
		}
	}
}
