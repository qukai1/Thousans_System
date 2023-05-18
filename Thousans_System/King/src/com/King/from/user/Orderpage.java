package com.King.from.user;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class Orderpage extends JFrame {

	private JPanel contentPane;
	boolean isDraging;
    private Point p;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orderpage frame = new Orderpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
//		u.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Orderpage() {
		//窗口的标题
		setTitle("\u4E07\u5BA2\u6765\u70B9\u9910\u7CFB\u7EDF");
		//窗口的图表设置
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\\u4E07\u5BA2\u6765\u70B9\u9910\\\u9875\u9762 \u56FE\\\u9875\u9762\u56FE\u6F58\\logo\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//窗口关闭程序也停止
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screensize.getWidth();// 得到宽
		int height = (int) screensize.getHeight();// 得到高

		setBounds(width / 2 - 1500 / 2, height / 2 - 800 / 2, 1500, 800);
		//窗口的大小
		//窗口内容面板
		contentPane = new JPanel();
		//设置内容面板的大小
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//this.getContentPane().setBackground(new Color(195, 184, 162)); // 设置窗体背景颜色
        this.setUndecorated(true);// 取消窗体修饰效果
        this.setAlwaysOnTop(true); //窗体最顶层显
        //this.setBounds(100, 100, 354, 206);//设置尺寸
        //this.setVisible(true);//窗体可见

		contentPane.setLayout(null);
           //底层内容面板
           JLabel lblNewLabel = new JLabel("\u4E07\u5BA2\u6765\u70B9\u9910\u7CFB\u7EDF");
           lblNewLabel.setForeground(new Color(255, 255, 255));
           lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD | Font.ITALIC, 15));
           lblNewLabel.setBounds(67, 16, 139, 23);
           contentPane.add(lblNewLabel);
           
           //内容跳转面板--首页
           JPanel body_home = new JPanel();
           body_home.setBackground(Color.WHITE);
           body_home.setBounds(0, 49, 1500, 751);
           contentPane.add(body_home);
           body_home.setLayout(null);
           //首页的内容面板
           JPanel body_home_dome = new JPanel();
           body_home_dome.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, Color.GRAY));
           body_home_dome.setBackground(new Color(255, 255, 255));
           body_home_dome.setBounds(0, 0, 1500, 70);
           body_home.add(body_home_dome);
           body_home_dome.setLayout(null);
           //筛选行的logo
           JLabel body_home_dome_img = new JLabel("");
           body_home_dome_img.setIcon(new ImageIcon("G:\\\u4E07\u5BA2\u6765\u70B9\u9910\\\u9875\u9762 \u56FE\\\u9875\u9762\u56FE\u6F58\\\u5BFC\u822Alogo.png"));
           body_home_dome_img.setBounds(59, 10, 52, 50);
           body_home_dome.add(body_home_dome_img);
           //商家分类
           JLabel classify = new JLabel("\u5546\u5BB6\u5206\u7C7B");
           classify.setFont(new Font("微软雅黑", Font.BOLD, 22));
           classify.setBounds(110, 17, 90, 40);
           body_home_dome.add(classify);
           
           
           
           //筛选的按钮
           JButton whole = new JButton("\u5168\u90E8");
           whole.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		

           	}});
           whole.setFont(new Font("微软雅黑", Font.PLAIN, 17));
           whole.setBounds(237, 22, 74, 29);
           body_home_dome.add(whole);
           //whole.
           whole.setContentAreaFilled(false);		//将按钮设为透明
		   whole.setFocusable(false);//设置点击时候字旁边的边框
           whole.setContentAreaFilled(false);
           whole.setBorderPainted(false);//关闭按钮的边框
           //whole.setBorder(BorderFactory.createRaisedBevelBorder());
           //whole.setFont(new  java.awt.Font("华文行楷",  1,  15));
           //whole.setBackground(Color.red);
           //whole.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           
           
