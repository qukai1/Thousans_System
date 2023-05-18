package com.King.Text;
 
import javax.swing.SwingUtilities;
 
import java.awt.BorderLayout;
 
import javax.swing.JPanel;
 
import javax.swing.JFrame;
 
import java.awt.Dimension;
 
import javax.swing.BorderFactory;
 
import java.awt.Color;
 
import javax.swing.JButton;
 
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;
 
import javax.swing.JLabel;
 
import java.awt.Font;
import java.awt.GridLayout;
 
import javax.swing.SwingConstants;
 
public class daa extends JFrame {
 
	private static final long serialVersionUID = 1L;
 
	private JPanel jContentPane = null;
 
	private JPanel jPanel = null;
 
	private JButton jButton = null;
 
	private JLabel jLabel = null;
 
	private Map<Integer, JPanel> panelMap = new HashMap<Integer, JPanel>();
	
	/**
	 * 
	 * This method initializes jPanel
	 * 
	 * 
	 * 
	 * @return javax.swing.JPanel
	 * 
	 */
 
	private JPanel getJPanel(int num) {
 
		if (jPanel == null) {
 
			jPanel = new JPanel();
 
			jPanel.setLayout(new GridLayout(num, 1));
 
			jPanel.setPreferredSize(new Dimension(100, 0));
 
			jPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
 
			for(int i = 0; i < num; i++){
				jPanel.add(getJButton(i), null);
			}
 
		}
 
		return jPanel;
 
	}
 
	/**
	 * 
	 * This method initializes jButton
	 * 
	 * 
	 * 
	 * @return javax.swing.JButton
	 * 
	 */
 
	private JButton getJButton(int i) {
 
			jButton = new JButton();
 
			jButton.setBounds(new Rectangle(5, 11, 83, 27));
			jButton.setPreferredSize(new Dimension(83, 27));
 
			jButton.setForeground(Color.red);
 
			jButton.setText("Panel " + i);
 
			jButton.addActionListener(new java.awt.event.ActionListener() {
 
				public void actionPerformed(java.awt.event.ActionEvent e) {
 
					jContentPane.remove(((BorderLayout) jContentPane.getLayout()).getLayoutComponent(BorderLayout.CENTER));// ɾ����������м�ԭ�����齨
 
					jContentPane.add(getJPanel1(i), BorderLayout.CENTER);// ���Ҫ�л������
 
					jContentPane.validate();// �ع��������
 
					jContentPane.repaint();// �ػ��������
 
					// ��������ȱһ���ɣ�
 
					// û��validate()ɾ�������û��Ч��
 
					// û��repaint()�������ֻ���
 
				}
 
			});
 
		return jButton;
 
	}
 
 
 
	/**
	 * 
	 * This method initializes jPanel1
	 * 
	 * 
	 * 
	 * @return javax.swing.JPanel
	 * 
	 */
 
	private JPanel getJPanel1(int i) {
		JPanel panel = panelMap.get(i);
		if(panel == null){
 
			jLabel = new JLabel();
 
			jLabel.setBounds(new Rectangle(151, 99, 163, 113));
 
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
 
			jLabel.setHorizontalAlignment(SwingConstants.CENTER);
 
			jLabel.setForeground(new Color(255, 51, 51));
 
			jLabel.setText("Panel "+i);
 
			panel = new JPanel();
 
			panel.setLayout(null);
 
			panel.add(jLabel, null);
			
			panelMap.put(i, panel);
		}
 
		return panel;
 
	}
 
 
	/**
	 * 
	 * @param args
	 * 
	 */
 
	public static void main(String[] args) {
  
		SwingUtilities.invokeLater(new Runnable() {
			 
			public void run() {
 
				daa thisClass = new daa();
 
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
				thisClass.setVisible(true);
 
			}
 
		});
 
	}
 
	/**
	 * 
	 * This is the default constructor
	 * 
	 */
 
	public daa() {
 
//		super();
 
		initialize();
 
	}
 
	/**
	 * 
	 * This method initializes this
	 * 
	 * 
	 * 
	 * @return void
	 * 
	 */
 
	private void initialize() {
 
		this.setSize(472, 410);
 
		this.setResizable(false);
 
		this.setContentPane(getJContentPane());
 
		this.setTitle("JPanel�л�ʾ��");
 
	}
 
	/**
	 * 
	 * This method initializes jContentPane
	 * 
	 * 
	 * 
	 * @return javax.swing.JPanel
	 * 
	 */
 
	private JPanel getJContentPane() {
 
		if (jContentPane == null) {
 
			jContentPane = new JPanel();
 
			jContentPane.setLayout(new BorderLayout());
 
			jContentPane.add(getJPanel1(0), BorderLayout.CENTER);//�м����
			
			jContentPane.add(getJPanel(10), BorderLayout.WEST);//��߅���
 
		}
 
		return jContentPane;
 
	}
}