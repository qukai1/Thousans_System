package com.King.from.user;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
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
 * �̼�ҳ�����
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class UserHome extends JFrame {
	// �²�
	UserJPanel jPanel = new UserPande1();
	//����ͷ
	Panel topPanel = new Panel();
	public UserHome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserHome.class.getResource("/img/logo.png")));
		//��ֵ����JPanel����
		getContentPane().setEnabled(false);
		this.setUndecorated(true);
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screensize.getWidth();// �õ���
		int height = (int) screensize.getHeight();// �õ���
		setBounds(width / 2 - 1593 / 2, height / 2 - 996 / 2, 1593, 997);
		//Բ��
		//AWTUtilities.setWindowShape(this,new RoundRectangle2D.Double(0.0D, 0.0D, this.getWidth(), this.getHeight(), 30.0D,30.0D));
		getContentPane().setLayout(null);
		// ͷ��
		topPanel.setBackground(new Color(255,140,0));
		topPanel.setBounds(0, 0, 1592,100);
		getContentPane().add(topPanel);
		topPanel.setLayout(null);
		//Ĭ���±�
		jPanel.setBounds(0,100, 1592, 925);
		getContentPane().add(jPanel);
		// �˵�ģ��
		JLabel name1 = new JLabel("��ҳ");
		name1.setBounds(414, 25, 140, 40);
		// ����ģ��
		JLabel name2 = new JLabel("�ҵĶ���");
		name2.setBounds(566, 25, 140, 40);
		// ������Ϣ
		JLabel name3 = new JLabel("������Ϣ");
		name3.setBounds(750, 25, 140, 40);
		// �˳�ģ��
		JLabel name4 = new JLabel("�л��˺�");
		name4.setBounds(945, 25, 140, 40);
		name4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);// ����������
				new LoginUser().setVisible(true);// �´�����ʾ
				dispose();// ����������,�ͷ��ڴ���Դ
			}
		});
		//�ı���ť��ͬ��ʽ
		buttonnStyle(name1,name2,name3,name4);
		name1.setForeground(Color.black);
		//Ĭ��nameΪ��ɫ 
		name1.setForeground(Color.black);
		// ����������
		chileBut(name1, name2, name3);
		//logo
		JLabel logo = new JLabel("\u4E07\u5BA2\u6765\u70B9\u9910\u7CFB\u7EDF");
		logo.setForeground(Color.ORANGE);
		logo.setFont(new Font("��Բ", Font.BOLD, 40));
		logo.setBounds(80, 11, 308, 71);
		topPanel.add(logo);
		//�˳�
		JLabel x = new JLabel(new ImageIcon(UserHome.class.getResource("/img/x.png")));
		x.setBounds(1536, 18, 48, 48);
		topPanel.add(x);
		x.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		//��С
		JLabel close = new JLabel(new ImageIcon(UserHome.class.getResource("/img/-.png")));
		close.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		close.setBounds(1485, 18, 48, 48);
		topPanel.add(close);
		
		JLabel image = new JLabel(new ImageIcon(UserHome.class.getResource("/img/logo.png")));
		image.setBackground(new Color(22, 12, 12, 55));
		image.setBounds(10, 11, 71, 70);
		topPanel.add(image);
		//����ƶ�
		new Move(this);
	}
	
	/**
	 * ��ť��ͬ��ʽ
	 */
	public void buttonnStyle(JLabel...j) {
		for (JLabel jLabel : j) {
			jLabel.setForeground(Color.WHITE);
			jLabel.setFont(new Font("��Բ", Font.BOLD, 30));
			topPanel.add(jLabel);
		}
	}
	
	public void chileBut(JLabel...jLabels) {
		for (JLabel jLabel : jLabels) {
			jLabel.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					jLabels[0].setForeground(Color.WHITE);
					jLabels[1].setForeground(Color.WHITE);
					jLabels[2].setForeground(Color.WHITE);
					jLabel.setForeground(Color.black);
					remove(jPanel);
					if(jLabel.getText().equals("��ҳ")) {
						jPanel =new UserPande1();
					}else if(jLabel.getText().equals("�ҵĶ���")) {
						jPanel =new UserPande2();
					}else {
						jPanel =new UserPande3();
					}
					jPanel.setBounds(0, 100,1592, 925);
					getContentPane().add(jPanel);// panel1�����µ����
					revalidate();// ��panel1����е�������²��ֲ�����
					repaint();// ��panel1���������ػ�
				}
			});
		}
	}
	public static void main(String[] args) {
		 try
		    {
		        //���ñ����Խ��ı䴰�ڱ߿���ʽ����
		        BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
		        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		    }
		    catch(Exception e)
		    {
		        //TODO exception
		    }
		new UserHome().setVisible(true);
	}
}