//           whole.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mousePressed(MouseEvent e) {
//					//鼠标点击时，去除鼠标 mouseMoved 事件 添加的背景色
//					JToggleButton btn = (JToggleButton)e.getSource();
//					btn.setBackground(null);
//				}
//				@Override
//				public void mouseExited(MouseEvent e){
//					//仅当鼠标没有处于选中状态时，才将按钮设置为透明
//					JToggleButton btn = (JToggleButton)e.getSource();
//					if(!btn.isSelected()) {
//						btn.setContentAreaFilled(false);
//					}
//				}
//			});
  
           
           
           
           //全部筛选按钮
           JButton wholee = new JButton("\u5C0F\u5403");
           wholee.setFont(new Font("微软雅黑", Font.PLAIN, 17));
           wholee.setBounds(381, 22, 74, 29);
           body_home_dome.add(wholee);
           wholee.setContentAreaFilled(false);		//将按钮设为透明
		   wholee.setFocusable(false);//设置点击时候字旁边的边框
           wholee.setContentAreaFilled(false);
           wholee.setBorderPainted(false);//关闭按钮的边框
           wholee.addMouseListener((MouseListener) new MouseListener(){
    			
        	   public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下
      				wholee.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				wholee.setForeground(Color.black);
      			}
      			
      		});
           
           //小吃筛选按钮
           JButton afternoon = new JButton("\u4E0B\u5348\u8336");
           afternoon.setFont(new Font("微软雅黑", Font.PLAIN, 17));
           afternoon.setBounds(522, 22, 90, 29);
           body_home_dome.add(afternoon);
           afternoon.setContentAreaFilled(false);		//将按钮设为透明
           afternoon.setFocusable(false);//设置点击时候字旁边的边框
           afternoon.setContentAreaFilled(false);
           afternoon.setBorderPainted(false);//关闭按钮的边框
           afternoon.addMouseListener((MouseListener) new MouseListener(){
   			
        	   public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下
      				afternoon.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				afternoon.setForeground(Color.black);
      			}
      			
      		});
           
           //下午茶
           JButton Western = new JButton("\u897F\u9910");
           Western.setFont(new Font("微软雅黑", Font.PLAIN, 17));
           Western.setBounds(680, 22, 74, 29);
           body_home_dome.add(Western);
           Western.setContentAreaFilled(false);		//将按钮设为透明
           Western.setFocusable(false);//设置点击时候字旁边的边框
           Western.setContentAreaFilled(false);
           Western.setBorderPainted(false);//关闭按钮的边框
           Western.addMouseListener((MouseListener) new MouseListener(){
      			
        	   public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下
      				Western.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				Western.setForeground(Color.black);
      			}
      			
      		});
           
           //西餐
           JButton snack = new JButton("\u5FEB\u9910");
           snack.setFont(new Font("微软雅黑", Font.PLAIN, 17));
           snack.setBounds(827, 22, 74, 29);
           body_home_dome.add(snack);
           snack.setContentAreaFilled(false);		//将按钮设为透明
           snack.setFocusable(false);//设置点击时候字旁边的边框
           snack.setContentAreaFilled(false);
           snack.setBorderPainted(false);//关闭按钮的边框
           snack.addMouseListener((MouseListener) new MouseListener(){
      			
        	   public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下
      				snack.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				snack.setForeground(Color.black);
      			}
      			
      		});
           
           //快餐
           JButton barbecue = new JButton("\u70E7\u70E4");
           barbecue.setFont(new Font("微软雅黑", Font.PLAIN, 17));
           barbecue.setBounds(965, 22, 74, 29);
           body_home_dome.add(barbecue);
           barbecue.setContentAreaFilled(false);		//将按钮设为透明
           barbecue.setFocusable(false);//设置点击时候字旁边的边框
           barbecue.setContentAreaFilled(false);
           barbecue.setBorderPainted(false);//关闭按钮的边框
           barbecue.addMouseListener((MouseListener) new MouseListener(){
      			
        	   public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下
      				barbecue.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				barbecue.setForeground(Color.black);
      			}
      			
      		});
           
           //获取值的文本框
           
           JTextField searchbox = new JTextField();
           searchbox.setBounds(1150, 17, 195, 38);
           body_home_dome.add(searchbox);
           searchbox.setColumns(10);
           //搜索图标按钮
           JButton search_push = new JButton("\u641C\u7D22");
           search_push.setFont(new Font("微软雅黑", Font.PLAIN, 18));
           search_push.setBackground(new Color(0, 0, 0));
           search_push.setBounds(1340, 17, 81, 38);
