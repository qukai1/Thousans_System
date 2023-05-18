package com.King.from.user;

import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import com.King.pojo.OrderThe;
import com.King.pojo.User;
import com.King.serives.OrderTheServices;
import com.King.serives.UserServices;

import java.awt.Color;
import java.awt.SystemColor;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 订单模块
 * @author Administrator
 *
 */
public class UserPande2 extends UserJPanel{
	JComboBox comboBoxPage = new JComboBox();
	JPanel panel = new JPanel();
	int page=1;
	int maxpage;
	public UserPande2() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1592, 918);
		setLayout(null);
		
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(77, 85, 1410, 744);
		add(panel);
		panel.setLayout(null);
		
	
		//查询信息
		show(panel,page);
		
		JButton firstPage = new JButton("\u9996\u9875");
		firstPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(panel, page=1);
			}
		});
		firstPage.setBounds(535, 854, 140, 30);
		add(firstPage);
		
		comboBoxPage.setBounds(682, 854, 102, 30);
		add(comboBoxPage);
		
		JButton comboxGo = new JButton("go");
		comboxGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page=(int)comboBoxPage.getSelectedItem();
				show(panel, page);
			}
		});
		comboxGo.setBounds(790, 854, 80, 30);
		add(comboxGo);
		
		JButton lastPage = new JButton("\u5C3E\u9875");
		lastPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(panel, page=maxpage);
			}
		});
		lastPage.setBounds(877, 854, 140, 30);
		add(lastPage);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBounds(0, 0, 1592, 77);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BA2\u5355\u5185\u5BB9");
		lblNewLabel.setFont(new Font("幼圆", Font.PLAIN, 25));
		lblNewLabel.setBounds(-245, 22, 145, 40);
		panel_2.add(lblNewLabel);
		
		JButton refurbish = new JButton("\u5237\u65B0\u8BA2\u5355\u4FE1\u606F");
		refurbish.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		refurbish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				page=1;
				show(panel,page);
			}
		});
		refurbish.setFont(new Font("幼圆", Font.PLAIN, 20));
		refurbish.setBounds(403, 10, 153, 57);
		panel_2.add(refurbish);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BA2\u5355\u5185\u5BB9");
		lblNewLabel_1.setFont(new Font("幼圆", Font.BOLD, 25));
		lblNewLabel_1.setBounds(95, 18, 145, 40);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u5546\u5BB6\u7535\u8BDD");
		lblNewLabel_1_1.setFont(new Font("幼圆", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(820, 18, 145, 40);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u652F\u4ED8\u91D1\u989D");
		lblNewLabel_1_1_1.setFont(new Font("幼圆", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(1088, 17, 145, 40);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\u8BA2\u5355\u72B6\u6001");
		lblNewLabel_1_1_1_1.setFont(new Font("幼圆", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(1339, 18, 145, 40);
		panel_2.add(lblNewLabel_1_1_1_1);

	}

	public  void show(JPanel panel, Integer page) {
		remove(panel);
		panel=new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(77, 85, 1410, 744);
		panel.setLayout(null);
		int i=0;
		remove(comboBoxPage);
		comboBoxPage = new JComboBox();
		maxpage = (int) Math.ceil(new OrderTheServices().orderTheCount(user.getId())/ 4.0);
		for (int i1 = 1; i1 <= maxpage; i1++) {
			comboBoxPage.addItem(i1);
		}
		comboBoxPage.setBounds(682, 854, 102, 30);
		add(comboBoxPage);
		List<OrderThe> list=new OrderTheServices().orderTheUserID(user.getId(),page);
		System.out.println(list.size());
		for (OrderThe o : list) {
			JPanel orderForm = new JPanel();
			orderForm.setBorder(new LineBorder(new Color(0, 0, 0)));
			orderForm.setBackground(SystemColor.control);
			orderForm.setBounds(0, 36*i+159*i, 1410, 159);
			orderForm.setLayout(null);
			i++;
			User shopp = null;
			try {
				shopp=new UserServices().idUser(o.getMerchantsID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			JLabel imageShop = new JLabel();
			if (shopp.getSculpture() != null) {
				BufferedImage bufferedImage = null;
				try {
					bufferedImage = ImageIO.read(new File("src/img/"+shopp.getSculpture()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     ImageIcon imageIcon = new ImageIcon(bufferedImage);
			     imageShop.setIcon(imageIcon);
			}
			imageShop.setBounds(21, 10, 216, 139);
			imageShop.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			orderForm.add(imageShop);
			
			JLabel shopName = new JLabel(shopp.getUserName());
			shopName.setFont(new Font("幼圆", Font.PLAIN, 25));
			shopName.setBounds(260, 31, 203, 26);
			orderForm.add(shopName);
			
			JLabel saleDate = new JLabel(o.getSaleDate());
			saleDate.setForeground(new Color(255, 0, 0));
			saleDate.setFont(new Font("幼圆", Font.PLAIN, 25));
			saleDate.setBounds(260, 104, 310, 26);
			orderForm.add(saleDate);
			
			JLabel xPhone = new JLabel(o.getxPhone());
			xPhone.setFont(new Font("幼圆", Font.BOLD, 25));
			xPhone.setBounds(727, 66, 192, 26);
			orderForm.add(xPhone);
			
			JLabel shoppingPrice = new JLabel("￥"+o.getShoppingPrice());
			shoppingPrice.setForeground(Color.RED);
			shoppingPrice.setFont(new Font("幼圆", Font.PLAIN, 25));
			shoppingPrice.setBounds(1011, 66, 158, 26);
			orderForm.add(shoppingPrice);
			
			JLabel satart=new JLabel();
			if(o.getOrderState().equals("1")) {
				satart = new JLabel("待确认");
			}else if(o.getOrderState().equals("2")) {
				satart = new JLabel("已接单");
			}else if(o.getOrderState().equals("3")) {
				satart = new JLabel("派送中");
			}else if(o.getOrderState().equals("4")) {
				satart = new JLabel("历史订单");
			}
			satart.setForeground(new Color(34, 139, 34));
			satart.setFont(new Font("幼圆", Font.PLAIN, 25));
			satart.setBounds(1262, 66, 101, 26);
			orderForm.add(satart);
			
			JLabel numberName = new JLabel("\u8BA2\u5355\u7F16\u53F7\uFF1A");
			numberName.setForeground(new Color(34, 139, 34));
			numberName.setFont(new Font("幼圆", Font.PLAIN, 25));
			numberName.setBounds(727, 104, 127, 26);
			orderForm.add(numberName);
			
			JLabel orderNumber = new JLabel(o.getOrderNumber());
			orderNumber.setForeground(new Color(34, 139, 34));
			orderNumber.setFont(new Font("幼圆", Font.PLAIN, 25));
			orderNumber.setBounds(846, 104, 371, 26);
			orderForm.add(orderNumber);
			orderForm.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					removeAll();
					JPanel jPanel = new UserPande6(o.getOrderId());
					jPanel.setBounds(0, 0, 1592, 925);
					add(jPanel);// panel1添加新的组件
					revalidate();// 对panel1面板中的组件重新布局并绘制
					repaint();// 对panel1本身进行重绘
				}
			});
			panel.add(orderForm);
		}
		add(panel);
		panel.revalidate();
		panel.repaint();
	}
}
