package com.King.util;
import java.util.Random;
import org.apache.commons.mail.HtmlEmail;
/**
 * 发送至邮箱验证码
 * @author Administrator
 *
 */
public class JavaEmailUtil{
	public static void main(String[] args) {
		new JavaEmailUtil().sendAuthCodeEmail("heibas@126.com");
	}
	 /**
     * 发送验证码
     * @param email
     * @return
     */
    public String sendAuthCodeEmail(String email) {
    	 String code;
        try {
            HtmlEmail mail = new HtmlEmail();
            /*发送邮件的服务器 126邮箱为smtp.126.com,163邮箱为163.smtp.com，QQ为smtp.qq.com*/
            mail.setHostName("smtp.qq.com");
            /*不设置发送的消息有可能是乱码*/
            mail.setCharset("UTF-8");
            /*IMAP/SMTP服务的密码*/
            mail.setAuthentication("1538935808@qq.com", "uzokftqjotgljbih");
            /*发送邮件的邮箱和发件人*/
            mail.setFrom("1538935808@qq.com", "万来客点餐系统");
            /*使用安全链接*/
            mail.setSSLOnConnect(true);
            /*接收的邮箱*/
            mail.addTo(email);
            /*验证码*/
            code = this.generateVerifyCode(6);
            /*设置邮件的主题*/
            mail.setSubject("注册验证码");
            /*设置邮件的内容*/
            mail.setMsg("尊敬的用户:你好! 注册验证码为:" + code + "(有效期为一分钟)");
            mail.send();//发送
        } catch (Exception e) {
            return "";
        }
        return code;
    }
    /**
     * 生成随机验证码
     * @param number 几位数
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
