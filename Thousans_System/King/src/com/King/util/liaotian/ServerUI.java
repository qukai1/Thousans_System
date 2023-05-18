package com.King.util.liaotian;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Socket;
import java.util.List;
 
/**
 * @author ��
 * Create by fengc on  2018/7/25 21:21
 */
public class ServerUI extends JFrame {
 
    public static void main(String[] args) {
        new ServerUI();
    }
 
    public JButton btStart;//����������
    public JButton btSend;//������Ϣ��ť
    public JTextField tfSend;//��Ҫ���͵��ı���Ϣ
 
    public JTextArea taShow;//��Ϣչʾ
    public Server server;//���������ͻ�������
    static List<Socket> clients;//�������ӵ��������Ŀͻ���
 
    public ServerUI() {
        super("��������");
        btStart = new JButton("��������");
        btSend = new JButton("������Ϣ");
        tfSend = new JTextField(10); //װ����������
        taShow = new JTextArea();
        //�����ť�������������飬����������
        btStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                server = new Server(ServerUI.this);
            }
        });
        //���������Ϣ��ť
        btSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                server.sendMsg(tfSend.getText());
                tfSend.setText("");
            }
        });
        //��ʼ������
        this.addWindowListener(new WindowAdapter() {
            //�رհ�ť����¼�
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(null, "ȷ���ر���", "��ܰ��ʾ",
                        JOptionPane.YES_NO_OPTION);
                if (a == 1) {
                    server.closeServer();
                    System.exit(0); // �ر�
                }
            }
        });
        //�ײ���������ť�뷢����Ϣ��ť
        JPanel top = new JPanel(new FlowLayout());
        top.add(tfSend);
        top.add(btSend);
        top.add(btStart);
        this.add(top, BorderLayout.SOUTH);
        //�в���ʾ��Ϣ��  ��Ϣչʾ
        final JScrollPane sp = new JScrollPane();
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setViewportView(this.taShow);
        this.taShow.setEditable(false);
        this.add(sp, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocation(100, 200);
        this.setVisible(true);
    }
 
 
}