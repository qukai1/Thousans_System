package com.King.from.user;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import com.King.from.business.Pande1_right1;
import com.King.pojo.User;
import com.King.serives.UserServices;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 首页
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class UserPande1 extends UserJPanel {
	// 当前页面
	int page = 1;
	// 最大页面
	int maxPage = 1;
	// 头部导航栏
	JPanel panel = new JPanel();
	// 店铺信息栏
	JPanel shopp = new JPanel();
	public String typesssss = null;
	private JTextField typeName;
	private final JButton firstPage = new JButton("\u9996\u9875");
	private JComboBox comboBoxPage = new JComboBox();
	private final JButton comboxGo = new JButton("go");
	private final JButton lastPage = new JButton("\u5C3E\u9875");
	private final JLabel label = new JLabel("New label");
	private final JLabel label_1 = new JLabel("New label");

	public UserPande1() {
		setBounds(0, 0, 1592, 925);
		setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1592, 86);
		add(panel);
		panel.setLayout(null);

		JLabel type = new JLabel("商品分类");
		type.setHorizontalAlignment(SwingConstants.CENTER);
		type.setFont(new Font("宋体", Font.BOLD, 20));
		type.setBounds(10, 30, 113, 26);
		panel.add(type);

		typeName = new JTextField();
		typeName.setBounds(1252, 30, 233, 29);
		panel.add(typeName);
		typeName.setColumns(10);
		
		comboBoxPage = new JComboBox();
		maxPage = (int) Math.ceil(new UserServices().shopUser(null).size() / 6.0);
		for (int i = 1; i <= maxPage; i++) {
			comboBoxPage.addItem(i);
		}
		comboBoxPage.setBounds(706, 853, 102, 30);
		add(comboBoxPage);
		
		JButton butCha = new JButton("\u67E5\u8BE2");
		butCha.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		butCha.setBounds(1495, 33, 80, 23);
		panel.add(butCha);
		butCha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=typeName.getText();
				showName(name, 1);
			}
		});
		JLabel name = new JLabel("\u5E97\u94FA\u540D\u79F0");
		name.setBounds(1162, 34, 80, 21);
		name.setForeground(Color.black);
		name.setFont(new Font("宋体", Font.BOLD, 16));
		panel.add(name);
		label.setBounds(-27, 71, 1177, 868);
		
		panel.add(label);
		label_1.setBounds(-27, 71, 1177, 763);
		
		panel.add(label_1);
		
		JLabel name1 = new JLabel("全部");
		name1.setBounds(155, 36, 40, 15);
		JLabel name2 = new JLabel("美食");
		name2.setBounds(220, 36, 40, 15);
		JLabel name3 = new JLabel("正餐优选");
		name3.setBounds(285, 36, 80, 15);
		JLabel name4 = new JLabel("超市");
		name4.setBounds(390, 36, 80, 15);
		JLabel name5 = new JLabel("下午茶");
		name5.setBounds(455, 36, 80, 15);
		JlableStyle(name1, name2, name3, name4, name5);
		name1.setForeground(Color.red);
		shopp.setBackground(new Color(255, 255, 255));
		shopp.setBounds(0, 86, 1592, 753);
		add(shopp);
		shopp.setLayout(null);
		firstPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page = 1;
				show(typesssss);
			}
		});

		firstPage.setBounds(559, 853, 140, 30);
		add(firstPage);

		comboxGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			page=(int)comboBoxPage.getSelectedItem();
				show(typesssss);
			}
		});
		comboxGo.setBounds(814, 853, 80, 30);
		add(comboxGo);
		lastPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page = maxPage;
				show(typesssss);
			}
		});
		lastPage.setBounds(901, 853, 140, 30);
		add(lastPage);
		show(null);

	}

	public void show(String type) {
		remove(shopp);
		shopp = new JPanel();
		shopp.setBounds(0, 86, 1592, 753);
		add(shopp);
		shopp.setLayout(null);
		List<User> list = new UserServices().shopUser(type, page);
		remove(comboBoxPage);
		comboBoxPage = new JComboBox();
		maxPage = (int) Math.ceil(new UserServices().shopUser(type).size() / 6.0);
		for (int i = 1; i <= maxPage; i++) {
			comboBoxPage.addItem(i);
		}
		comboBoxPage.setBounds(706, 853, 102, 30);
		add(comboBoxPage);
		int i = 0;
		int s = 0;
		for (User user : list) {
			JPanel shopName = new JPanel();
			shopName.setBorder(new LineBorder(new Color(0, 0, 0)));
			if (i < 3) {
				shopName.setBounds(524 * i, 0, 524, 371);
				if (i > 0)
					shopName.setBounds(524 * i + 10 * i, 0, 524, 371);
			} else {
				shopName.setBounds(524 * s, 381, 524, 371);
				if (s > 0)
					shopName.setBounds(524 * s + 15 * s, 381, 524, 371);
				s++;
			}
			i++;
			JLabel nameImage = new JLabel("没有图片");
			if (user.getSculpture() != null) {
				// 如果返回来的底片的名字不为空就执行，为空则图片不执行更新操作
				BufferedImage bufferedImage = null;
				try {
					bufferedImage = ImageIO.read(new File("src/img/" + user.getSculpture()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				ImageIcon imageIcon = new ImageIcon(bufferedImage);
				nameImage.setIcon(imageIcon);
				nameImage.setText("");
			}
			JLabel time = new JLabel(
					"\u8D77\u9001\uFF1A20\uFFE5    \u914D\u9001\u8D39\uFF1A5\uFFE5   \u6D3E\u9001\u65F6\u95F4\uFF1A50\u5206\u949F");
			JLabel name = new JLabel(user.getUserName());
			shopp.add(shopName);
			shopName.setLayout(null);
			nameImage.setBounds(0, 5, 524, 274);
			shopName.add(nameImage);
			time.setFont(new Font("微软雅黑", Font.PLAIN, 18));
			time.setBounds(10, 333, 487, 20);
			shopName.add(time);
			name.setFont(new Font("微软雅黑", Font.PLAIN, 25));
			name.setBounds(10, 289, 470, 34);
			shopName.add(name);
			shopName.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					removeAll();
					JPanel jPanel =new UserPande4(user.getId());
					jPanel.setBounds(0,0,1592, 925);
					add(jPanel);// panel1添加新的组件
					revalidate();// 对panel1面板中的组件重新布局并绘制
					repaint();// 对panel1本身进行重绘
				}
			});
		}
		add(shopp);
		shopp.revalidate();
		shopp.repaint();
		revalidate();
		repaint();
	}
	//模糊查询
	public void showName(String type, int page) {
		remove(shopp);
		shopp = new JPanel();
		shopp.setBounds(0, 86, 1592, 753);
		add(shopp);
		shopp.setLayout(null);
		List<User> list = new UserServices().shopUserName(type, page);
		remove(comboBoxPage);
		comboBoxPage = new JComboBox();
		maxPage = (int) Math.ceil(new UserServices().shopUserName(type).size() / 6.0);
		for (int i = 1; i <= maxPage; i++) {
			comboBoxPage.addItem(i);
		}
		comboBoxPage.setBounds(706, 853, 102, 30);
		add(comboBoxPage);
		int i = 0;		int s = 0;
		for (User user : list) {
			JPanel shopName = new JPanel();
			shopName.setBorder(new LineBorder(new Color(0, 0, 0)));
			if (i < 3) {
				shopName.setBounds(524 * i, 0, 524, 371);
				if (i > 0)
					shopName.setBounds(524 * i + 10 * i, 0, 524, 371);
			} else {
				shopName.setBounds(524 * s, 381, 524, 371);
				if (s > 0)
					shopName.setBounds(524 * s + 15 * s, 381, 524, 371);
				s++;
			}
			i++;
			JLabel nameImage = new JLabel("没有图片");
			if (user.getSculpture() != null) {
				// 如果返回来的底片的名字不为空就执行，为空则图片不执行更新操作
				BufferedImage bufferedImage = null;
				try {
					bufferedImage = ImageIO.read(new File("src/img/" + user.getSculpture()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				ImageIcon imageIcon = new ImageIcon(bufferedImage);
				nameImage.setIcon(imageIcon);
				nameImage.setText("");
			}
			JLabel time = new JLabel(
					"\u8D77\u9001\uFF1A20\uFFE5    \u914D\u9001\u8D39\uFF1A5\uFFE5   \u6D3E\u9001\u65F6\u95F4\uFF1A50\u5206\u949F");
			JLabel name = new JLabel(user.getUserName());
			shopp.add(shopName);
			shopName.setLayout(null);
			nameImage.setBounds(0, 5, 524, 274);
			shopName.add(nameImage);
			time.setFont(new Font("微软雅黑", Font.PLAIN, 18));
			time.setBounds(10, 333, 487, 20);
			shopName.add(time);
			name.setFont(new Font("微软雅黑", Font.PLAIN, 25));
			name.setBounds(10, 289, 470, 34);
			shopName.add(name);
			shopName.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					removeAll();
					JPanel jPanel =new UserPande4(user.getId());
					jPanel.setBounds(0,0,1592, 925);
					add(jPanel);// panel1添加新的组件
					revalidate();// 对panel1面板中的组件重新布局并绘制
					repaint();// 对panel1本身进行重绘
				}
			});
		}
		add(shopp);
		shopp.revalidate();
		shopp.repaint();
		revalidate();
		repaint();
	}
	public void JlableStyle(JLabel... jLabels) {
		for (JLabel jLabel : jLabels) {
			jLabel.setForeground(Color.GRAY);
			jLabel.setFont(new Font("宋体", Font.BOLD, 16));
			panel.add(jLabel);
			// 文本点击事件
			jLabel.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					for (JLabel jLabel2 : jLabels) {
						jLabel2.setForeground(Color.GRAY);
					}
					System.out.println(jLabel.getText());
					jLabel.setForeground(Color.red);
					page=1;
					show(jLabel.getText());
				}
			});
		}
	}
}