//           search_push.setContentAreaFilled(false);
//           search_push.setBorderPainted(false);
           search_push.setContentAreaFilled(false);		//将按钮设为透明
           search_push.setFocusable(false);//设置点击时候字旁边的边框
           search_push.setContentAreaFilled(false);
           search_push.setBorderPainted(false);//关闭按钮的边框
           body_home_dome.add(search_push);
           search_push.addMouseListener((MouseListener) new MouseListener(){
     			public void mouseClicked(MouseEvent e) {
     				// 处理鼠标点击
     			}
     			public void mouseEntered(MouseEvent e) {
     				// 处理鼠标移入
     			}
     			public void mouseExited(MouseEvent e) {
     				// 处理鼠标离开
     			}
     			public void mousePressed(MouseEvent e) {
     				// 处理鼠标按下\
     				search_push.setForeground(Color.red);
     				
     				

     			}
     			public void mouseReleased(MouseEvent e) {
     				// 处理鼠标释放
     				search_push.setForeground(Color.black);

     			}
     		});
           
           //首页的菜品展示面板的创建
           JPanel conut_panel = new JPanel();
           conut_panel.setBounds(0, 76, 1500, 675);
           body_home.add(conut_panel);
           conut_panel.setLayout(new GridLayout(0,4,10,10));
           
           
           
           //菜品展示的内容按钮填充效果
           JButton btnNewButton = new JButton("菜品信息一");
           conut_panel.add(btnNewButton);
           
           JButton btnNewButton_1 = new JButton("菜品信息二");
           conut_panel.add(btnNewButton_1);
           
           JButton btnNewButton_4 = new JButton("菜品信息三");
           conut_panel.add(btnNewButton_4);
           
           JButton btnNewButton_2 = new JButton("菜品信息四");
           conut_panel.add(btnNewButton_2);
           
           JButton btnNewButton_3 = new JButton("菜品信息五");
           conut_panel.add(btnNewButton_3);
           
           JButton btnNewButton_5 = new JButton("菜品信息六");
           conut_panel.add(btnNewButton_5);
           
           JButton btnNewButton_6 = new JButton("菜品信息七");
           conut_panel.add(btnNewButton_6);
           
           JButton btnNewButton_7 = new JButton("菜品信息八");
           conut_panel.add(btnNewButton_7);
           JButton j=new JButton("菜品信息九");
           j.setBounds(0,0,10,10);
           JButton j1=new JButton("菜品信息十");
           j1.setBounds(0,0,10,10);
           JButton j2=new JButton("菜品信息十一");
           JButton j3=new JButton("菜品信息十二");
           conut_panel.add(j3);
           conut_panel.add(j1);
           conut_panel.add(j2);
           conut_panel.add(j);
           
           
           
           
           
           
           
           
           //菜单内容面板
           JPanel Content_panel = new JPanel();
           Content_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
           Content_panel.setBackground(new Color(255, 235, 205));
           Content_panel.setBounds(0, 70, 1500, 681);

           body_home.setVisible(true);
           
           
           //内容跳转面板--我的订单
           JPanel body_home2 = new JPanel();
           body_home2.setBackground(new Color(255, 255, 255));
           body_home2.setBounds(0, 49, 1500, 751);
           contentPane.add(body_home2);
           body_home2.setLayout(null);
           
           JPanel dingdan = new JPanel();
           dingdan.setBounds(0, 0, 1500, 77);
           body_home2.add(dingdan);
           dingdan.setLayout(null);
           
           JLabel lblNewLabel_3 = new JLabel("\u8BA2\u5355\u5185\u5BB9\uFF1A");
           lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_3.setBounds(60, 20, 130, 41);
           dingdan.add(lblNewLabel_3);
           
           JLabel lblNewLabel_3_1 = new JLabel("\u5546\u5BB6\u7535\u8BDD\uFF1A");
           lblNewLabel_3_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_3_1.setBounds(726, 20, 130, 41);
           dingdan.add(lblNewLabel_3_1);
           
           JLabel lblNewLabel_3_1_1 = new JLabel("\u8BA2\u5355\u91D1\u989D\uFF1A");
           lblNewLabel_3_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_3_1_1.setBounds(1030, 20, 130, 41);
           dingdan.add(lblNewLabel_3_1_1);
           
           JLabel lblNewLabel_3_1_2 = new JLabel("\u8BA2\u5355\u72B6\u6001\uFF1A");
           lblNewLabel_3_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_3_1_2.setBounds(1353, 20, 137, 41);
           dingdan.add(lblNewLabel_3_1_2);
           
           JPanel dingdan_body = new JPanel();
           dingdan_body.setBackground(Color.WHITE);
           dingdan_body.setBounds(0, 78, 1500, 673);
           body_home2.add(dingdan_body);
           dingdan_body.setLayout(new GridLayout(4, 3, 0, 5));
          

           
           JButton btnNewButton_13 = new JButton("订单一");
           dingdan_body.add(btnNewButton_13);
           
           JButton btnNewButton_14 = new JButton("订单二");
           dingdan_body.add(btnNewButton_14);
           
           JButton btnNewButton_12 = new JButton("订单三");
           dingdan_body.add(btnNewButton_12);
           body_home2.setVisible(false);
           
           //我的资料中修改密码的父类窗口
           JPanel body_home3 = new JPanel();
           body_home3.setBackground(Color.BLUE);
           body_home3.setBounds(0, 49, 1500, 751);
           contentPane.add(body_home3);
           body_home3.setLayout(null);
           //修改资料密码的子类实现窗口
           JPanel datum = new JPanel();
           datum.setBackground(new Color(255, 140, 0));
           datum.setBounds(0, 0, 1500, 751);
           body_home3.add(datum);
           datum.setLayout(null);
           //修改资料页面
           JPanel change_information = new JPanel();
           change_information.setBounds(294, 0, 1204, 751);
           datum.add(change_information);
           change_information.setLayout(null);
           change_information.setVisible(true);
           //修改资料的组件
           JLabel lblNewLabel_1 = new JLabel("\u539F\u4FE1\u606F\uFF1A");
           lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_1.setBounds(185, 176, 99, 48);
           change_information.add(lblNewLabel_1);
           
           JLabel lblNewLabel_1_1 = new JLabel("\u59D3\u540D\uFF1A");
           lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_1_1.setBounds(185, 250, 90, 48);
           change_information.add(lblNewLabel_1_1);
           
           JLabel lblNewLabel_1_1_1 = new JLabel("\u5730\u5740\uFF1A");
           lblNewLabel_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_1_1_1.setBounds(185, 396, 99, 48);
           change_information.add(lblNewLabel_1_1_1);
           
           JLabel lblNewLabel_1_1_1_1 = new JLabel("\u624B\u673A\u53F7\u7801\uFF1A");
           lblNewLabel_1_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_1_1_1_1.setBounds(185, 325, 99, 48);
           change_information.add(lblNewLabel_1_1_1_1);
           
           textField = new JTextField();
           textField.setBounds(299, 255, 266, 40);
           change_information.add(textField);
           textField.setColumns(10);
           
           textField_1 = new JTextField();
           textField_1.setColumns(10);
           textField_1.setBounds(299, 330, 266, 40);
           change_information.add(textField_1);
           
           JTextArea textArea = new JTextArea();
           textArea.setBounds(299, 404, 633, 152);
           change_information.add(textArea);
           //修改资料页面的确定按钮
           JButton btnNewButton_9 = new JButton("\u786E\u5B9A");
           btnNewButton_9.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           	}
           });
           btnNewButton_9.setFont(new Font("微软雅黑", Font.PLAIN, 30));
           btnNewButton_9.setBounds(185, 623, 188, 75);
           change_information.add(btnNewButton_9);
           btnNewButton_9.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_9.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_9.setContentAreaFilled(false);
           btnNewButton_9.setBorderPainted(false);//关闭按钮的边框
           
           
           //修改资料的重置按钮
           JButton btnNewButton_9_1 = new JButton("\u91CD\u7F6E");
           btnNewButton_9_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
           btnNewButton_9_1.setBounds(537, 623, 188, 75);
           change_information.add(btnNewButton_9_1);
           btnNewButton_9_1.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_9_1.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_9_1.setContentAreaFilled(false);
           btnNewButton_9_1.setBorderPainted(false);//关闭按钮的边框
           
           //修改资料的注销账号的按钮
           JButton btnNewButton_9_2 = new JButton("\u6CE8\u9500\u8D26\u53F7");
           btnNewButton_9_2.setFont(new Font("微软雅黑", Font.PLAIN, 30));
           btnNewButton_9_2.setBounds(917, 623, 188, 75);
           change_information.add(btnNewButton_9_2);
           btnNewButton_9_2.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_9_2.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_9_2.setContentAreaFilled(false);
           btnNewButton_9_2.setBorderPainted(false);//关闭按钮的边框
           
           //修改密码页面
           JPanel change_password = new JPanel();
           change_password.setBackground(new Color(255, 255, 255));
           change_password.setBounds(296, 0, 1202, 751);
           datum.add(change_password);
           change_password.setLayout(null);
           change_password.setVisible(false);
           //修改密码按钮
           JButton btnNewButton_8_1 = new JButton("\u4FEE\u6539\u5BC6\u7801");
           //按钮的初始化颜色
           btnNewButton_8_1.setForeground(Color.WHITE);
           btnNewButton_8_1.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		change_information.setVisible(false);
           		change_password.setVisible(true);
           	}
           });
           //设置按钮的响应时间做动态效果
           btnNewButton_8_1.addMouseListener((MouseListener) new MouseListener(){
     			
        	   public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下
      				btnNewButton_8_1.setForeground(Color.CYAN);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				btnNewButton_8_1.setForeground(Color.WHITE);
      			}
      			
      		});
           
           
           btnNewButton_8_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
           btnNewButton_8_1.setBounds(44, 509, 224, 71);
           datum.add(btnNewButton_8_1);
           btnNewButton_8_1.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_8_1.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_8_1.setContentAreaFilled(false);
           btnNewButton_8_1.setBorderPainted(false);//关闭按钮的边框
           
           
           
           
           //修改资料按钮
           JButton btnNewButton_8 = new JButton("\u4FEE\u6539\u8D44\u6599");
           btnNewButton_8.setForeground(Color.WHITE);
           btnNewButton_8.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		
           		change_password.setVisible(false);
           		change_information.setVisible(true);
           		
           	}
           });
           btnNewButton_8.setFont(new Font("微软雅黑", Font.PLAIN, 30));
           btnNewButton_8.setBounds(44, 263, 224, 71);
           datum.add(btnNewButton_8);
           btnNewButton_8.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_8.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_8.setContentAreaFilled(false);
           btnNewButton_8.setBorderPainted(false);//关闭按钮的边框
           
           
           
           
           JLabel lblNewLabel_2 = new JLabel("\u539F\u4FE1\u606F:");
           lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 30));
           lblNewLabel_2.setBounds(181, 86, 108, 55);
           change_password.add(lblNewLabel_2);
     
           
     
           JLabel lblNewLabel_2_1 = new JLabel("\u8D26\u53F7\uFF1A");
           lblNewLabel_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_2_1.setBounds(181, 185, 108, 55);
           change_password.add(lblNewLabel_2_1);
         
           JLabel lblNewLabel_2_2 = new JLabel("\u5BC6\u7801:");
           lblNewLabel_2_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_2_2.setBounds(181, 290, 108, 55);
           change_password.add(lblNewLabel_2_2);
           
           textField_2 = new JTextField();
           textField_2.setBounds(271, 190, 302, 42);
           change_password.add(textField_2);
           textField_2.setColumns(10);
           
           textField_3 = new JTextField();
           textField_3.setColumns(10);
           textField_3.setBounds(271, 298, 302, 42);
           change_password.add(textField_3);
           
           JLabel lblNewLabel_2_2_1 = new JLabel("\u9A8C\u8BC1\u7801:");
           lblNewLabel_2_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           lblNewLabel_2_2_1.setBounds(181, 385, 108, 55);
           change_password.add(lblNewLabel_2_2_1);
           
           textField_4 = new JTextField();
           textField_4.setColumns(10);
           textField_4.setBounds(299, 395, 302, 42);
           change_password.add(textField_4);
           //修改密码的刷新按钮
           JButton btnNewButton_10 = new JButton("\u5237\u65B0");
           btnNewButton_10.setFont(new Font("微软雅黑", Font.PLAIN, 20));
           btnNewButton_10.setBounds(699, 385, 108, 55);
           change_password.add(btnNewButton_10);
           btnNewButton_10.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_10.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_10.setContentAreaFilled(false);
           btnNewButton_10.setBorderPainted(false);//关闭按钮的边框
           
           //修改密码的确定按钮
           JButton btnNewButton_11 = new JButton("\u786E\u5B9A");
           btnNewButton_11.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           btnNewButton_11.setBounds(181, 562, 209, 65);
           change_password.add(btnNewButton_11);
           btnNewButton_11.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_11.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_11.setContentAreaFilled(false);
           btnNewButton_11.setBorderPainted(false);//关闭按钮的边框
           
           //修改密码的重置按钮
           JButton btnNewButton_11_1 = new JButton("\u91CD\u7F6E");
           btnNewButton_11_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           btnNewButton_11_1.setBounds(560, 562, 209, 65);
           change_password.add(btnNewButton_11_1);
           btnNewButton_11_1.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_11_1.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_11_1.setContentAreaFilled(false);
           btnNewButton_11_1.setBorderPainted(false);//关闭按钮的边框
           
           //修改密码的注销按钮
           JButton btnNewButton_11_2 = new JButton("\u6CE8\u9500\u8D26\u53F7");
           btnNewButton_11_2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
           btnNewButton_11_2.setBounds(973, 562, 209, 65);
           change_password.add(btnNewButton_11_2);
           btnNewButton_11_2.setContentAreaFilled(false);		//将按钮设为透明
           btnNewButton_11_2.setFocusable(false);//设置点击时候字旁边的边框
           btnNewButton_11_2.setContentAreaFilled(false);
           btnNewButton_11_2.setBorderPainted(false);//关闭按钮的边框
           
           body_home3.setVisible(false);
          
           
           JLabel logo = new JLabel("");
           logo.setIcon(new ImageIcon("G:\\\u4E07\u5BA2\u6765\u70B9\u9910\\\u9875\u9762 \u56FE\\\u9875\u9762\u56FE\u6F58\\\u5BFC\u822Alogo.png"));
           logo.setBounds(0, 0, 57, 49);
           contentPane.add(logo);
           
           
           
           //设置文字按钮的监听事件，文字达到按钮的效果
           //首页按钮
           JLabel button_1 = new JLabel("\u9996\u9875");
           button_1.setForeground(Color.WHITE);
           button_1.setFont(new Font("微软雅黑", Font.PLAIN, 22));
           button_1.setBackground(Color.WHITE);
           button_1.setBounds(294, 10, 50, 31);
           contentPane.add(button_1);
           button_1.addMouseListener((MouseListener) new MouseListener(){
     			
        	   public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下
      	           button_1.setForeground(Color.red);
      	         body_home.setVisible(true);
   				body_home2.setVisible(false);
   				body_home3.setVisible(false);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				button_1.setForeground(Color.WHITE);      			}
      			
      		});
           
           //切换账号
           JLabel button_2 = new JLabel("\u5207\u6362\u8D26\u53F7");
           button_2.setForeground(new Color(255, 255, 255));
           button_2.setFont(new Font("微软雅黑", Font.PLAIN, 22));
           button_2.setBackground(Color.RED);
           button_2.setBounds(1000, 10, 115, 31);
           contentPane.add(button_2);
           button_2.addMouseListener((MouseListener) new MouseListener(){
    			
        	   public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下
      				button_2.setForeground(Color.red);

      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				button_2.setForeground(Color.WHITE);      			}
      			
      		});
           
           
           //最小化文字按钮
           JLabel button_reduce = new JLabel("\u2014\u2014");
           button_reduce.setForeground(new Color(255, 255, 255));
           button_reduce.setFont(new Font("微软雅黑", Font.PLAIN, 20));
           button_reduce.setBackground(Color.RED);
           button_reduce.setBounds(1389, 10, 46, 31);
           contentPane.add(button_reduce);
           //最小化文字按钮的监听事件用于实现按钮相同功能
           button_reduce.addMouseListener((MouseListener) new MouseListener(){
   			public void mouseClicked(MouseEvent e) {
   				// 处理鼠标点击
   			}
   			public void mouseEntered(MouseEvent e) {
   				// 处理鼠标移入
   			}
   			public void mouseExited(MouseEvent e) {
   				// 处理鼠标离开
   			}
   			public void mousePressed(MouseEvent e) {
   				// 处理鼠标按下
  				button_reduce.setForeground(Color.red);
   				setExtendedState(JFrame.ICONIFIED);

   			}
   			public void mouseReleased(MouseEvent e) {
   				// 处理鼠标释放
  				button_reduce.setForeground(Color.WHITE);

   			}
   		});
           //关闭文字按钮
           JLabel button_close = new JLabel("X");
           button_close.setForeground(new Color(255, 255, 255));
           button_close.setFont(new Font("微软雅黑", Font.PLAIN, 20));
           button_close.setBackground(Color.RED);
           button_close.setBounds(1445, 10, 46, 31);
           contentPane.add(button_close);
         //关闭按钮
           button_close.addMouseListener((MouseListener) new MouseListener(){
      			public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				// 处理鼠标按下\
      				button_close.setForeground(Color.red);
      				dispose();
      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				button_close.setForeground(Color.WHITE);

      			}
      		});
           //我的订单
           JLabel button_3 = new JLabel("\u6211\u7684\u8BA2\u5355");
           button_3.setForeground(new Color(255, 255, 255));
           button_3.setFont(new Font("微软雅黑", Font.PLAIN, 22));
           button_3.setBackground(Color.RED);
           button_3.setBounds(500, 10, 102, 31);
           contentPane.add(button_3);
           button_3.addMouseListener((MouseListener) new MouseListener(){
     			public void mouseClicked(MouseEvent e) {
     				// 处理鼠标点击
     			}
     			public void mouseEntered(MouseEvent e) {
     				// 处理鼠标移入
     			}
     			public void mouseExited(MouseEvent e) {
     				// 处理鼠标离开
     			}
     			public void mousePressed(MouseEvent e) {
     				body_home.setVisible(false);
     				body_home2.setVisible(true);
     				body_home3.setVisible(false);
      				button_3.setForeground(Color.red);

     			}
     			public void mouseReleased(MouseEvent e) {
     				// 处理鼠标释放
      				button_3.setForeground(Color.WHITE);

     			}
     		});
           
           //我的资料
           JLabel button_4 = new JLabel("\u6211\u7684\u8D44\u6599");
           button_4.setForeground(new Color(255, 255, 255));
           button_4.setFont(new Font("微软雅黑", Font.PLAIN, 22));
           button_4.setBackground(Color.RED);
           button_4.setBounds(750, 10, 102, 31);
           contentPane.add(button_4);
         //设置我的资料文字按钮的单击事件
           button_4.addMouseListener((MouseListener) new MouseListener(){
      			public void mouseClicked(MouseEvent e) {
      				// 处理鼠标点击
      			}
      			public void mouseEntered(MouseEvent e) {
      				// 处理鼠标移入
      			}
      			public void mouseExited(MouseEvent e) {
      				// 处理鼠标离开
      			}
      			public void mousePressed(MouseEvent e) {
      				body_home.setVisible(false);
      				body_home2.setVisible(false);
      				body_home3.setVisible(true);
      				button_4.setForeground(Color.red);

      			}
      			public void mouseReleased(MouseEvent e) {
      				// 处理鼠标释放
      				button_4.setForeground(Color.WHITE);

      			}
      		});
          
          
           



           
           //获取鼠标的实时位置
           
        // 移动当前窗体
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					p = e.getPoint();
				}

				public void mouseReleased(MouseEvent e) {
					
					
					
				}
			});
			//鼠标的焦点如果按下去了则拖动窗口
			this.addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					Point p1 = e.getPoint();
					Point p2 = getLocation(null);
					p2.x += p1.x - p.x;
					p2.y += p1.y - p.y;
					setLocation(p2);
				}
			});

		
	}
}
