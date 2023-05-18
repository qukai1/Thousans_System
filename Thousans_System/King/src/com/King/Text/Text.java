package com.King.Text;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
@SuppressWarnings("serial")
public class Text extends JFrame implements ActionListener,ChangeListener
{
    JFrame frame=null;
    JProgressBar progressbar;
    JLabel label;
    Timer timer;
    JButton b;
    public static void main(String[] args) {
        new Text();    //����һ��ʵ��������

	}
	/**
	 * Create the frame.
	 */
	public Text() {
	    frame=new JFrame("�����װ");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container contentPane=frame.getContentPane();
	    label=new JLabel(" ",JLabel.CENTER);    //������ʾ������Ϣ���ı���ǩ
	    progressbar=new JProgressBar();    //����һ��������
	    progressbar.setOrientation(JProgressBar.HORIZONTAL);
	    progressbar.setMinimum(0);
	    progressbar.setMaximum(100);
	    progressbar.setValue(0);
	    progressbar.setStringPainted(true);
	    progressbar.addChangeListener(this);    //����¼�������
	    //���ý������ļ�����״
	    progressbar.setPreferredSize(new Dimension(300,20));
	    progressbar.setBorderPainted(true);
	    progressbar.setBackground(Color.pink);
	    //���������ť
	    JPanel panel=new JPanel();
	    b=new JButton("��װ");
	    b.setForeground(Color.blue);
	    //����¼�������
	    b.addActionListener(this);
	    panel.add(b);
	    timer=new Timer(100, this);    //����һ����ʱ������ʱ���Ϊ100����
	    //�������ӵ�frame��
	    contentPane.add(panel,BorderLayout.NORTH);
	    contentPane.add(progressbar,BorderLayout.CENTER);
	    contentPane.add(label,BorderLayout.SOUTH);
	    frame.pack();
	    frame.setVisible(true);
	}
	//ʵ���¼��������ӿ��еķ���
	public void actionPerformed(ActionEvent e)
	{
	    if(e.getSource()==b)
	        timer.start();
	    if(e.getSource()==timer)
	    {
	        int value=progressbar.getValue();
	        if(value<100)
	        {
	            try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            progressbar.setValue(++value);
	        }
	        else
	        {
	            timer.stop();
	            frame.dispose();
	        }
	    }
	}
	public void stateChanged(ChangeEvent e1)    //ʵ���¼��������ӿ��еķ���
	{
	    int value=progressbar.getValue();
	    if(e1.getSource()==progressbar)
	    {
	        b.setText("Ŀǰ����ɽ��ȣ�"+Integer.toString(value)+" %");
	        label.setForeground(Color.blue);
	    }
	}
}
