package com.King.util;
import java.util.Random;
import org.apache.commons.mail.HtmlEmail;
/**
 * ������������֤��
 * @author Administrator
 *
 */
public class JavaEmailUtil{
	public static void main(String[] args) {
		new JavaEmailUtil().sendAuthCodeEmail("heibas@126.com");
	}
	 /**
     * ������֤��
     * @param email
     * @return
     */
    public String sendAuthCodeEmail(String email) {
    	 String code;
        try {
            HtmlEmail mail = new HtmlEmail();
            /*�����ʼ��ķ����� 126����Ϊsmtp.126.com,163����Ϊ163.smtp.com��QQΪsmtp.qq.com*/
            mail.setHostName("smtp.qq.com");
            /*�����÷��͵���Ϣ�п���������*/
            mail.setCharset("UTF-8");
            /*IMAP/SMTP���������*/
            mail.setAuthentication("1538935808@qq.com", "uzokftqjotgljbih");
            /*�����ʼ�������ͷ�����*/
            mail.setFrom("1538935808@qq.com", "�����͵��ϵͳ");
            /*ʹ�ð�ȫ����*/
            mail.setSSLOnConnect(true);
            /*���յ�����*/
            mail.addTo(email);
            /*��֤��*/
            code = this.generateVerifyCode(6);
            /*�����ʼ�������*/
            mail.setSubject("ע����֤��");
            /*�����ʼ�������*/
            mail.setMsg("�𾴵��û�:���! ע����֤��Ϊ:" + code + "(��Ч��Ϊһ����)");
            mail.send();//����
        } catch (Exception e) {
            return "";
        }
        return code;
    }
    /**
     * ���������֤��
     * @param number ��λ��
     * @return
     */
    public String generateVerifyCode(int number) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }
}
