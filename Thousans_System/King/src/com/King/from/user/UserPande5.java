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
 * �ύ����ģ��
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
	// ���������
	JTable table;
	// �������ͷ������
	private String[] heads = new String[] { "��Ʒ����", "����", "�۸�" };;
	// ���������������
	private Object[][] date = null;
	// �������ģ�ͣ����û��ģ����ô�����޷�������ʾ
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
		username.setFont(new Font("��Բ", Font.PLAIN, 25));
		username.setBounds(90, 32, 386, 30);
		add(username);

		model=new DefaultTableModel(date,heads);
		//�ٽ����ģ�ͼ��뵽�����
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
		lblNewLabel_1.setFont(new Font("��Բ", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(808, 32, 221, 30);
		add(lblNewLabel_1);

		JLabel much = new JLabel("\u5408\u8BA1"+sumPrice+"��");
		much.setBackground(Color.ORANGE);
		much.setHorizontalAlignment(SwingConstants.CENTER);
		much.setFont(new Font("��Բ", Font.PLAIN, 20));
		much.setBounds(90, 430, 675, 52);
		add(much);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(90, 528, 1399, 230);
		add(panel);
		panel.setLayout(null);

		JButton updateUser = new JButton("\u4FEE\u6539");
		updateUser.setBackground(Color.ORANGE);
		updateUser.setFont(new Font("��Բ", Font.PLAIN, 20));
		updateUser.setForeground(Color.WHITE);
		updateUser.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
		updateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (updateUser.getText().equals("�޸�")) {
					userFileText(true, name, addrs, phone);
					updateUser.setText("����");
				} else {
					updateUser.setText("�޸�");
					userFileText(false, name, addrs, phone);
				}
			}
		});
		updateUser.setBounds(1210, 96, 166, 60);
		panel.add(updateUser);

		JLabel nameJlable = new JLabel("\u7528\u6237\u540D\uFF1A");
		nameJlable.setFont(new Font("��Բ", Font.PLAIN, 25));
		nameJlable.setBounds(25, 30, 101, 36);
		panel.add(nameJlable);

		JLabel addrsJlabel = new JLabel("\u5730\u5740\uFF1A");
		addrsJlabel.setFont(new Font("��Բ", Font.PLAIN, 25));
		addrsJlabel.setBounds(50, 162, 76, 36);
		panel.add(addrsJlabel);

		JLabel phoneJlabel = new JLabel("\u624B\u673A\u53F7\uFF1A");
		phoneJlabel.setFont(new Font("��Բ", Font.PLAIN, 25));
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
		lblNewLabel_4.setFont(new Font("��Բ", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(90, 786, 130, 76);
		add(lblNewLabel_4);

		JLabel money = new JLabel("��"+sumPrice);
		money.setForeground(Color.ORANGE);
		money.setFont(new Font("��Բ", Font.PLAIN, 30));
		money.setBounds(230, 786, 130, 76);
		add(money);

		JButton payment = new JButton("\u53BB\u652F\u4ED8");
		payment.setForeground(Color.WHITE);
		payment.setFont(new Font("��Բ", Font.PLAIN, 20));
		payment.setBackground(Color.ORANGE);
		payment.setBounds(1300, 794, 166, 60);
		add(payment);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("��Բ", Font.PLAIN, 25));
		textArea.setBounds(808, 84, 681, 398);
		add(textArea);
		payment.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
		payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String na=name.getText();//�û���
			String ad=addrs.getText();//��ַ
			String ph=phone.getText();//�ֻ�����
			//����һ���������
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
			//��ӳɹ�
			order.addOrderSerivce(the);
			//���ù��ﳵ״̬
			new OrderStateService().orderStateNumber(number);
			//��ֵ���붩��
			int orderID=order.orderTheNumber(number).getOrderId();
			List<Shopping> list = new ShoppingServices().sleShoping(user.getId(), merchantsID);
			//��ֵ����OrderDateiled��
			for (Shopping shopping : list) {
				OrderDateiled d=new OrderDateiled();
				d.setFoodPrice(shopping.getShoppingPrice());
				d.setOrderCount(shopping.getShoppingCount());
				d.setsFoodName(new FoodServices().foodID(shopping.getFoodID()).getFoodName());
				d.setOrderID(orderID);
				new OrderDateiledServices().addDateil(d);
			}
			JOptionPane.showMessageDialog(null, "֧���ɹ�");
			//��չ��ﳵ
			new ShoppingServices().delShoping(user.getId(), merchantsID);
			removeAll();
			JPanel jPanel = new UserPande2();
			jPanel.setBounds(0, 0, 1592, 925);
			add(jPanel);// panel1����µ����
			revalidate();// ��panel1����е�������²��ֲ�����
			repaint();// ��panel1��������ػ�
			}
		});
	}

	// ������Ϣ
	public void userFileText(boolean b, JTextField... fields) {
		for (JTextField jTextField : fields) {
			jTextField.setEditable(b);
		}
	}

	private Object[][] SearchDate(int userid, int merchantsID) {
		List<Shopping> list = new ShoppingServices().sleShoping(userid, merchantsID);
		// ����ά����ĵ�һ��װ�������ݣ��ڶ���װ��ͷ��һά����
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
