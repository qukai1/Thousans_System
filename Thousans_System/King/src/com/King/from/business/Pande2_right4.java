package com.King.from.business;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
 * 历史订单
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande2_right4 extends JPanel{
	// 构造表格对象
		private JTable table;
		// 定义表格的头部数组
		private String[] heads = null;
		// 定义表格的内容数组
		private Object[][] date = null;
		// 定义表格的模型，如果没有模型那么数据无法正常显示
		private DefaultTableModel model;
		public Pande2_right4() {
			this.setBounds(0, 0, 1396, 970);
			this.setLayout(null);
			// 初始化表头数组
			heads = new String[] { "订单编号", "总价格", "下单日期", "收件人", "联系电话", "联系地址", "用户备注" };
			// 初始化内容数组，使用构造方法赋值
			date = SearchDate();
			// 将构造好的表头和内容放入表格模型
			model = new DefaultTableModel(date, heads);
			// 再将表格模型加入到表格中
			table = new JTable(model){
				public boolean isCellEditable(int row, int column) {
					return false;
				}
				};
			table.setFont(new Font("宋体", Font.PLAIN, 20));
			table.setFillsViewportHeight(true);
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.getTableHeader().setReorderingAllowed(false);

			// 创建滚动条，如果没有滚动条那么内容不会显示全
			table.setRowHeight(100);
			table.addMouseListener(new MouseListener() {			
				@Override
				public void mouseClicked(MouseEvent e) {
					int selectIndex = table.getSelectedRow();
					if(selectIndex>=0) {
						String no = table.getValueAt(selectIndex, 0) + "";
						new UserPande6(new OrderTheServices().orderTheNumber(no).getOrderId()).setVisible(true);
					}
				}
				@Override
				public void mouseEntered(MouseEvent e) {				
				}
				@Override
				public void mouseExited(MouseEvent e) {				
				}
				@Override
				public void mousePressed(MouseEvent e) {				
				}
				@Override
				public void mouseReleased(MouseEvent e) {				
				}
			});
			JScrollPane scr = new JScrollPane(table);
			// 将表格装入滚动面板，再将滚动给加入到this内容面板中
			scr.setBounds(45, 112, 1306, 690);

			this.add(scr);
			JLabel lblNewLabel = new JLabel(new ImageIcon(Pande1_right1.class.getResource("/img/image.gif")));
			lblNewLabel.setBounds(0, -34, 1396, 1004);
			add(lblNewLabel);
		}

		private Object[][] SearchDate() {
			List<OrderThe> list =new ArrayList<OrderThe>();
			try {
				list = new OrderTheServices().orderTheID(user.getId(),4);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// 将二维数组的第一个装集合内容，第二个装表头的一维数组
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
