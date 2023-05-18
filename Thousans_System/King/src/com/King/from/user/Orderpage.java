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
		//���ڵı���
		setTitle("\u4E07\u5BA2\u6765\u70B9\u9910\u7CFB\u7EDF");
		//���ڵ�ͼ������
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\\u4E07\u5BA2\u6765\u70B9\u9910\\\u9875\u9762 \u56FE\\\u9875\u9762\u56FE\u6F58\\logo\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ڹرճ���Ҳֹͣ
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screensize.getWidth();// �õ���
		int height = (int) screensize.getHeight();// �õ���

		setBounds(width / 2 - 1500 / 2, height / 2 - 800 / 2, 1500, 800);
		//���ڵĴ�С
		//�����������
		contentPane = new JPanel();
		//�����������Ĵ�С
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//this.getContentPane().setBackground(new Color(195, 184, 162)); // ���ô��屳����ɫ
        this.setUndecorated(true);// ȡ����������Ч��
        this.setAlwaysOnTop(true); //���������
        //this.setBounds(100, 100, 354, 206);//���óߴ�
        //this.setVisible(true);//����ɼ�

		contentPane.setLayout(null);
           //�ײ��������
           JLabel lblNewLabel = new JLabel("\u4E07\u5BA2\u6765\u70B9\u9910\u7CFB\u7EDF");
           lblNewLabel.setForeground(new Color(255, 255, 255));
           lblNewLabel.setFont(new Font("΢���ź�", Font.BOLD | Font.ITALIC, 15));
           lblNewLabel.setBounds(67, 16, 139, 23);
           contentPane.add(lblNewLabel);
           
           //������ת���--��ҳ
           JPanel body_home = new JPanel();
           body_home.setBackground(Color.WHITE);
           body_home.setBounds(0, 49, 1500, 751);
           contentPane.add(body_home);
           body_home.setLayout(null);
           //��ҳ���������
           JPanel body_home_dome = new JPanel();
           body_home_dome.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, Color.GRAY));
           body_home_dome.setBackground(new Color(255, 255, 255));
           body_home_dome.setBounds(0, 0, 1500, 70);
           body_home.add(body_home_dome);
           body_home_dome.setLayout(null);
           //ɸѡ�е�logo
           JLabel body_home_dome_img = new JLabel("");
           body_home_dome_img.setIcon(new ImageIcon("G:\\\u4E07\u5BA2\u6765\u70B9\u9910\\\u9875\u9762 \u56FE\\\u9875\u9762\u56FE\u6F58\\\u5BFC\u822Alogo.png"));
           body_home_dome_img.setBounds(59, 10, 52, 50);
           body_home_dome.add(body_home_dome_img);
           //�̼ҷ���
           JLabel classify = new JLabel("\u5546\u5BB6\u5206\u7C7B");
           classify.setFont(new Font("΢���ź�", Font.BOLD, 22));
           classify.setBounds(110, 17, 90, 40);
           body_home_dome.add(classify);
           
           
           
           //ɸѡ�İ�ť
           JButton whole = new JButton("\u5168\u90E8");
           whole.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		

           	}});
           whole.setFont(new Font("΢���ź�", Font.PLAIN, 17));
           whole.setBounds(237, 22, 74, 29);
           body_home_dome.add(whole);
           //whole.
           whole.setContentAreaFilled(false);		//����ť��Ϊ͸��
		   whole.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           whole.setContentAreaFilled(false);
           whole.setBorderPainted(false);//�رհ�ť�ı߿�
           //whole.setBorder(BorderFactory.createRaisedBevelBorder());
           //whole.setFont(new  java.awt.Font("�����п�",  1,  15));
           //whole.setBackground(Color.red);
           //whole.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           
           
