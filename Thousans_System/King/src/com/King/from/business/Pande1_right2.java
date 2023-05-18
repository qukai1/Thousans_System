package com.King.from.business;

import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import com.King.pojo.Food;
import com.King.pojo.User;
import com.King.serives.FoodServices;
import com.King.serives.UserServices;
import com.King.util.ShanggchuangFrm;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

/**
 * 修改菜品
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande1_right2 extends JPanel {
	// 当前页面
	int page = 1;
	// 最大页面
	int maxPage = 1;
	// 店铺信息栏
	JPanel shopp = new JPanel();
	private JButton firstPage = new JButton("\u9996\u9875");
	private JComboBox comboBoxPage = new JComboBox();
	private JButton comboxGo = new JButton("go");
	private JButton lastPage = new JButton("\u5C3E\u9875");
	JLabel lblNewLabel = new JLabel(new ImageIcon(Pande1_right1.class.getResource("/img/image.gif")));

	public Pande1_right2() {
		// 查询有几页
		setBounds(0, 0, 1396, 970);
		setLayout(null);
		maxPage = (int) Math.ceil(new FoodServices().countSize(user.getId()) / 6.0);
		for (int i = 1; i <= maxPage; i++) {
			comboBoxPage.addItem(i);
		}
		firstPage = new JButton("\u9996\u9875");
		firstPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				page=1;
				show();
			}
		});
		firstPage.setBounds(502, 818, 140, 30);
		add(firstPage);
		
		comboxGo= new JButton("go");
		comboxGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page=(int)comboBoxPage.getSelectedItem();
				show();
			}
		});
		comboxGo.setBounds(757, 818, 80, 30);
		add(comboxGo);
		
		lastPage= new JButton("\u5C3E\u9875");
		lastPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page=maxPage=(int) Math.ceil(new FoodServices().countSize(user.getId()) / 6.0);
				show();
			}
		});
		lastPage.setBounds(844, 818, 140, 30);
		add(lastPage);
		show();

	}

	public void show() {
		
		remove(shopp);
		shopp = new JPanel();
		

		shopp.setBounds(150, 30, 1592, 753);
		shopp.setBackground(new Color(255, 255, 255, 0));

		add(shopp);
		shopp.setLayout(null);
		remove(comboBoxPage);
		comboBoxPage = new JComboBox();
		maxPage = (int) Math.ceil(new FoodServices().countSize(user.getId()) / 6.0);
		for (int i = 1; i <= maxPage; i++) {
			comboBoxPage.addItem(i);
		}
		comboBoxPage.setBounds(652, 818, 102, 30);
		add(comboBoxPage);
		List<Food> foods = new FoodServices().selFood(user.getId(), page);
		int i = 0;
		int s = 0;
		for (Food food : foods) {
			JPanel shopping = new JPanel();
			shopping.setBorder(new LineBorder(new Color(0, 0, 0, 90)));
			shopping.setBackground(new Color(255, 255, 255, 0));
			shopping.setLayout(null);
			if (i < 3) {
				shopping.setBounds(355 * i, 0, 355, 367);
				if (i > 0)
					shopping.setBounds(355 * i + 15 * i, 0, 355, 367);
			} else {
				shopping.setBounds(355 * s, 380, 355, 367);
				if (s > 0)
					shopping.setBounds(355 * s + 15 * s, 380, 355, 367);
				s++;
			}
			i++;
			Border blackline = BorderFactory.createLineBorder(Color.black);
			JLabel name = new JLabel(food.getFoodName());
			name.setFont(new Font("宋体", Font.BOLD, 20));
			name.setBounds(10, 230, 202, 32);
			shopping.add(name);
			JButton button = new JButton("\u4FEE\u6539\u83DC\u54C1");
			button.setBounds(0, 311, 180, 60);
			button.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));

			shopping.add(button);
			JButton button1 = new JButton("删除菜品");
			button1.setBounds(178, 311, 180, 60);
			button1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));

			shopping.add(button1);
			JLabel prices = new JLabel("￥" + food.getFoodPrice() + "/份");
			prices.setForeground(new Color(220, 20, 60));
			prices.setFont(new Font("宋体", Font.BOLD, 20));
			prices.setBounds(10, 272, 257, 32);
			shopping.add(prices);
			BufferedImage bufferedImage = null;
			try {
				if (food.getFoodSculpture() != null)
					bufferedImage = ImageIO.read(new File("src/img/" + food.getFoodSculpture()));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			ImageIcon imageIcon = new ImageIcon(bufferedImage);
			JLabel image = new JLabel(imageIcon);
			image.setBorder(new LineBorder(new Color(0, 0, 0, 90)));

			image.setForeground(new Color(0, 0, 0));
			image.setBorder(blackline);
			image.setBounds(0, 0, 355, 219);
			shopping.add(image);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					MyDialog(food.getFoodId());
				}
			});
			button1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (new FoodServices().delFoodId(food.getFoodId())) {
						JOptionPane.showMessageDialog(null, "删除成功");
					} else {
						JOptionPane.showMessageDialog(null, "删除失败");
					}
					show();
				}
			});
			shopp.add(shopping);
		}
		remove(lblNewLabel);
		lblNewLabel.setBounds(0, -34, 1396, 980);
		add(shopp);
		add(lblNewLabel);
		comboBoxPage.revalidate();
		comboBoxPage.repaint();
		shopp.revalidate();
		shopp.repaint();
		lblNewLabel.revalidate();
		lblNewLabel.repaint();
		
		revalidate();
		repaint();
	}

	public void MyDialog(Integer id) {
		JFrame frame = new JFrame();
		Food ff = new FoodServices().foodID(id);
		System.out.println(ff);
		frame.setTitle("修改窗口");
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);// 点击关闭按钮时销毁弹窗
		// JDialog作为弹窗 有很大的自由度, 可以像JFrame一样添加各种组件
		JLabel jl = new JLabel("利用JDialog 来作为弹窗");
		frame.getContentPane().add(jl);
		JLabel new_4 = new JLabel("\u83DC\u54C1\u72B6\u6001:");
		frame.getContentPane().setLayout(null);
		// 内容面板一，菜品新增
		JLabel new_2 = new JLabel("\u83DC\u54C1\u4ECB\u7ECD:");
		new_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_2.setBounds(87, 152, 119, 44);
		frame.getContentPane().add(new_2);
		JLabel new_3 = new JLabel("\u83DC\u54C1\u540D\u79F0:");
		new_3.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_3.setBounds(87, 223, 119, 44);
		new_4.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_4.setBounds(87, 300, 119, 44);
		frame.getContentPane().add(new_4);
		frame.getContentPane().add(new_3);
		JLabel new_5 = new JLabel("\u83DC\u54C1\u4EF7\u683C:");
		new_5.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_5.setBounds(87, 379, 119, 44);
		frame.getContentPane().add(new_5);

		JLabel new_6 = new JLabel("\u83DC\u54C1\u7C7B\u578B:");
		new_6.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_6.setBounds(87, 451, 119, 44);
		frame.getContentPane().add(new_6);

		JTextField goods_jieshao = new JTextField();
		goods_jieshao.setColumns(10);
		goods_jieshao.setBounds(232, 155, 312, 44);
		goods_jieshao.setText(ff.getFoodIn());
		frame.getContentPane().add(goods_jieshao);

		JTextField goods_name = new JTextField();
		goods_name.setColumns(10);
		goods_name.setBounds(232, 225, 312, 44);
		goods_name.setText(ff.getFoodName());
		frame.getContentPane().add(goods_name);

		JTextField goods_jiage = new JTextField();
		goods_jiage.setColumns(10);
		goods_jiage.setBounds(232, 379, 312, 44);
		goods_jiage.setText(ff.getFoodPrice() + "");
		frame.getContentPane().add(goods_jiage);

		JComboBox good_zhuangtai = new JComboBox();
		good_zhuangtai.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		good_zhuangtai.setModel(new DefaultComboBoxModel(new String[] { "上架", "预售" }));
		if (ff.getFoodState().equals("上架")) {
			good_zhuangtai.setSelectedIndex(0);
		} else {
			good_zhuangtai.setSelectedIndex(1);
		}
		good_zhuangtai.setBounds(232, 306, 164, 44);
		frame.getContentPane().add(good_zhuangtai);
		// 确定按钮
		JLabel queding = new JLabel("\u786E\u5B9A");
		queding.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		queding.setBounds(288, 544, 79, 62);
		frame.getContentPane().add(queding);

		// 重置按钮
		JLabel chognzhi = new JLabel("\u91CD\u7F6E");
		chognzhi.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		chognzhi.setBounds(497, 544, 62, 62);
		frame.getContentPane().add(chognzhi);
		// 图片预览框

		BufferedImage bufferedImage = null;
		try {
			if (ff.getFoodSculpture() != null)
				bufferedImage = ImageIO.read(new File("src/img/" + ff.getFoodSculpture()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		ImageIcon imageIcon = new ImageIcon(bufferedImage);

		JLabel new_img = new JLabel(imageIcon);
		new_img.setToolTipText(ff.getFoodSculpture());
		new_img.setHorizontalAlignment(SwingConstants.CENTER);
		new_img.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_img.setBounds(642, 131, 244, 240);
		new_img.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		frame.getContentPane().add(new_img);
		// 上传图片按钮
		JButton goods_img = new JButton("\u4E0A\u4F20\u56FE\u7247");
		goods_img.setBorderPainted(false);// 关闭按钮的边框
		goods_img.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		goods_img.setForeground(new Color(0, 0, 0));
		goods_img.setBounds(642, 460, 244, 62);
		frame.getContentPane().add(goods_img);

		JComboBox good_leixing = new JComboBox();
		good_leixing.setModel(new DefaultComboBoxModel(
				new String[] { "\u5C0F\u5403", "\u5C0F\u7092", "\u6C34\u679C", "\u96F6\u98DF" }));
		good_leixing.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		good_leixing.setBounds(232, 451, 164, 44);
		frame.getContentPane().add(good_leixing);
		// 上传图片按钮
		goods_img.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String srcName = ShanggchuangFrm.addPicture(goods_img);
				if (srcName != null) {
					// 如果返回来的底片的名字不为空就执行，为空则图片不执行更新操作
					BufferedImage bufferedImage = null;
					try {
						bufferedImage = ImageIO.read(new File("src/img/" + srcName));
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					ImageIcon imageIcon = new ImageIcon(bufferedImage);
					new_img.setIcon(imageIcon);
					new_img.setToolTipText(srcName);
				}
			}
		});
		// 重置按钮的按下事件
		chognzhi.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				goods_name.setText(null);
				goods_jieshao.setText(null);
				goods_jiage.setText(null);
				good_leixing.setSelectedIndex(0);
				good_zhuangtai.setSelectedIndex(0);
				new_img.setIcon(null);
				new_img.setToolTipText(null);
			}
		});
		// 确定按钮的点击事件
		queding.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// 获取用户输入的值
				Food f = new Food();
				f.setFoodId(ff.getFoodId());
				f.setFoodIn(goods_jieshao.getText());
				f.setFoodName(goods_name.getText());
				f.setFoodPrice(Double.parseDouble(goods_jiage.getText()));
				f.setFoodState((String) good_zhuangtai.getSelectedItem());
				f.setFoodType((String) good_leixing.getSelectedItem());
				f.setFoodSculpture(new_img.getToolTipText());
				f.setMerchantsID(ff.getMerchantsID());
				if (new FoodServices().updFood(f)) {
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, "修改成功");
				} else {
					frame.setVisible(false);
					JOptionPane.showInternalMessageDialog(null, "修改失败");
				}
				show();
			}

		});
		frame.setVisible(true);
	}
}