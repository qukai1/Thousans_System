package com.King.from.business;
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
/**
 * ��������Ϣģ�飩�޸�����
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Pande3_right2 extends JPanel{
	public Pande3_right2() {
		this.setBounds(0, 0, 1106, 758);
		this.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u539F\u5BC6\u7801:");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel.setBounds(398, 232, 105, 30);
		this.add(lblNewLabel);
		
		JTextField pass = new JTextField();
		pass.setBounds(560, 229, 317, 30);
		this.add(pass);
		pass.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u65B0\u5BC6\u7801:");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(398, 290, 105, 30);
		this.add(lblNewLabel_1);
		
		JTextField password = new JTextField();
		password.setColumns(10);
		password.setBounds(560, 290, 317, 30);
		this.add(password);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u786E\u8BA4\u65B0\u5BC6\u7801:");
		lblNewLabel_1_1.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(338, 348, 165, 30);
		this.add(lblNewLabel_1_1);
		
		JTextField newpassword= new JTextField();
		newpassword.setColumns(10);
		newpassword.setBounds(560, 348, 317, 30);
		this.add(newpassword);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ypass=pass.getText();
				String password=pass.getText();
				String nwepass=newpassword.getText();
				if(password.equals(nwepass)) {
					JOptionPane.showMessageDialog(null, "�������벻һ��");
				}else {
					if(new UserServices().mimaUser(ypass, nwepass, user.getId())) {
						JOptionPane.showMessageDialog(null, "�����޸ĳɹ�");
					}else {
						JOptionPane.showMessageDialog(null, "�����޸�ʧ��");
					}
				}
			}
		});
		btnNewButton.setBounds(398, 430, 154, 40);
		this.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
		btnNewButton_1.setBounds(717, 430, 154, 40);
		this.add(btnNewButton_1);
		JLabel aaa = new JLabel(new ImageIcon(Pande1_right1.class.getResource("/img/image.gif")));
		aaa.setBounds(0, -34, 1396, 1004);
		add(aaa);
	}
}