//           whole.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mousePressed(MouseEvent e) {
//					//�����ʱ��ȥ����� mouseMoved �¼� ��ӵı���ɫ
//					JToggleButton btn = (JToggleButton)e.getSource();
//					btn.setBackground(null);
//				}
//				@Override
//				public void mouseExited(MouseEvent e){
//					//�������û�д���ѡ��״̬ʱ���Ž���ť����Ϊ͸��
//					JToggleButton btn = (JToggleButton)e.getSource();
//					if(!btn.isSelected()) {
//						btn.setContentAreaFilled(false);
//					}
//				}
//			});
  
           
           
           
           //ȫ��ɸѡ��ť
           JButton wholee = new JButton("\u5C0F\u5403");
           wholee.setFont(new Font("΢���ź�", Font.PLAIN, 17));
           wholee.setBounds(381, 22, 74, 29);
           body_home_dome.add(wholee);
           wholee.setContentAreaFilled(false);		//����ť��Ϊ͸��
		   wholee.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           wholee.setContentAreaFilled(false);
           wholee.setBorderPainted(false);//�رհ�ť�ı߿�
           wholee.addMouseListener((MouseListener) new MouseListener(){
    			
        	   public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��
      				wholee.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				wholee.setForeground(Color.black);
      			}
      			
      		});
           
           //С��ɸѡ��ť
           JButton afternoon = new JButton("\u4E0B\u5348\u8336");
           afternoon.setFont(new Font("΢���ź�", Font.PLAIN, 17));
           afternoon.setBounds(522, 22, 90, 29);
           body_home_dome.add(afternoon);
           afternoon.setContentAreaFilled(false);		//����ť��Ϊ͸��
           afternoon.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           afternoon.setContentAreaFilled(false);
           afternoon.setBorderPainted(false);//�رհ�ť�ı߿�
           afternoon.addMouseListener((MouseListener) new MouseListener(){
   			
        	   public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��
      				afternoon.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				afternoon.setForeground(Color.black);
      			}
      			
      		});
           
           //�����
           JButton Western = new JButton("\u897F\u9910");
           Western.setFont(new Font("΢���ź�", Font.PLAIN, 17));
           Western.setBounds(680, 22, 74, 29);
           body_home_dome.add(Western);
           Western.setContentAreaFilled(false);		//����ť��Ϊ͸��
           Western.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           Western.setContentAreaFilled(false);
           Western.setBorderPainted(false);//�رհ�ť�ı߿�
           Western.addMouseListener((MouseListener) new MouseListener(){
      			
        	   public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��
      				Western.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				Western.setForeground(Color.black);
      			}
      			
      		});
           
           //����
           JButton snack = new JButton("\u5FEB\u9910");
           snack.setFont(new Font("΢���ź�", Font.PLAIN, 17));
           snack.setBounds(827, 22, 74, 29);
           body_home_dome.add(snack);
           snack.setContentAreaFilled(false);		//����ť��Ϊ͸��
           snack.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           snack.setContentAreaFilled(false);
           snack.setBorderPainted(false);//�رհ�ť�ı߿�
           snack.addMouseListener((MouseListener) new MouseListener(){
      			
        	   public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��
      				snack.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				snack.setForeground(Color.black);
      			}
      			
      		});
           
           //���
           JButton barbecue = new JButton("\u70E7\u70E4");
           barbecue.setFont(new Font("΢���ź�", Font.PLAIN, 17));
           barbecue.setBounds(965, 22, 74, 29);
           body_home_dome.add(barbecue);
           barbecue.setContentAreaFilled(false);		//����ť��Ϊ͸��
           barbecue.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           barbecue.setContentAreaFilled(false);
           barbecue.setBorderPainted(false);//�رհ�ť�ı߿�
           barbecue.addMouseListener((MouseListener) new MouseListener(){
      			
        	   public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��
      				barbecue.setForeground(Color.red);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				barbecue.setForeground(Color.black);
      			}
      			
      		});
           
           //��ȡֵ���ı���
           
           JTextField searchbox = new JTextField();
           searchbox.setBounds(1150, 17, 195, 38);
           body_home_dome.add(searchbox);
           searchbox.setColumns(10);
           //����ͼ�갴ť
           JButton search_push = new JButton("\u641C\u7D22");
           search_push.setFont(new Font("΢���ź�", Font.PLAIN, 18));
           search_push.setBackground(new Color(0, 0, 0));
           search_push.setBounds(1340, 17, 81, 38);
