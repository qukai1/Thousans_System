package com.King.from.business1;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import com.King.pojo.OrderThe;
import com.King.serives.OrderTheServices;
/**
 * ��ʷ����
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande2_right4 extends JPanel{
	// ���������
		private JTable table;
		// �������ͷ������
		private String[] heads = null;
		// ���������������
		private Object[][] date = null;
		// �������ģ�ͣ����û��ģ����ô�����޷�������ʾ
		private DefaultTableModel model;
		public Pande2_right4() {
			this.setBounds(0, 0, 1396, 970);
			this.setLayout(null);
			// ��ʼ����ͷ����
			heads = new String[] { "�������", "�ܼ۸�", "�µ�����", "�ռ���", "��ϵ�绰", "��ϵ��ַ", "�û���ע" };
			// ��ʼ���������飬ʹ�ù��췽����ֵ
			date = SearchDate();
			// ������õı�ͷ�����ݷ�����ģ��
			model = new DefaultTableModel(date, heads);
			// �ٽ����ģ�ͼ��뵽�����
			table = new JTable(model){
				public boolean isCellEditable(int row, int column) {
					return false;
				}
				};
				table.setBackground(new Color(22, 12, 12, 55));
			table.setFont(new Font("����", Font.PLAIN, 20));
			table.setForeground(Color.WHITE);
			table.setFillsViewportHeight(true);
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.getTableHeader().setReorderingAllowed(false);

			// ���������������û�й�������ô���ݲ�����ʾȫ
			table.setRowHeight(100);
			JScrollPane scr = new JScrollPane(table);
			scr.setBackground(new Color(22, 12, 12, 55));
			// �����װ�������壬�ٽ����������뵽this���������
			scr.setBounds(45, 112, 1306, 690);

			this.add(scr);
			JLabel img=new JLabel();
			img.setBounds(0, 0, 1400, 850);
			img.setIcon(new ImageIcon("src\\img\\��ʳͼƬ6.png"));
			this.add(img);
		}

		private Object[][] SearchDate() {
			List<OrderThe> list =new ArrayList<OrderThe>();
			try {
				list = new OrderTheServices().orderTheID(user.getId(),4);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// ����ά����ĵ�һ��װ�������ݣ��ڶ���װ��ͷ��һά����
			Object[][] date= new Object[list.size()][heads.length];
			for (int i = 0; i < list.size(); i++) {
				date[i][0] = list.get(i).getOrderNumber();
				date[i][1] = list.get(i).getShoppingPrice();
				date[i][2] = list.get(i).getSaleDate();
				date[i][3] = list.get(i).getName();
				date[i][4] = list.get(i).getxPhone();
				date[i][5] = list.get(i).getAddress();
				date[i][6] = list.get(i).getShoppingNote();
			}
			return date;
		}
}
