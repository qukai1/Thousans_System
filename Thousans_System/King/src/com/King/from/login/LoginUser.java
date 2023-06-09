package com.King.from.login;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import com.King.from.business.SHopHome;
import com.King.from.user.UserHome;
import com.King.from.user.UserPande1;
import com.King.pojo.User;
import com.King.serives.UserServices;
import com.King.util.Move;
import com.King.util.RoundPanel;
import com.King.util.VerifiCode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
@SuppressWarnings("serial")
public class LoginUser extends JFrame {
	public LoginUser() {
		this.setUndecorated(true);
		setFont(new Font("Dialog", Font.BOLD, 10));
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		setTitle("\u767B\u5F55\u9875\u9762");
		int width = (int) screensize.getWidth();// 得到宽
		int height = (int) screensize.getHeight();// 得到高
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon1 = new ImageIcon("src/img/logo.png");
		this.setIconImage(icon1.getImage());
		setBounds(width / 2 - 400, height / 2 - 250, 796, 450);
		//AWTUtilities.setWindowShape(this,
				//new RoundRectangle2D.Double(0.0D, 0.0D, this.getWidth(), this.getHeight(), 30.0D, 30.0D));
		// 最大面板
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setOpaque(true);
		contentPane.setLocation (100, 100);
		contentPane.setForeground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		RoundPanel panel = new RoundPanel();
		panel.setBounds(123, 19, 550, 412);
		panel.setBackground(new Color(22, 12, 12, 55));
		contentPane.add(panel);
		contentPane.setSize(300, 300);
		panel.setLayout(null);

		JLabel user_1 = new JLabel("\u7528\u6237\u540D:");
		user_1.setBounds(80, 106, 114, 30);
		panel.add(user_1);
		user_1.setForeground(Color.WHITE);
		user_1.setFont(new Font("宋体", Font.BOLD, 30));
		// 账号框
		JTextField user1 = new JTextField();
		user1.setBounds(204, 106, 243, 30);
		panel.add(user1);
		user1.setColumns(10);
		// 密码框
		JPasswordField pass1 = new JPasswordField();
		pass1.setBounds(204, 162, 243, 30);
		panel.add(pass1);
		pass1.setColumns(10);

		JLabel pass = new JLabel("\u5BC6\u7801:");
		pass.setBounds(111, 162, 83, 30);
		panel.add(pass);
		pass.setForeground(Color.WHITE);
		pass.setFont(new Font("宋体", Font.PLAIN, 30));

		JLabel pass_1 = new JLabel("\u9A8C\u8BC1\u7801:");
		pass_1.setBounds(111, 222, 83, 30);
		panel.add(pass_1);
		pass_1.setForeground(Color.WHITE);
		pass_1.setFont(new Font("宋体", Font.BOLD, 20));

		JTextField identifying = new JTextField();
		identifying.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		identifying.setForeground(new Color(0, 0, 255));
		identifying.setBounds(204, 222, 136, 30);
		panel.add(identifying);
		identifying.setColumns(10);
		JButton login_1 = new JButton("\u767B\u5F55");
		login_1.setFont(new Font("华文新魏", Font.PLAIN, 20));
		login_1.setBackground(new Color(218, 165, 32));
		login_1.setForeground(new Color(0, 0, 0));
		login_1.setBounds(151, 297, 115, 50);
		panel.add(login_1);
		JButton password = new JButton("\u627E\u56DE\u5BC6\u7801");
		password.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));

		password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ForgetUser().setVisible(true);
			}
		});
		password.setBackground(new Color(219, 112, 147));
		password.setBounds(337, 297, 110, 50);
		panel.add(password);

		JLabel lblNewLabel_1 = new JLabel("\u8FD8\u6CA1\u6709\u8D26\u53F7\uFF1F\u70B9\u51FB\u6CE8\u518C");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new RegisterUser().setVisible(true);
			}
		});
		lblNewLabel_1.setForeground(new Color(0, 0, 153));
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(21, 383, 245, 19);
		panel.add(lblNewLabel_1);

		JLabel logoName_1 = new JLabel("\u4E07\u5BA2\u6765\u70B9\u9910\u7CFB\u7EDF");
		logoName_1.setBounds(149, 10, 300, 86);
		panel.add(logoName_1);
		logoName_1.setForeground(Color.ORANGE);
		logoName_1.setFont(new Font("幼圆", Font.BOLD, 40));

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(65, 0, 90, 90);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(LoginUser.class.getResource("/img/logo.png")));
		lblNewLabel_2.setBackground(new Color(22, 12, 12, 55));

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 796, 450);
		lblNewLabel.setIcon(new ImageIcon(LoginUser.class.getResource("/img/gif背景.gif")));
		contentPane.add(lblNewLabel);
		login_1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
		login_1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));

		// 验证码
		VerifiCode code = new VerifiCode();
		JLabel image = new JLabel(new ImageIcon(code.getImage()));
		image.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				image.setIcon(new ImageIcon(code.getImage()));
			}
		});
		image.setBounds(347, 222, 100, 30);
		panel.add(image);
		login_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = user1.getText();
				String pass = new String(pass1.getPassword());
				if (name.isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "账号不能为空");
				} else if (pass.isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "密码不能为空");
				} else if (identifying.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "验证码不能为空");
				} else if (!new String(identifying.getText().toUpperCase()).equals(code.getText().toUpperCase())) {
					JOptionPane.showMessageDialog(contentPane, "验证码错误");
				} else {
					User user = null;
					try {
						user = new UserServices().loginUser(new String(user1.getText()),
								new String(pass1.getPassword()));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} finally {
						if (user.getId() == null) {
							JOptionPane.showMessageDialog(contentPane, "登录失败");
						} else {
							if (user.getType().equals("普通用户")) {
								setVisible(false);
								removeAll();
								UserPande1.user=user;
								new UserHome().setVisible(true);
							} else if (user.getType().equals("商家")) {
								setVisible(false);// 本窗口隐藏
								removeAll();
								com.King.from.business.JPanel.user = user;
								new com.King.from.business.SHopHome().setVisible(true);
								dispose();// 本窗口销毁,释放内存资
							}
						}
					}
				}
			}
		});
		this.setResizable(false);
		// 鼠标移动按钮
		new Move(this);
	}

	public static void main(String[] args) {
		try {
			// 设置本属性将改变窗口边框样式定义
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO exception
		}
		new LoginUser().setVisible(true);
	}
}
