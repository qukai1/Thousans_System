package com.King.from.business;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import com.King.serives.UserServices;
import com.King.util.RoundPanel;
import com.King.util.ShanggchuangFrm;

/**
 * £¨¸öÈËÐÅÏ¢Ä£¿é£©ÐÞ¸ÄÐÅÏ¢
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande3_right1 extends JPanel {
	public Pande3_right1() {
		setLayout(null);
		this.setBackground(new Color(255, 255, 255));
		this.setBorder(new EmptyBorder(3, 4, 3, 1));
		this.setBounds(0,0,1396,970);
		this.setLayout(null);

		RoundPanel panel = new RoundPanel();
		panel.setBackground(new Color(30, 144, 255,80));
		panel.setBounds(100,20, 1205, 379);
		this.add(panel);
		panel.setLayout(null);
		
		JTextField name = new JTextField();
		
		
		JLabel lblNewLabel = new JLabel("\u5E97\u94FA\u540D\u79F0:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel.setBounds(86, 52, 72, 29);
		panel.add(lblNewLabel);

		JLabel merchantsName = new JLabel("\u672A\u586B");
		merchantsName.setForeground(new Color(255, 255, 255));
		merchantsName.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		merchantsName.setBounds(180, 52, 363, 29);
		panel.add(merchantsName);

		JLabel lblNewLabel_2 = new JLabel("\u5E97\u94FA\u5730\u5740:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(86, 133, 72, 29);
		panel.add(lblNewLabel_2);

		JLabel merchantsAddress = new JLabel("\u672A\u586B");
		merchantsAddress.setForeground(new Color(255, 255, 255));
		merchantsAddress.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		merchantsAddress.setBounds(180, 133, 363, 29);
		panel.add(merchantsAddress);

		JLabel lblNewLabel_2_1 = new JLabel("\u5E97\u94FA\u7C7B\u578B:");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(86, 214, 72, 29);
		panel.add(lblNewLabel_2_1);

		JLabel merchantsType = new JLabel("\u672A\u586B");
		merchantsType.setForeground(new Color(255, 255, 255));
		merchantsType.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		merchantsType.setBounds(180, 214, 363, 29);
		merchantsType.setText("Î´Ìî");
		panel.add(merchantsType);

		JLabel lblNewLabel_2_1_1 = new JLabel("\u5546\u5BB6\u7535\u8BDD:");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));

		lblNewLabel_2_1_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(86, 295, 72, 29);
		panel.add(lblNewLabel_2_1_1);

		JLabel merchantsPhone = new JLabel("\u672A\u586B");
		merchantsPhone.setForeground(new Color(255, 255, 255));
		merchantsPhone.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		merchantsPhone.setBounds(180, 295, 363, 29);
		panel.add(merchantsPhone);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("\u5546\u5BB6logo:");
		lblNewLabel_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(566, 52, 72, 29);
		panel.add(lblNewLabel_2_1_1_1);

		JLabel merchantsSculpture = new JLabel();
		merchantsSculpture.setForeground(new Color(255, 255, 255));
		merchantsSculpture.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		merchantsSculpture.setBounds(659, 52, 497, 272);
		panel.add(merchantsSculpture);

		RoundPanel panel_1 = new RoundPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(248, 248, 255,70));
		panel_1.setBounds(100, 420, 1205, 418);
		this.add(panel_1);
		

		JLabel logo = new JLabel("\u4E0A\u4F20\u56FE\u7247");
		logo.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		logo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		logo.setBounds(554, 52, 497, 272);
		panel_1.add(logo);
		
		JButton btnImage = new JButton("ÉÏ´«Í¼Æ¬");
		btnImage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String src = ShanggchuangFrm.addPicture(btnImage);
				if (src != null) {
					BufferedImage bufferedImage = null;
					try {
						bufferedImage = ImageIO.read(new File("src/img/"+src));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				     ImageIcon imageIcon = new ImageIcon(bufferedImage);
				     logo.setIcon(imageIcon);
				     logo.setToolTipText(src);
					logo.setText(src);
				}
			}
		});
		
		btnImage.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		btnImage.setForeground(Color.WHITE);
		btnImage.setBorder(null);
		btnImage.setBounds(1061, 281, 125, 43);
		panel_1.add(btnImage);

		name.setBounds(168, 54, 315, 25);
		panel_1.add(name);
		name.setColumns(10);

		JTextField addrs = new JTextField();
		addrs.setColumns(10);
		addrs.setBounds(168, 133, 315, 25);
		panel_1.add(addrs);

		JTextField type = new JTextField();
		type.setColumns(10);
		type.setBounds(168, 214, 315, 25);
		panel_1.add(type);

		JTextField phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(168, 295, 315, 25);
		panel_1.add(phone);
		
		JLabel lblNewLabel_1 = new JLabel("\u5E97\u94FA\u540D\u79F0:");
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(86, 52, 72, 29);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2_2 = new JLabel("\u5E97\u94FA\u5730\u5740:");
		lblNewLabel_2_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(86, 133, 72, 29);
		panel_1.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_1_2 = new JLabel("\u5E97\u94FA\u7C7B\u578B:");
		lblNewLabel_2_1_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_1_2.setBounds(86, 214, 72, 29);
		panel_1.add(lblNewLabel_2_1_2);

		JLabel lblNewLabel_2_1_1_2 = new JLabel("\u5546\u5BB6\u7535\u8BDD:");
		lblNewLabel_2_1_1_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_1_1_2.setBounds(86, 295, 72, 29);
		panel_1.add(lblNewLabel_2_1_1_2);

		JButton BtnConver = new JButton("ÖØÖÃ");
		BtnConver.setForeground(new Color(255, 255, 255));
		BtnConver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText(null);
				addrs.setText(null);
				phone.setText(null);
				type.setText(null);
				logo.setText(null);
				logo.setIcon(null);
				JOptionPane.showMessageDialog(null, "ÖØÖÃ³É¹¦");
			}
		});
		BtnConver.setBounds(761, 349, 125, 43);
		BtnConver.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
		BtnConver.setBorder(null);
		panel_1.add(BtnConver);

		JButton btnResetting = new JButton("±£´æ");
		btnResetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setUserName(name.getText());
				user.setAddres(addrs.getText());
				user.setUserPhone(phone.getText());
				user.setMerchantsType(type.getText());
				user.setSculpture(logo.getText());
				//¸üÐÂ½á¹û
				System.out.println(user.toString());
				new UserServices().updUser(user);
				try {
					selUserID(merchantsName, merchantsAddress, merchantsType, merchantsPhone, merchantsSculpture);
				} catch (SQLException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "±£´æ³É¹¦");
			}
		});
		btnResetting.setBounds(318, 349, 125, 43);
		btnResetting.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		panel_1.add(btnResetting); 
		// ²éÑ¯µêÆÌÐÅÏ¢
		try {
			selUserID(merchantsName, merchantsAddress, merchantsType, merchantsPhone, merchantsSculpture);
		} catch (SQLException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JLabel aaa = new JLabel(new ImageIcon(Pande1_right1.class.getResource("/img/image.gif")));
		aaa.setBounds(0, -34, 1396, 1004);
		add(aaa);

	}
	private void selUserID(JLabel merchantsName, JLabel merchantsAddress, JLabel merchantsType,
			JLabel merchantsPhone, JLabel merchantsSculpture) throws SQLException, IOException {
		int id=user.getId();
	  user=new UserServices().idUser(id);
		if (user.getUserName() != null)
			merchantsName.setText(user.getUserName());
		if (user.getAddres() != null)
			merchantsAddress.setText(user.getAddres() );
		if (user.getUserPhone()!= null)
			merchantsPhone.setText(user.getUserPhone());
		if (user.getSculpture()!=null&&user.getSculpture().length()>5) {
			BufferedImage bufferedImage =ImageIO.read(new File("src/img/"+user.getSculpture()));
		     ImageIcon imageIcon = new ImageIcon(bufferedImage);
		     merchantsSculpture.setIcon(imageIcon);
		     merchantsSculpture.setToolTipText(user.getSculpture());
			 merchantsSculpture.setText(user.getSculpture());
		}
		if(user.getMerchantsType()!=null) {
			 merchantsType.setText(user.getMerchantsType());
		}
	}
}
