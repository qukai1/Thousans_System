package com.King.from.business1;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.King.from.login.LoginUser;
import com.King.util.Move;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
/**
 * 商家页面设计
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class SHopHome extends JFrame {
	// 下部
	JPanel jPanel = new Pande1();
	//导航头
	Panel topPanel = new Panel();
	public SHopHome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SHopHome.class.getResource("/img/logo.png")));
		//将值传入JPanel类中
		getContentPane().setEnabled(false);
		this.setUndecorated(true);
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screensize.getWidth();// 得到宽
		int height = (int) screensize.getHeight();// 得到高
		setBounds(width / 2 - 1593 / 2, height / 2 - 996 / 2, 1593, 997);
		//圆角
		//AWTUtilities.setWindowShape(this,new RoundRectangle2D.Double(0.0D, 0.0D, this.getWidth(), this.getHeight(), 30.0D,30.0D));
		getContentPane().setLayout(null);
		// 头部
		topPanel.setBackground(Color.WHITE);
		topPanel.setBounds(0, 0, 1592,100);
		getContentPane().add(topPanel);
		topPanel.setLayout(null);
		//默认下边
		jPanel.setBounds(0,100, 1592, 925);
		getContentPane().add(jPanel);
		// 菜单模块
		JLabel name1 = new JLabel("菜单模块");
		name1.setBounds(434, 30, 120, 30);
		// 订单模块
		JLabel name2 = new JLabel("订单模块");
		name2.setBounds(646, 30, 120, 30);
		// 个人信息
		JLabel name3 = new JLabel("个人信息");
		name3.setBounds(852, 30, 120, 30);
		// 退出模块
		JLabel name4 = new JLabel("切换账号");
		name4.setBounds(1058, 30, 120, 30);
		name4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);// 本窗口隐藏
				new LoginUser().setVisible(true);// 新窗口显示
				dispose();// 本窗口销毁,释放内存资源
			}
		});
		//文本按钮共同样式
		buttonnStyle(name1,name2,name3,name4);
		//默认name为黑色 
		name1.setForeground(Color.black);
		// 调用下面栏
		chileBut(name1, name2, name3, new Pande1());
		chileBut(name2, name1, name3, new Pande2());
		chileBut(name3, name2, name1, new Pande3());
		//logo
		JLabel logo = new JLabel("\u4E07\u5BA2\u6765\u70B9\u9910\u7CFB\u7EDF");
		logo.setForeground(Color.WHITE);
		logo.setFont(new Font("方正舒体", Font.BOLD | Font.ITALIC, 40));
		logo.setBounds(82, 11, 297, 71);
		topPanel.add(logo);
		//退出
		JLabel x = new JLabel(new ImageIcon(SHopHome.class.getResource("/img/x.png")));
		x.setBounds(1536, 18, 48, 48);
		topPanel.add(x);
		x.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		//缩小
		JLabel close = new JLabel(new ImageIcon(SHopHome.class.getResource("/img/-.png")));
		close.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		close.setBounds(1485, 18, 48, 48);
		topPanel.add(close);
		
		JLabel image = new JLabel(new ImageIcon(SHopHome.class.getResource("/img/logo.png")));
		image.setBackground(new Color(22, 12, 12, 55));
		image.setBounds(10, 11, 71, 70);
		topPanel.add(image);
		
		JLabel top_img = new JLabel("");
		top_img.setIcon(new ImageIcon("G:\\\u4E07\u5BA2\u6765\u70B9\u9910\\king\uFF085\u670819\u65E5\u7248\u672C\uFF09\\King\\src\\img\\\u5BFC\u822A\u56FE\u7247.png"));
		top_img.setBounds(0, 0, 1600, 100);
		topPanel.add(top_img);
		
		//鼠标移动
		new Move(this);
	}
	
	/**
	 * 按钮共同样式
	 */
	public void buttonnStyle(JLabel...j) {
		for (JLabel jLabel : j) {
			jLabel.setForeground(Color.WHITE);
			jLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
			topPanel.add(jLabel);
		}
	}
	
	public void chileBut(JLabel name1, JLabel name2, JLabel name3, JPanel buttomJPanle) {
		name1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				name1.setForeground(Color.black);
				name2.setForeground(Color.WHITE);
				name3.setForeground(Color.WHITE);
				remove(jPanel);
				jPanel = buttomJPanle;
				jPanel.setBounds(0, 100,1592, 925);
				getContentPane().add(jPanel);// panel1添加新的组件
				revalidate();// 对panel1面板中的组件重新布局并绘制
				repaint();// 对panel1本身进行重绘
			}
		});
	}
}
