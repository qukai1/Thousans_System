package com.King.from.business;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * �˵�����
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande1 extends JPanel {
	//�ұ����
	JPanel rigt=new JPanel();
	//������
	JPanel lefe = new JPanel();
	public Pande1() {
		setLayout(null);
		//Ĭ��Pande1_right1()
		rigt=new Pande1_right1();
		rigt.setBounds(195,0, 1397, 925);
		add(rigt);
		
		lefe.setBackground(new Color(255,140,0));
		lefe.setBounds(0,0, 196, 935);
		lefe.setLayout(null);
		add(lefe);

		JButton button1 = new JButton("�˵�����");
		button1.setBounds(0, 0, 196, 80);
		JButton button2 = new JButton("�˵��޸�");
		button2.setBounds(0, 79, 196, 80);
		
		buttonnStyle(button1,button2);
		UIManager.put("ToolBar.isPaintPlainBackground", Boolean.TRUE);
	}
	/**
	 * ��ť����¼�
	 */
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
					if(button.equals("�˵�����")) {
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
	 * ��ť��ͬ��ʽ
	 */
	public void buttonnStyle(JButton...button1) {
		chileBut(button1);
		for (JButton button : button1) {
			button.setFont(new Font("΢���ź�", Font.BOLD, 25));
			lefe.add(button);
		}
	}
}
