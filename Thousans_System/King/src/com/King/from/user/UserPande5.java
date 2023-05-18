package com.King.from.user;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import com.King.pojo.Food;
import com.King.pojo.OrderDateiled;
import com.King.pojo.OrderThe;
import com.King.pojo.Shopping;
import com.King.pojo.User;
import com.King.serives.FoodServices;
import com.King.serives.OrderDateiledServices;
import com.King.serives.OrderStateService;
import com.King.serives.OrderTheServices;
import com.King.serives.ShoppingServices;
import com.King.serives.UserServices;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 * 提交订单模块
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class UserPande5 extends UserJPanel {
	private JTextField name;
	private JTextField phone;
	private JTextField addrs;
	double sumPrice;
	// 构造表格对象
	JTable table;
	// 定义表格的头部数组
	private String[] heads = new String[] { "菜品名称", "数量", "价格" };;
	// 定义表格的内容数组
	private Object[][] date = null;
	// 定义表格的模型，如果没有模型那么数据无法正常显示
	private DefaultTableModel model;
	User shopuser = new User();
	public UserPande5(int userID, int merchantsID) {
		setBounds(0, 0, 1592, 925);
		setLayout(null);
		try {
			shopuser = new UserServices().idUser(merchantsID);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			user = new UserServices().idUser(userID);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		JLabel username = new JLabel(shopuser.getUserName() + ">\u786E\u8BA4\u8D2D\u4E70");
		username.setFont(new Font("幼圆", Font.PLAIN, 25));
		username.setBounds(90, 32, 386, 30);
		add(username);

		model=new DefaultTableModel(date,heads);
		//再将表格模型加入到表格中
		table=new JTable(model) {
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		};
		table.setBounds(90, 84, 675, 342);
		date = SearchDate(user.getId(), merchantsID);
		DefaultTableModel tabModel = new DefaultTableModel(date, heads);
		table.setRowHeight(50);
		table.setModel(tabModel);
		table.setEnabled(false);
		add(table);

		JLabel lblNewLabel_1 = new JLabel("\u7ED9\u5546\u5BB6\u7559\u8A00\uFF1A");
		lblNewLabel_1.setFont(new Font("幼圆", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(808, 32, 221, 30);
		add(lblNewLabel_1);

		JLabel much = new JLabel("\u5408\u8BA1"+sumPrice+"￥");
		much.setBackground(Color.ORANGE);
		much.setHorizontalAlignment(SwingConstants.CENTER);
		much.setFont(new Font("幼圆", Font.PLAIN, 20));
		much.setBounds(90, 430, 675, 52);
		add(much);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(90, 528, 1399, 230);
		add(panel);
		panel.setLayout(null);

		JButton updateUser = new JButton("\u4FEE\u6539");
		updateUser.setBackground(Color.ORANGE);
		updateUser.setFont(new Font("幼圆", Font.PLAIN, 20));
		updateUser.setForeground(Color.WHITE);
		updateUser.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
		updateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (updateUser.getText().equals("修改")) {
					userFileText(true, name, addrs, phone);
					updateUser.setText("保存");
				} else {
					updateUser.setText("修改");
					userFileText(false, name, addrs, phone);
				}
			}
		});
		updateUser.setBounds(1210, 96, 166, 60);
		panel.add(updateUser);

		JLabel nameJlable = new JLabel("\u7528\u6237\u540D\uFF1A");
		nameJlable.setFont(new Font("幼圆", Font.PLAIN, 25));
		nameJlable.setBounds(25, 30, 101, 36);
		panel.add(nameJlable);

		JLabel addrsJlabel = new JLabel("\u5730\u5740\uFF1A");
		addrsJlabel.setFont(new Font("幼圆", Font.PLAIN, 25));
		addrsJlabel.setBounds(50, 162, 76, 36);
		panel.add(addrsJlabel);

		JLabel phoneJlabel = new JLabel("\u624B\u673A\u53F7\uFF1A");
		phoneJlabel.setFont(new Font("幼圆", Font.PLAIN, 25));
		phoneJlabel.setBounds(25, 96, 101, 36);
		panel.add(phoneJlabel);

		name = new JTextField(user.getUserName());
		name.setBounds(123, 30, 485, 36);
		panel.add(name);
		name.setColumns(10);

		phone = new JTextField(user.getUserPhone());
		phone.setColumns(10);
		phone.setBounds(123, 96, 485, 36);
		panel.add(phone);

		addrs = new JTextField(user.getAddres());
		addrs.setColumns(10);
		addrs.setBounds(123, 162, 485, 36);
		panel.add(addrs);

		userFileText(false, name, phone, addrs);
		JLabel lblNewLabel_4 = new JLabel("\u60A8\u9700\u652F\u4ED8");
		lblNewLabel_4.setFont(new Font("幼圆", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(90, 786, 130, 76);
		add(lblNewLabel_4);

		JLabel money = new JLabel("￥"+sumPrice);
		money.setForeground(Color.ORANGE);
		money.setFont(new Font("幼圆", Font.PLAIN, 30));
		money.setBounds(230, 786, 130, 76);
		add(money);

		JButton payment = new JButton("\u53BB\u652F\u4ED8");
		payment.setForeground(Color.WHITE);
		payment.setFont(new Font("幼圆", Font.PLAIN, 20));
		payment.setBackground(Color.ORANGE);
		payment.setBounds(1300, 794, 166, 60);
		add(payment);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("幼圆", Font.PLAIN, 25));
		textArea.setBounds(808, 84, 681, 398);
		add(textArea);
		payment.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
		payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String na=name.getText();//用户名
			String ad=addrs.getText();//地址
			String ph=phone.getText();//手机号码
			//定义一个订单编号
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
			String date = format.format(new Date());
			String number=date+(int)Math.random()*100000;
			OrderThe the=new OrderThe();
			the.setMerchantsID(shopuser.getId());
			the.setUserID(user.getId());
			the.setAddress(ad);
			the.setName(na);
			the.setxPhone(ph);
			the.setOrderNumber(number);
			the.setSaleDate(date);
			the.setShoppingPrice(sumPrice);
			the.setShoppingNote(textArea.getText());
			OrderTheServices order=new OrderTheServices();
			//添加成功
			order.addOrderSerivce(the);
			//设置购物车状态
			new OrderStateService().orderStateNumber(number);
			//将值传入订单
			int orderID=order.orderTheNumber(number).getOrderId();
			List<Shopping> list = new ShoppingServices().sleShoping(user.getId(), merchantsID);
			//将值传入OrderDateiled表
			for (Shopping shopping : list) {
				OrderDateiled d=new OrderDateiled();
				d.setFoodPrice(shopping.getShoppingPrice());
				d.setOrderCount(shopping.getShoppingCount());
				d.setsFoodName(new FoodServices().foodID(shopping.getFoodID()).getFoodName());
				d.setOrderID(orderID);
				new OrderDateiledServices().addDateil(d);
			}
			JOptionPane.showMessageDialog(null, "支付成功");
			//清空购物车
			new ShoppingServices().delShoping(user.getId(), merchantsID);
			removeAll();
			JPanel jPanel = new UserPande2();
			jPanel.setBounds(0, 0, 1592, 925);
			add(jPanel);// panel1添加新的组件
			revalidate();// 对panel1面板中的组件重新布局并绘制
			repaint();// 对panel1本身进行重绘
			}
		});
	}

	// 传递信息
	public void userFileText(boolean b, JTextField... fields) {
		for (JTextField jTextField : fields) {
			jTextField.setEditable(b);
		}
	}

	private Object[][] SearchDate(int userid, int merchantsID) {
		List<Shopping> list = new ShoppingServices().sleShoping(userid, merchantsID);
		// 将二维数组的第一个装集合内容，第二个装表头的一维数组
		Object[][] date = new Object[list.size()][heads.length];
		sumPrice = 0;
		for (int i = 0; i < list.size(); i++) {
			Food f = new FoodServices().foodID(list.get(i).getFoodID());
			date[i][0] = f.getFoodName();
			date[i][1] = list.get(i).getShoppingCount();
			sumPrice += list.get(i).getShoppingPrice();
			date[i][2] = list.get(i).getShoppingPrice();
		}
		return date;
	}
}
