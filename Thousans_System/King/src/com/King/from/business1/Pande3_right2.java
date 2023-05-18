package com.King.from.business1;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import com.King.serives.UserServices;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
/**
 * （个人信息模块）修改密码
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande3_right2 extends JPanel{
	public Pande3_right2() {
		this.setBounds(0, 0, 1106, 758);
		this.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u539F\u5BC6\u7801:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel.setBounds(338, 232, 165, 30);
		this.add(lblNewLabel);
		
		JTextField pass = new JTextField();
		pass.setBounds(560, 229, 317, 30);
		this.add(pass);
		pass.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u65B0\u5BC6\u7801:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(338, 290, 165, 30);
		this.add(lblNewLabel_1);
		
		JTextField password = new JTextField();
		password.setColumns(10);
		password.setBounds(560, 290, 317, 30);
		this.add(password);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u786E\u8BA4\u65B0\u5BC6\u7801:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(338, 348, 198, 30);
		this.add(lblNewLabel_1_1);
		
		JTextField newpassword= new JTextField();
		newpassword.setColumns(10);
		newpassword.setBounds(560, 348, 317, 30);
		this.add(newpassword);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ypass=pass.getText();
				String password=pass.getText();
				String nwepass=newpassword.getText();
				if(password.equals(nwepass)) {
					JOptionPane.showMessageDialog(null, "两次密码不一样");
				}else {
					if(new UserServices().mimaUser(ypass, nwepass, user.getId())) {
						JOptionPane.showMessageDialog(null, "密码修改成功");
					}else {
						JOptionPane.showMessageDialog(null, "密码修改失败");
					}
				}
			}
		});
		btnNewButton.setBounds(398, 430, 154, 40);
		this.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
		btnNewButton_1.setBounds(717, 430, 154, 40);
		this.add(btnNewButton_1);
		
		JLabel img = new JLabel("");
		img.setBounds(0, 0, 1400, 850);
		img.setIcon(new ImageIcon("src\\img\\美食图片7.png"));
		add(img);
	}
}
