package com.King.from.user;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import com.King.from.business.Pande1_right1;
import com.King.pojo.OrderDateiled;
import com.King.serives.OrderDateiledServices;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

/**
 * ����ģ�飨��ϸ������
 * 
 * @author Administrator
 *
 */
public class UserPande6 extends UserJPanel {
	// ���������
	JTable table;
	// �������ͷ������
	private String[] heads = null;
	// ���������������
	private Object[][] date = null;
	// �������ģ�ͣ����û��ģ����ô�����޷�������ʾ
	private DefaultTableModel model;

	public UserPande6(int border) {
		setBackground(new Color(245, 245, 245));
		setBounds(0, 0, 1592, 925);
		setLayout(null);
		
		JButton retun = new JButton("\u8FD4\u56DE");
		retun.setFont(new Font("��Բ", Font.PLAIN, 25));
		retun.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		retun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				JPanel jPanel = new UserPande2();
				jPanel.setBounds(0, 0, 1592, 925);
				add(jPanel);// panel1����µ����
				revalidate();// ��panel1����е�������²��ֲ�����
				repaint();// ��panel1��������ػ�
			}
		});
		retun.setBounds(55, 32, 93, 62);
		add(retun);
		
		JLabel name = new JLabel("\u8BE6\u7EC6\u8BA2\u5355");
		name.setFont(new Font("��Բ", Font.PLAIN, 35));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(324, 29, 849, 74);
		add(name);
		// ��ʼ����ͷ����
		heads = new String[] { "��Ʒ����", "����", "�۸�" };
		// ��ʼ���������飬ʹ�ù��췽����ֵ
		date = SearchDate(border);
		// ������õı�ͷ�����ݷ�����ģ��
		model = new DefaultTableModel(date, heads);
		// �ٽ����ģ�ͼ��뵽�����
		table = new JTable(model) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("����", Font.PLAIN, 20));
		table.setEnabled(false);
		// ���������������û�й�������ô���ݲ�����ʾȫ
		table.setRowHeight(50);
		JScrollPane scr = new JScrollPane(table);
		// �����װ�������壬�ٽ����������뵽this���������
		scr.setBounds(149,139,1198,701);
		add(scr);
	}
	private Object[][] SearchDate(int border) {
		List<OrderDateiled> list=new OrderDateiledServices().showUser(border);
		// ����ά����ĵ�һ��װ�������ݣ��ڶ���װ��ͷ��һά����
		Object[][] date = new Object[list.size()][heads.length];
		for (int i = 0; i < list.size(); i++) {
				date[i][0]=list.get(i).getsFoodName();
				date[i][1]=list.get(i).getOrderCount();
				date[i][2]=list.get(i).getFoodPrice();
		}
		return date;
	}
}
