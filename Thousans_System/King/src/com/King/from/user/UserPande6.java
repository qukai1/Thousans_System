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
 * 订单模块（详细订单）
 * 
 * @author Administrator
 *
 */
public class UserPande6 extends UserJPanel {
	// 构造表格对象
	JTable table;
	// 定义表格的头部数组
	private String[] heads = null;
	// 定义表格的内容数组
	private Object[][] date = null;
	// 定义表格的模型，如果没有模型那么数据无法正常显示
	private DefaultTableModel model;

	public UserPande6(int border) {
		setBackground(new Color(245, 245, 245));
		setBounds(0, 0, 1592, 925);
		setLayout(null);
		
		JButton retun = new JButton("\u8FD4\u56DE");
		retun.setFont(new Font("幼圆", Font.PLAIN, 25));
		retun.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		retun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				JPanel jPanel = new UserPande2();
				jPanel.setBounds(0, 0, 1592, 925);
				add(jPanel);// panel1添加新的组件
				revalidate();// 对panel1面板中的组件重新布局并绘制
				repaint();// 对panel1本身进行重绘
			}
		});
		retun.setBounds(55, 32, 93, 62);
		add(retun);
		
		JLabel name = new JLabel("\u8BE6\u7EC6\u8BA2\u5355");
		name.setFont(new Font("幼圆", Font.PLAIN, 35));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(324, 29, 849, 74);
		add(name);
		// 初始化表头数组
		heads = new String[] { "菜品名称", "数量", "价格" };
		// 初始化内容数组，使用构造方法赋值
		date = SearchDate(border);
		// 将构造好的表头和内容放入表格模型
		model = new DefaultTableModel(date, heads);
		// 再将表格模型加入到表格中
		table = new JTable(model) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		table.setEnabled(false);
		// 创建滚动条，如果没有滚动条那么内容不会显示全
		table.setRowHeight(50);
		JScrollPane scr = new JScrollPane(table);
		// 将表格装入滚动面板，再将滚动给加入到this内容面板中
		scr.setBounds(149,139,1198,701);
		add(scr);
	}
	private Object[][] SearchDate(int border) {
		List<OrderDateiled> list=new OrderDateiledServices().showUser(border);
		// 将二维数组的第一个装集合内容，第二个装表头的一维数组
		Object[][] date = new Object[list.size()][heads.length];
		for (int i = 0; i < list.size(); i++) {
				date[i][0]=list.get(i).getsFoodName();
				date[i][1]=list.get(i).getOrderCount();
				date[i][2]=list.get(i).getFoodPrice();
		}
		return date;
	}
}
