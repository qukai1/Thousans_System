package com.King.from.business1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import com.King.pojo.Food;
import com.King.util.ShanggchuangFrm;
import java.awt.event.MouseAdapter;
import com.King.serives.*;

@SuppressWarnings("serial")
public class Pande1_right1 extends JPanel {
	private String srcName = null;

	public Pande1_right1() {
		JLabel new_4 = new JLabel("\u83DC\u54C1\u72B6\u6001:");
		new_4.setForeground(Color.WHITE);
		this.setBounds(0, 0, 1396, 970);
		this.setLayout(null);
		setBackground(Color.WHITE);
		// 内容面板一，菜品新增
		JLabel new_2 = new JLabel("\u83DC\u54C1\u4ECB\u7ECD:");
		new_2.setForeground(Color.WHITE);
		new_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_2.setBounds(339, 152, 119, 44);
		this.add(new_2);
		JLabel new_3 = new JLabel("\u83DC\u54C1\u540D\u79F0:");
		new_3.setForeground(Color.WHITE);
		new_3.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_3.setBounds(339, 223, 119, 44);
		new_4.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_4.setBounds(339, 300, 119, 44);
		this.add(new_4);
		this.add(new_3);
		JLabel new_5 = new JLabel("\u83DC\u54C1\u4EF7\u683C:");
		new_5.setForeground(Color.WHITE);
		new_5.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_5.setBounds(339, 379, 119, 44);
		this.add(new_5);

		JLabel new_6 = new JLabel("\u83DC\u54C1\u7C7B\u578B:");
		new_6.setForeground(Color.WHITE);
		new_6.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_6.setBounds(339, 451, 119, 44);
		this.add(new_6);

		JTextField goods_jieshao = new JTextField();
		goods_jieshao.setBackground(new Color(255, 248, 220));
		goods_jieshao.setColumns(10);
		goods_jieshao.setBounds(484, 155, 312, 44);
		this.add(goods_jieshao);

		JTextField goods_name = new JTextField();
		goods_name.setBackground(new Color(255, 248, 220));
		goods_name.setColumns(10);
		goods_name.setBounds(484, 225, 312, 44);
		this.add(goods_name);

		JTextField goods_jiage = new JTextField();
		goods_jiage.setBackground(new Color(255, 248, 220));
		goods_jiage.setColumns(10);
		goods_jiage.setBounds(484, 379, 312, 44);
		this.add(goods_jiage);

		JComboBox good_zhuangtai = new JComboBox();
		good_zhuangtai.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		good_zhuangtai.setModel(new DefaultComboBoxModel(new String[] { "\u9884\u552E", "\u4E0A\u67B6" }));
		good_zhuangtai.setBounds(484, 306, 164, 44);
		this.add(good_zhuangtai);
		// 确定按钮
		JLabel queding = new JLabel("\u786E\u5B9A");
		queding.setForeground(Color.WHITE);
		queding.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		queding.setBounds(540, 544, 79, 62);
		this.add(queding);

		// 重置按钮
		JLabel chognzhi = new JLabel("\u91CD\u7F6E");

		chognzhi.setForeground(new Color(255, 255, 255));
		chognzhi.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		chognzhi.setBounds(749, 544, 62, 62);
		this.add(chognzhi);
		// 图片预览框
		JLabel new_img = new JLabel("");
		new_img.setText("未知");
		new_img.setHorizontalAlignment(SwingConstants.CENTER);
		new_img.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		new_img.setForeground(Color.WHITE);
		new_img.setBounds(894, 131, 244, 240);
		new_img.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		this.add(new_img);

		// 上传图片按钮
		JButton goods_img = new JButton("\u4E0A\u4F20\u56FE\u7247");
		goods_img.setBorderPainted(false);// 关闭按钮的边框
		goods_img.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		goods_img.setForeground(new Color(0, 0, 0));
		goods_img.setBounds(894, 460, 244, 62);
		this.add(goods_img);

		JComboBox good_leixing = new JComboBox();
		good_leixing.setModel(new DefaultComboBoxModel(new String[] {"\u5C0F\u5403", "\u6C34\u679C\u7C7B", "\u996E\u6599\u7C7B", "\u7092\u83DC\u7C7B", "\u6C64\u7C7B", "\u5FEB\u9910\u7C7B"}));
		good_leixing.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		good_leixing.setBounds(484, 451, 164, 44);
		this.add(good_leixing);
		
		JLabel body_img = new JLabel("");
		body_img.setIcon(new ImageIcon("src\\img\\点餐页面.png"));
		body_img.setBounds(0, 0, 1600, 900);
		add(body_img);

		// 上传图片按钮
		goods_img.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				srcName = ShanggchuangFrm.addPicture(goods_img);
				if (srcName != null) {
					// 如果返回来的底片的名字不为空就执行，为空则图片不执行更新操作
					BufferedImage bufferedImage = null;
					try {
						bufferedImage = ImageIO.read(new File("src/img/" + srcName));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ImageIcon imageIcon = new ImageIcon(bufferedImage);
					new_img.setIcon(imageIcon);
					new_img.setToolTipText(srcName);
					new_img.setText(srcName);
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

			}
		});

		// 确定按钮的点击事件
		queding.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// 获取用户输入的值
				Food f = new Food();
				f.setFoodIn(goods_jieshao.getText());
				f.setFoodName(goods_name.getText());
				f.setFoodPrice(Double.parseDouble(goods_jiage.getText()));
				f.setFoodState((String) good_zhuangtai.getSelectedItem());
				f.setFoodType((String) good_leixing.getSelectedItem());
				f.setFoodSculpture(srcName);
				f.setMerchantsID(user.getId());
				if (new FoodServices().addFood(f)) {
					JOptionPane.showMessageDialog(null, "菜品添加成功");
					goods_name.setText(null);
					goods_jieshao.setText(null);
					goods_jiage.setText(null);
					good_leixing.setSelectedIndex(0);
					good_zhuangtai.setSelectedIndex(0);
					new_img.setIcon(null);
					new_img.setText("");
				} else {
					JOptionPane.showInternalMessageDialog(null, "菜品添加失败");
				}
			}

		});

	}
}
