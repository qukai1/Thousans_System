package com.King.from.business;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import com.King.pojo.OrderDateiled;
import com.King.serives.OrderDateiledServices;
import com.King.util.Move;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.List;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * ����ģ�飨��ϸ������
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class UserPande6 extends JFrame{
	// ���������
	JTable table;
	// �������ͷ������
	private String[] heads = null;
	// ���������������
	private Object[][] date = null;
	// �������ģ�ͣ����û��ģ����ô�����޷�������ʾ
	private DefaultTableModel model;

	public UserPande6(int border) {
		getContentPane().setBackground(new Color(192, 192, 192));
		getContentPane().setEnabled(false);
		this.setUndecorated(true);
		setBackground(new Color(245, 245, 245));
		setBounds(400,800,626,351);
		getContentPane().setLayout(null);
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
		scr.setBounds(0,61,612,253);
		getContentPane().add(scr);
		
		JLabel lblNewLabel = new JLabel("\u8BE6\u7EC6\u8BA2\u5355");
		lblNewLabel.setFont(new Font("��Բ", Font.PLAIN, 30));
		lblNewLabel.setBounds(215, 10, 130, 36);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u5173\u95ED");
		btnNewButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 0, 141, 42);
		getContentPane().add(btnNewButton);
		//����ƶ�
		new Move(this);
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
