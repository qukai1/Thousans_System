package com.King.from.user;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import com.King.pojo.Food;
import com.King.pojo.Shopping;
import com.King.pojo.User;
import com.King.serives.FoodServices;
import com.King.serives.ShoppingServices;
import com.King.serives.UserServices;
import com.King.util.Move;
import java.awt.Font;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
/**
 * ����ģ��
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class UserPande4 extends UserJPanel {
	Boolean p=false;
	double sumPrice;
	// ���������
   JTable table;
	// �������ͷ������
	private String[] heads = null;
	// ���������������
	private Object[][] date = null;
	// �������ģ�ͣ����û��ģ����ô�����޷�������ʾ
	private DefaultTableModel model;
	// ��ǰҳ��
	int page = 1;
	// ���ҳ��
	int maxPage = 1;
	// ��Ʒ�б�
	JPanel shopType = new JPanel();
	// ҳ��
	private JComboBox comboBoxPage = new JComboBox();
	//
	JFrame frame=new JFrame();

	public UserPande4(Integer id) {
		User u = new User();

		try {
			u = new UserServices().idUser(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int ids=u.getId();
		setBackground(UIManager.getColor("CheckBox.background"));
		setBounds(0, 0, 1592, 925);
		setLayout(null);
		JPanel shoppe = new JPanel();
		shoppe.setBackground(SystemColor.window);
		shoppe.setBounds(0, 0, 1592, 257);
		add(shoppe);
		shoppe.setLayout(null);
		Icon icon = new ImageIcon("src/img/" + u.getSculpture());
		JLabel image = new JLabel(icon);
		image.setBounds(0, 0, 357, 198);
		shoppe.add(image);
		image.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.black, Color.black, Color.black, Color.black));

		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 199, 1592, 58);
		shoppe.add(panel);
		panel.setLayout(null);

		JLabel xinping = new JLabel("\u65B0\u54C1");
		xinping.setFont(new Font("΢���ź�", Font.BOLD, 30));
		xinping.setBounds(102, 8, 65, 43);
		panel.add(xinping);

		JButton HomeBut = new JButton("\u8FD4\u56DE");
		HomeBut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removeAll();
				JPanel jPanel = new UserPande1();
				jPanel.setBounds(0, 0, 1592, 925);
				add(jPanel);// panel1����µ����
				revalidate();// ��panel1����е�������²��ֲ�����
				repaint();// ��panel1��������ػ�
			}
		});
		HomeBut.setBackground(Color.GREEN);
		HomeBut.setBounds(1450, 8, 116, 41);
		panel.add(HomeBut);
		Icon icon1 = new ImageIcon("src/img/good.png");
		JLabel good = new JLabel(icon1);
		good.setBounds(41, 8, 48, 48);
		panel.add(good);
		Icon icons = new ImageIcon("src/img/shop.png");
		JLabel shoping = new JLabel(icons);
		shoping.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Shop(user.getId(),id);
			}
		});
		shoping.setBounds(1450, 89, 100, 100);
		shoppe.add(shoping);

		JLabel username = new JLabel(u.getUserName());
		username.setFont(new Font("΢���ź�", Font.BOLD, 35));
		username.setBounds(367, 50, 299, 58);
		shoppe.add(username);
		Icon xingxing = new ImageIcon("src/img/xing.png");
		JLabel xing = new JLabel(xingxing);
		xing.setBounds(367, 111, 16, 16);
		shoppe.add(xing);

		JLabel xing_1 = new JLabel(xingxing);
		xing_1.setBounds(385, 111, 16, 16);
		shoppe.add(xing_1);

		JLabel xing_2 = new JLabel(xingxing);
		xing_2.setBounds(403, 111, 16, 16);
		shoppe.add(xing_2);

		JLabel xing_3 = new JLabel(xingxing);
		xing_3.setBounds(422, 111, 16, 16);
		shoppe.add(xing_3);

		JLabel xing_3_1 = new JLabel(xingxing);
		xing_3_1.setBounds(440, 111, 16, 16);
		shoppe.add(xing_3_1);

		JLabel pingfen = new JLabel("5.0");
		pingfen.setForeground(new Color(128, 128, 128));
		pingfen.setBounds(466, 112, 54, 15);
		shoppe.add(pingfen);

		JLabel addsr = new JLabel("\u5546\u5BB6\u5730\u5740\uFF1A" + u.getAddres());
		addsr.setFont(new Font("����", Font.PLAIN, 18));
		addsr.setBounds(367, 137, 275, 20);
		shoppe.add(addsr);

		JLabel addsr_1 = new JLabel("\u5546\u5BB6\u7535\u8BDD\uFF1A" + u.getUserPhone());
		addsr_1.setFont(new Font("����", Font.PLAIN, 18));
		addsr_1.setBounds(367, 163, 299, 20);
		shoppe.add(addsr_1);

		JButton firstPage = new JButton("\u9996\u9875");
		firstPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page=1;
				show(ids, 1);
			}
		});
		firstPage.setBounds(530, 845, 140, 30);
		add(firstPage);


		JButton comboxGo = new JButton("go");
		comboxGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page=(int)comboBoxPage.getSelectedItem();
				show(ids,page);
			}
		});
		comboxGo.setBounds(785, 845, 80, 30);
		add(comboxGo);

		JButton lastPage = new JButton("\u5C3E\u9875");
		lastPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page=maxPage;
				show(ids, page);
			}
		});
		lastPage.setBounds(872, 845, 140, 30);
		add(lastPage);
		show(u.getId(), page);
	}

	public void show(int userID, int page) {
		remove(shopType);
		shopType = new JPanel();
		shopType.setBackground(new Color(255, 255, 255));
		shopType.setBounds(0, 257, 1592, 578);
		shopType.setLayout(null);
		remove(comboBoxPage);
		maxPage = (int) Math.ceil(new FoodServices().countSize(userID) / 6.0);
		comboBoxPage = new JComboBox();
		for (int i = 1; i <= maxPage; i++) {
			comboBoxPage.addItem(i);
		}
		comboBoxPage.setBounds(677, 845, 102, 30);
		add(comboBoxPage);
		int i = 0;
		int s = 0;
		add(shopType);
		List<Food> list = new FoodServices().selFood(userID, page);
		for (Food food : list) {
			JPanel foodPanel = new JPanel();
			foodPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
			if (i < 3) {
				foodPanel.setBounds(524 * i, 0, 524, 284);
				if (i > 0)
					foodPanel.setBounds(524 * i + 10 * i, 0, 524, 284);
			} else {
				foodPanel.setBounds(524 * s,294, 524, 284);
				if (s > 0)
					foodPanel.setBounds(524 * s + 15 * s,294, 524, 284);
				s++;
			}
			i++;
			foodPanel.setBackground(new Color(255, 255, 255));
			shopType.add(foodPanel);
			foodPanel.setLayout(null);
			// ����������ĵ�Ƭ�����ֲ�Ϊ�վ�ִ�У�Ϊ����ͼƬ��ִ�и��²���
			BufferedImage bufferedImage = null;
			try {
				bufferedImage = ImageIO.read(new File("src/img/" + food.getFoodSculpture()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ImageIcon imageIcon = new ImageIcon(bufferedImage);
			JLabel foodImage = new JLabel(imageIcon);
			foodImage.setForeground(new Color(0, 0, 0));
			foodImage.setHorizontalAlignment(SwingConstants.CENTER);
			foodImage.setBackground(new Color(255, 140, 0));
			foodImage.setBounds(0, 0, 524, 190);
			foodPanel.add(foodImage);

			JLabel foodName = new JLabel(food.getFoodName());
			foodName.setFont(new Font("΢ܛ�����w", Font.BOLD, 25));
			foodName.setBounds(10, 197, 131, 25);
			foodPanel.add(foodName);

			JLabel foodPrices = new JLabel("\uFFE5"+food.getFoodPrice()+"/\u4EFD");
			foodPrices.setFont(new Font("΢ܛ�����w", Font.PLAIN, 18));
			foodPrices.setBounds(10, 220, 131, 25);
			foodPanel.add(foodPrices);

			JButton foodBtn = new JButton("\u52A0\u5165\u8D2D\u7269\u8F66");
			foodBtn.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));

			foodBtn.setFont(new Font("����", Font.PLAIN, 25));
			foodBtn.setForeground(new Color(255, 255, 255));
			foodBtn.setBackground(new Color(255, 140, 0));
			foodBtn.setBounds(0, 249, 524, 35);
			foodPanel.add(foodBtn);
			foodBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Shopping shop=new ShoppingServices().selShoping(food.getFoodId(),food.getMerchantsID(),1);
					if(shop.getShoppingPrice()!=0) {
						shop.setShoppingPrice(food.getFoodPrice());
						new ShoppingServices().updShoping(shop);
					}else {
						shop.setFoodID(food.getFoodId());
						shop.setMerchantsID(food.getMerchantsID());
						shop.setShoppingCount(1);
						shop.setShoppingPrice(food.getFoodPrice());
						shop.setUserID(user.getId());
						new ShoppingServices().addShoping(shop);
					}
					JOptionPane.showMessageDialog(null,"���빺�ﳵ");
				}
			});
		}
		add(shopType);
		shopType.revalidate();
		shopType.repaint();
		revalidate();
		repaint();
	}
	public void Shop(int userid,int merchantsID) {
		remove(frame);
		frame=new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(324, 827, 600, 360);
		frame.getContentPane().setLayout(null);
		// ��ʼ����ͷ����
		heads = new String[] { "��Ʒ����", "����", "�۸�" };
		// ��ʼ���������飬ʹ�ù��췽����ֵ
		date = SearchDate(userid,merchantsID);
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
		scr.setBounds(0,0,600,250);
		frame.getContentPane().add(scr);
		JLabel sumPriceShop = new JLabel(sumPrice+"��");

		JLabel cleanShop = new JLabel("\u6E05\u7A7A\u8D2D\u7269\u8F66");
		cleanShop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new ShoppingServices().delShoping(userid, merchantsID);
				table.removeAll();
				/*����table**/
				frame.remove(sumPriceShop);
				sumPriceShop.setText("0.0��");
				frame.getContentPane().add(sumPriceShop);
				frame.revalidate();
				frame.repaint();
				date=SearchDate(userid,merchantsID);
				DefaultTableModel tabModel =new DefaultTableModel(date,heads);
				table.setModel(tabModel);
			    table.setEnabled(true);		
			}
		});
		cleanShop.setFont(new Font("΢ܛ�����w", Font.PLAIN, 20));
		cleanShop.setForeground(new Color(255, 0, 0));
		cleanShop.setBounds(21, 260, 108, 20);
		frame.getContentPane().add(cleanShop);
		
		JLabel sum = new JLabel("\u603B\u4EF7\uFF1A");
		sum.setFont(new Font("΢ܛ�����w", Font.PLAIN, 20));
		sum.setBounds(221, 260, 60, 20);
		frame.getContentPane().add(sum);
		
		JButton submitBut = new JButton("\u7ED3\u7B97");
		submitBut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(SearchDate(user.getId(),merchantsID).length>0) {
				frame.setVisible(false);
				remove(frame);
				removeAll();
				JPanel jPanel =new UserPande5(user.getId(),merchantsID);
				jPanel.setBounds(0,0,1592, 925);
				add(jPanel);// panel1����µ����
				revalidate();// ��panel1����е�������²��ֲ�����
				repaint();// ��panel1��������ػ�
				}else {
					JOptionPane.showMessageDialog(null,"����Ӳ�Ʒ");

				}
			}
		});
		submitBut.setBackground(new Color(255, 0, 0));
		submitBut.setForeground(new Color(255, 255, 255));
		submitBut.setBounds(487, 251, 103, 39);
		submitBut.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
		frame.getContentPane().add(submitBut);	
		
		sumPriceShop.setForeground(new Color(255, 165, 0));
		sumPriceShop.setFont(new Font("΢ܛ�����w", Font.PLAIN, 20));
		sumPriceShop.setBounds(278, 260, 167, 20);
		frame.getContentPane().add(sumPriceShop);
		
		JButton submitBut_1 = new JButton("\u5173\u95ED");
		submitBut_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			}
		});
		submitBut_1.setForeground(Color.black);
		submitBut_1.setBounds(21, 290, 103, 39);
		frame.getContentPane().add(submitBut_1);
		//����ƶ�
		new Move(frame);
		frame.setVisible(true);
		frame.revalidate();
		frame.repaint();
		revalidate();
		repaint();
	}

	private Object[][] SearchDate(int userid,int merchantsID) {
		List<Shopping> list=new ShoppingServices().sleShoping(userid, merchantsID);
		// ����ά����ĵ�һ��װ�������ݣ��ڶ���װ��ͷ��һά����
		Object[][] date = new Object[list.size()][heads.length];
		sumPrice=0;
		for (int i = 0; i < list.size(); i++) {
				Food f=new FoodServices().foodID(list.get(i).getFoodID());
				date[i][0] =f.getFoodName();
				date[i][1] = list.get(i).getShoppingCount();
				sumPrice+=list.get(i).getShoppingPrice();
				date[i][2] = list.get(i).getShoppingPrice();
		}
		return date;
	}
}
