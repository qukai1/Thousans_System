package com.King.Text.NE;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//Java8�汾����ͨ��
 
//DemoFrame �̳��� JFrame
public class afddafa extends JFrame{
 
    JButton jb1,jb2;// 1����ť
     
    public afddafa() {
 
        jb1 = new JButton("����һ"); 
        jb2 = new JButton("������"); 
        JPanel jp = new JPanel();   //�������
        jp.add(jb1);jp.add(jb2);
        this.add(jp);//�������ӵ�����
         
        //����1
        jb1.addActionListener(e->{
            JOptionPane.showMessageDialog(this, "����JOptionPane�����򵥴���", "����1", JOptionPane.INFORMATION_MESSAGE);
        });
         
        //����2
        MyDialog md=new MyDialog(this);
        jb2.addActionListener(e->{
            md.setVisible(true);
        });
         
        //���岿�ֵ�����
        setTitle("������");//���ñ���
        setSize(320, 300); // ���ô��ڴ�С
        setLocationRelativeTo(null); //���ô�������Ļ������
        setDefaultCloseOperation(EXIT_ON_CLOSE);//����رհ�ťʱ�˳�
    }
     
    //main����
    public static void main(String[] args) {
        EventQueue.invokeLater(()->new afddafa().setVisible(true));//�������ڲ����ÿɼ�
    }
}
 
//�Զ��嵯��������
class MyDialog extends JDialog{
    public MyDialog(afddafa frame) {
        super(frame);//������ָ��������this
        setTitle("����2"); 
        setModal(true);//!!! ����Ϊģ̬����,�����ڲ��ܱ����
        setSize(170,92);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);//����رհ�ťʱ���ٵ���
         
        //JDialog��Ϊ���� �кܴ�����ɶ�, ������JFrameһ����Ӹ������
        JLabel jl = new JLabel("����JDialog ����Ϊ����");
        add(jl);
    }
}