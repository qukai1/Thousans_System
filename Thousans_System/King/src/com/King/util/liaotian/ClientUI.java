package com.King.util.liaotian;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
/**
 * @author ��
 * Create by fengc on  2018/7/25 21:40
 */
public class ClientUI extends JFrame {
 
    public static void main(String[] args) {
        new ClientUI();
    }
 
    public     JButton btStart;
    public     JButton btSend;
    public     JTextField tfSend; //װ����������
    public     JTextPane  nameText; //��������
    public     JTextPane  ipTex; //��������
    public     JTextPane  portText; //��������
    public     JTextField tfName; //������ip
    public     JTextField tfIP; //������ip
    public     JTextField tfPort; //�������˿�
    public     JTextArea taShow;
    public     Client server;
 
    public ClientUI() {
        super("�ͻ���");
        btStart = new JButton("��������");
        btSend = new JButton("������Ϣ");
        tfSend = new JTextField(20);
        tfIP = new JTextField(8);
        tfPort = new JTextField(3);
        tfName = new JTextField(6);
        nameText = new JTextPane();nameText.setText("��¼��");nameText.setEditable(false);
        ipTex = new JTextPane();ipTex.setText("�����ַ");ipTex.setEditable(false);
        portText = new JTextPane();portText.setText("����˿�");portText.setEditable(false);
        taShow = new JTextArea();
        //�������Ӱ�ť�¼�
        btStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                server = new Client(ClientUI.this);
            }
        });
        //���Ͱ�ť�¼�
        btSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                if (name == null || "".equals(name)) {
                    name = "������";
                }
                server.sendMsg(name + "��" + tfSend.getText());
                tfSend.setText("");
            }
        });
 
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(null, "ȷ���ر���", "��ܰ��ʾ",
                        JOptionPane.YES_NO_OPTION);
                if (a == 1) {
                    System.exit(0); // �ر�
                }
            }
        });
        //�ײ��ķ�����Ϣ�������Ӱ�ť
        JPanel top = new JPanel(new FlowLayout());
        top.add(tfSend); //�����ı�
        top.add(btSend); //���Ͱ�ť
        this.add(top, BorderLayout.SOUTH); //���ص��ײ�
 
        //ͷ�������ӷ����
        JPanel northJpannel = new JPanel(new FlowLayout());
        northJpannel.add(nameText);
        northJpannel.add(tfName);
        northJpannel.add(ipTex);
        northJpannel.add(tfIP);
        northJpannel.add(portText);
        northJpannel.add(tfPort);
        northJpannel.add(btStart);
        this.add(northJpannel,BorderLayout.NORTH);  //���ص�ͷ��
 
        final JScrollPane sp = new JScrollPane();
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setViewportView(this.taShow);
        this.taShow.setEditable(false);
        this.add(sp, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setLocation(600, 200);
        this.setVisible(true);
    }
 
 
 
}