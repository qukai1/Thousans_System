package com.King.pojo;
/**
 * 用户表
 * @author Administrator
 */
public class User {
	private Integer id;//编号//商家ID
	private String sculpture;//头像
	private String mailbox;//邮箱
	private String account;//账号
	private String addres;//地址
	private String userPhone;//手机号//商家电话手机
	private String password;//密码
	private String userName;//用户名字//店铺名字
	private String merchantsType;//店铺类型
	private String type;//用户类型
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public User() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSculpture() {
		return sculpture;
	}
	public void setSculpture(String sculpture) {
		this.sculpture = sculpture;
	}
	public String getMailbox() {
		return mailbox;
	}
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(Integer id, String sculpture, String mailbox, String account, String password, String type) {
		super();
		this.id = id;
		this.sculpture = sculpture;
		this.mailbox = mailbox;
		this.account = account;
		this.password = password;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMerchantsType() {
		return merchantsType;
	}
	public void setMerchantsType(String merchantsType) {
		this.merchantsType = merchantsType;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", sculpture=" + sculpture + ", mailbox=" + mailbox + ", account=" + account
				+ ", addres=" + addres + ", userPhone=" + userPhone + ", password=" + password + ", userName="
				+ userName + ", merchantsType=" + merchantsType + ", type=" + type + "]";
	}

}