//           search_push.setContentAreaFilled(false);
//           search_push.setBorderPainted(false);
           search_push.setContentAreaFilled(false);		//����ť��Ϊ͸��
           search_push.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           search_push.setContentAreaFilled(false);
           search_push.setBorderPainted(false);//�رհ�ť�ı߿�
           body_home_dome.add(search_push);
           search_push.addMouseListener((MouseListener) new MouseListener(){
     			public void mouseClicked(MouseEvent e) {
     				// ���������
     			}
     			public void mouseEntered(MouseEvent e) {
     				// �����������
     			}
     			public void mouseExited(MouseEvent e) {
     				// ��������뿪
     			}
     			public void mousePressed(MouseEvent e) {
     				// ������갴��\
     				search_push.setForeground(Color.red);
     				
     				

     			}
     			public void mouseReleased(MouseEvent e) {
     				// ��������ͷ�
     				search_push.setForeground(Color.black);

     			}
     		});
           
           //��ҳ�Ĳ�Ʒչʾ���Ĵ���
           JPanel conut_panel = new JPanel();
           conut_panel.setBounds(0, 76, 1500, 675);
           body_home.add(conut_panel);
           conut_panel.setLayout(new GridLayout(0,4,10,10));
           
           
           
           //��Ʒչʾ�����ݰ�ť���Ч��
           JButton btnNewButton = new JButton("��Ʒ��Ϣһ");
           conut_panel.add(btnNewButton);
           
           JButton btnNewButton_1 = new JButton("��Ʒ��Ϣ��");
           conut_panel.add(btnNewButton_1);
           
           JButton btnNewButton_4 = new JButton("��Ʒ��Ϣ��");
           conut_panel.add(btnNewButton_4);
           
           JButton btnNewButton_2 = new JButton("��Ʒ��Ϣ��");
           conut_panel.add(btnNewButton_2);
           
           JButton btnNewButton_3 = new JButton("��Ʒ��Ϣ��");
           conut_panel.add(btnNewButton_3);
           
           JButton btnNewButton_5 = new JButton("��Ʒ��Ϣ��");
           conut_panel.add(btnNewButton_5);
           
           JButton btnNewButton_6 = new JButton("��Ʒ��Ϣ��");
           conut_panel.add(btnNewButton_6);
           
           JButton btnNewButton_7 = new JButton("��Ʒ��Ϣ��");
           conut_panel.add(btnNewButton_7);
           JButton j=new JButton("��Ʒ��Ϣ��");
           j.setBounds(0,0,10,10);
           JButton j1=new JButton("��Ʒ��Ϣʮ");
           j1.setBounds(0,0,10,10);
           JButton j2=new JButton("��Ʒ��Ϣʮһ");
           JButton j3=new JButton("��Ʒ��Ϣʮ��");
           conut_panel.add(j3);
           conut_panel.add(j1);
           conut_panel.add(j2);
           conut_panel.add(j);
           
           
           
           
           
           
           
           
           //�˵��������
           JPanel Content_panel = new JPanel();
           Content_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
           Content_panel.setBackground(new Color(255, 235, 205));
           Content_panel.setBounds(0, 70, 1500, 681);

           body_home.setVisible(true);
           
           
           //������ת���--�ҵĶ���
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
           lblNewLabel_3.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_3.setBounds(60, 20, 130, 41);
           dingdan.add(lblNewLabel_3);
           
           JLabel lblNewLabel_3_1 = new JLabel("\u5546\u5BB6\u7535\u8BDD\uFF1A");
           lblNewLabel_3_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_3_1.setBounds(726, 20, 130, 41);
           dingdan.add(lblNewLabel_3_1);
           
           JLabel lblNewLabel_3_1_1 = new JLabel("\u8BA2\u5355\u91D1\u989D\uFF1A");
           lblNewLabel_3_1_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_3_1_1.setBounds(1030, 20, 130, 41);
           dingdan.add(lblNewLabel_3_1_1);
           
           JLabel lblNewLabel_3_1_2 = new JLabel("\u8BA2\u5355\u72B6\u6001\uFF1A");
           lblNewLabel_3_1_2.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_3_1_2.setBounds(1353, 20, 137, 41);
           dingdan.add(lblNewLabel_3_1_2);
           
           JPanel dingdan_body = new JPanel();
           dingdan_body.setBackground(Color.WHITE);
           dingdan_body.setBounds(0, 78, 1500, 673);
           body_home2.add(dingdan_body);
           dingdan_body.setLayout(new GridLayout(4, 3, 0, 5));
          

           
           JButton btnNewButton_13 = new JButton("����һ");
           dingdan_body.add(btnNewButton_13);
           
           JButton btnNewButton_14 = new JButton("������");
           dingdan_body.add(btnNewButton_14);
           
           JButton btnNewButton_12 = new JButton("������");
           dingdan_body.add(btnNewButton_12);
           body_home2.setVisible(false);
           
           //�ҵ��������޸�����ĸ��ര��
           JPanel body_home3 = new JPanel();
           body_home3.setBackground(Color.BLUE);
           body_home3.setBounds(0, 49, 1500, 751);
           contentPane.add(body_home3);
           body_home3.setLayout(null);
           //�޸��������������ʵ�ִ���
           JPanel datum = new JPanel();
           datum.setBackground(new Color(255, 140, 0));
           datum.setBounds(0, 0, 1500, 751);
           body_home3.add(datum);
           datum.setLayout(null);
           //�޸�����ҳ��
           JPanel change_information = new JPanel();
           change_information.setBounds(294, 0, 1204, 751);
           datum.add(change_information);
           change_information.setLayout(null);
           change_information.setVisible(true);
           //�޸����ϵ����
           JLabel lblNewLabel_1 = new JLabel("\u539F\u4FE1\u606F\uFF1A");
           lblNewLabel_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_1.setBounds(185, 176, 99, 48);
           change_information.add(lblNewLabel_1);
           
           JLabel lblNewLabel_1_1 = new JLabel("\u59D3\u540D\uFF1A");
           lblNewLabel_1_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_1_1.setBounds(185, 250, 90, 48);
           change_information.add(lblNewLabel_1_1);
           
           JLabel lblNewLabel_1_1_1 = new JLabel("\u5730\u5740\uFF1A");
           lblNewLabel_1_1_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_1_1_1.setBounds(185, 396, 99, 48);
           change_information.add(lblNewLabel_1_1_1);
           
           JLabel lblNewLabel_1_1_1_1 = new JLabel("\u624B\u673A\u53F7\u7801\uFF1A");
           lblNewLabel_1_1_1_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
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
           //�޸�����ҳ���ȷ����ť
           JButton btnNewButton_9 = new JButton("\u786E\u5B9A");
           btnNewButton_9.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           	}
           });
           btnNewButton_9.setFont(new Font("΢���ź�", Font.PLAIN, 30));
           btnNewButton_9.setBounds(185, 623, 188, 75);
           change_information.add(btnNewButton_9);
           btnNewButton_9.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_9.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_9.setContentAreaFilled(false);
           btnNewButton_9.setBorderPainted(false);//�رհ�ť�ı߿�
           
           
           //�޸����ϵ����ð�ť
           JButton btnNewButton_9_1 = new JButton("\u91CD\u7F6E");
           btnNewButton_9_1.setFont(new Font("΢���ź�", Font.PLAIN, 30));
           btnNewButton_9_1.setBounds(537, 623, 188, 75);
           change_information.add(btnNewButton_9_1);
           btnNewButton_9_1.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_9_1.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_9_1.setContentAreaFilled(false);
           btnNewButton_9_1.setBorderPainted(false);//�رհ�ť�ı߿�
           
           //�޸����ϵ�ע���˺ŵİ�ť
           JButton btnNewButton_9_2 = new JButton("\u6CE8\u9500\u8D26\u53F7");
           btnNewButton_9_2.setFont(new Font("΢���ź�", Font.PLAIN, 30));
           btnNewButton_9_2.setBounds(917, 623, 188, 75);
           change_information.add(btnNewButton_9_2);
           btnNewButton_9_2.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_9_2.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_9_2.setContentAreaFilled(false);
           btnNewButton_9_2.setBorderPainted(false);//�رհ�ť�ı߿�
           
           //�޸�����ҳ��
           JPanel change_password = new JPanel();
           change_password.setBackground(new Color(255, 255, 255));
           change_password.setBounds(296, 0, 1202, 751);
           datum.add(change_password);
           change_password.setLayout(null);
           change_password.setVisible(false);
           //�޸����밴ť
           JButton btnNewButton_8_1 = new JButton("\u4FEE\u6539\u5BC6\u7801");
           //��ť�ĳ�ʼ����ɫ
           btnNewButton_8_1.setForeground(Color.WHITE);
           btnNewButton_8_1.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		change_information.setVisible(false);
           		change_password.setVisible(true);
           	}
           });
           //���ð�ť����Ӧʱ������̬Ч��
           btnNewButton_8_1.addMouseListener((MouseListener) new MouseListener(){
     			
        	   public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��
      				btnNewButton_8_1.setForeground(Color.CYAN);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				btnNewButton_8_1.setForeground(Color.WHITE);
      			}
      			
      		});
           
           
           btnNewButton_8_1.setFont(new Font("΢���ź�", Font.PLAIN, 30));
           btnNewButton_8_1.setBounds(44, 509, 224, 71);
           datum.add(btnNewButton_8_1);
           btnNewButton_8_1.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_8_1.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_8_1.setContentAreaFilled(false);
           btnNewButton_8_1.setBorderPainted(false);//�رհ�ť�ı߿�
           
           
           
           
           //�޸����ϰ�ť
           JButton btnNewButton_8 = new JButton("\u4FEE\u6539\u8D44\u6599");
           btnNewButton_8.setForeground(Color.WHITE);
           btnNewButton_8.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		
           		change_password.setVisible(false);
           		change_information.setVisible(true);
           		
           	}
           });
           btnNewButton_8.setFont(new Font("΢���ź�", Font.PLAIN, 30));
           btnNewButton_8.setBounds(44, 263, 224, 71);
           datum.add(btnNewButton_8);
           btnNewButton_8.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_8.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_8.setContentAreaFilled(false);
           btnNewButton_8.setBorderPainted(false);//�رհ�ť�ı߿�
           
           
           
           
           JLabel lblNewLabel_2 = new JLabel("\u539F\u4FE1\u606F:");
           lblNewLabel_2.setFont(new Font("΢���ź�", Font.PLAIN, 30));
           lblNewLabel_2.setBounds(181, 86, 108, 55);
           change_password.add(lblNewLabel_2);
     
           
     
           JLabel lblNewLabel_2_1 = new JLabel("\u8D26\u53F7\uFF1A");
           lblNewLabel_2_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_2_1.setBounds(181, 185, 108, 55);
           change_password.add(lblNewLabel_2_1);
         
           JLabel lblNewLabel_2_2 = new JLabel("\u5BC6\u7801:");
           lblNewLabel_2_2.setFont(new Font("΢���ź�", Font.PLAIN, 25));
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
           lblNewLabel_2_2_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           lblNewLabel_2_2_1.setBounds(181, 385, 108, 55);
           change_password.add(lblNewLabel_2_2_1);
           
           textField_4 = new JTextField();
           textField_4.setColumns(10);
           textField_4.setBounds(299, 395, 302, 42);
           change_password.add(textField_4);
           //�޸������ˢ�°�ť
           JButton btnNewButton_10 = new JButton("\u5237\u65B0");
           btnNewButton_10.setFont(new Font("΢���ź�", Font.PLAIN, 20));
           btnNewButton_10.setBounds(699, 385, 108, 55);
           change_password.add(btnNewButton_10);
           btnNewButton_10.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_10.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_10.setContentAreaFilled(false);
           btnNewButton_10.setBorderPainted(false);//�رհ�ť�ı߿�
           
           //�޸������ȷ����ť
           JButton btnNewButton_11 = new JButton("\u786E\u5B9A");
           btnNewButton_11.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           btnNewButton_11.setBounds(181, 562, 209, 65);
           change_password.add(btnNewButton_11);
           btnNewButton_11.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_11.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_11.setContentAreaFilled(false);
           btnNewButton_11.setBorderPainted(false);//�رհ�ť�ı߿�
           
           //�޸���������ð�ť
           JButton btnNewButton_11_1 = new JButton("\u91CD\u7F6E");
           btnNewButton_11_1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           btnNewButton_11_1.setBounds(560, 562, 209, 65);
           change_password.add(btnNewButton_11_1);
           btnNewButton_11_1.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_11_1.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_11_1.setContentAreaFilled(false);
           btnNewButton_11_1.setBorderPainted(false);//�رհ�ť�ı߿�
           
           //�޸������ע����ť
           JButton btnNewButton_11_2 = new JButton("\u6CE8\u9500\u8D26\u53F7");
           btnNewButton_11_2.setFont(new Font("΢���ź�", Font.PLAIN, 25));
           btnNewButton_11_2.setBounds(973, 562, 209, 65);
           change_password.add(btnNewButton_11_2);
           btnNewButton_11_2.setContentAreaFilled(false);		//����ť��Ϊ͸��
           btnNewButton_11_2.setFocusable(false);//���õ��ʱ�����Աߵı߿�
           btnNewButton_11_2.setContentAreaFilled(false);
           btnNewButton_11_2.setBorderPainted(false);//�رհ�ť�ı߿�
           
           body_home3.setVisible(false);
          
           
           JLabel logo = new JLabel("");
           logo.setIcon(new ImageIcon("G:\\\u4E07\u5BA2\u6765\u70B9\u9910\\\u9875\u9762 \u56FE\\\u9875\u9762\u56FE\u6F58\\\u5BFC\u822Alogo.png"));
           logo.setBounds(0, 0, 57, 49);
           contentPane.add(logo);
           
           
           
           //�������ְ�ť�ļ����¼������ִﵽ��ť��Ч��
           //��ҳ��ť
           JLabel button_1 = new JLabel("\u9996\u9875");
           button_1.setForeground(Color.WHITE);
           button_1.setFont(new Font("΢���ź�", Font.PLAIN, 22));
           button_1.setBackground(Color.WHITE);
           button_1.setBounds(294, 10, 50, 31);
           contentPane.add(button_1);
           button_1.addMouseListener((MouseListener) new MouseListener(){
     			
        	   public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��
      	           button_1.setForeground(Color.red);
      	         body_home.setVisible(true);
   				body_home2.setVisible(false);
   				body_home3.setVisible(false);
      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				button_1.setForeground(Color.WHITE);      			}
      			
      		});
           
           //�л��˺�
           JLabel button_2 = new JLabel("\u5207\u6362\u8D26\u53F7");
           button_2.setForeground(new Color(255, 255, 255));
           button_2.setFont(new Font("΢���ź�", Font.PLAIN, 22));
           button_2.setBackground(Color.RED);
           button_2.setBounds(1000, 10, 115, 31);
           contentPane.add(button_2);
           button_2.addMouseListener((MouseListener) new MouseListener(){
    			
        	   public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��
      				button_2.setForeground(Color.red);

      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				button_2.setForeground(Color.WHITE);      			}
      			
      		});
           
           
           //��С�����ְ�ť
           JLabel button_reduce = new JLabel("\u2014\u2014");
           button_reduce.setForeground(new Color(255, 255, 255));
           button_reduce.setFont(new Font("΢���ź�", Font.PLAIN, 20));
           button_reduce.setBackground(Color.RED);
           button_reduce.setBounds(1389, 10, 46, 31);
           contentPane.add(button_reduce);
           //��С�����ְ�ť�ļ����¼�����ʵ�ְ�ť��ͬ����
           button_reduce.addMouseListener((MouseListener) new MouseListener(){
   			public void mouseClicked(MouseEvent e) {
   				// ���������
   			}
   			public void mouseEntered(MouseEvent e) {
   				// �����������
   			}
   			public void mouseExited(MouseEvent e) {
   				// ��������뿪
   			}
   			public void mousePressed(MouseEvent e) {
   				// ������갴��
  				button_reduce.setForeground(Color.red);
   				setExtendedState(JFrame.ICONIFIED);

   			}
   			public void mouseReleased(MouseEvent e) {
   				// ��������ͷ�
  				button_reduce.setForeground(Color.WHITE);

   			}
   		});
           //�ر����ְ�ť
           JLabel button_close = new JLabel("X");
           button_close.setForeground(new Color(255, 255, 255));
           button_close.setFont(new Font("΢���ź�", Font.PLAIN, 20));
           button_close.setBackground(Color.RED);
           button_close.setBounds(1445, 10, 46, 31);
           contentPane.add(button_close);
         //�رհ�ť
           button_close.addMouseListener((MouseListener) new MouseListener(){
      			public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				// ������갴��\
      				button_close.setForeground(Color.red);
      				dispose();
      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				button_close.setForeground(Color.WHITE);

      			}
      		});
           //�ҵĶ���
           JLabel button_3 = new JLabel("\u6211\u7684\u8BA2\u5355");
           button_3.setForeground(new Color(255, 255, 255));
           button_3.setFont(new Font("΢���ź�", Font.PLAIN, 22));
           button_3.setBackground(Color.RED);
           button_3.setBounds(500, 10, 102, 31);
           contentPane.add(button_3);
           button_3.addMouseListener((MouseListener) new MouseListener(){
     			public void mouseClicked(MouseEvent e) {
     				// ���������
     			}
     			public void mouseEntered(MouseEvent e) {
     				// �����������
     			}
     			public void mouseExited(MouseEvent e) {
     				// ��������뿪
     			}
     			public void mousePressed(MouseEvent e) {
     				body_home.setVisible(false);
     				body_home2.setVisible(true);
     				body_home3.setVisible(false);
      				button_3.setForeground(Color.red);

     			}
     			public void mouseReleased(MouseEvent e) {
     				// ��������ͷ�
      				button_3.setForeground(Color.WHITE);

     			}
     		});
           
           //�ҵ�����
           JLabel button_4 = new JLabel("\u6211\u7684\u8D44\u6599");
           button_4.setForeground(new Color(255, 255, 255));
           button_4.setFont(new Font("΢���ź�", Font.PLAIN, 22));
           button_4.setBackground(Color.RED);
           button_4.setBounds(750, 10, 102, 31);
           contentPane.add(button_4);
         //�����ҵ��������ְ�ť�ĵ����¼�
           button_4.addMouseListener((MouseListener) new MouseListener(){
      			public void mouseClicked(MouseEvent e) {
      				// ���������
      			}
      			public void mouseEntered(MouseEvent e) {
      				// �����������
      			}
      			public void mouseExited(MouseEvent e) {
      				// ��������뿪
      			}
      			public void mousePressed(MouseEvent e) {
      				body_home.setVisible(false);
      				body_home2.setVisible(false);
      				body_home3.setVisible(true);
      				button_4.setForeground(Color.red);

      			}
      			public void mouseReleased(MouseEvent e) {
      				// ��������ͷ�
      				button_4.setForeground(Color.WHITE);

      			}
      		});
          
          
           



           
           //��ȡ����ʵʱλ��
           
        // �ƶ���ǰ����
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					p = e.getPoint();
				}

				public void mouseReleased(MouseEvent e) {
					
					
					
				}
			});
			//���Ľ����������ȥ�����϶�����
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
