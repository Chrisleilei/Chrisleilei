package com.yy.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

import org.hibernate.annotations.Proxy;
import com.yy.dto.UserDTO;


@Entity
@Table(name = "tb_user", catalog = "jspbighomework")
@Proxy(lazy = false)
public class TbUser implements java.io.Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String userName;
	private String userLoginName;
	private String userPwd;
	private Integer userSex;
	private String userPhone;
	private String userMailBox;
	
	public TbUser(){
	}
	
	public TbUser(int userId,String userName,String userLoginName,
			String userPwd,int userSex,String userPhone,String userMailBox){
		this.userId = userId;
		this.userName = userName;
		this.userLoginName = userLoginName;
		this.userPwd = userPwd;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.userMailBox = userMailBox;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	@Column(name = "user_name", nullable = false)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	@Column(name = "user_login_name", nullable = false)
	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	
	
	@Column(name = "user_pwd", nullable = false)
	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	
	@Column(name = "user_sex", nullable = false)
	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	
	
	@Column(name = "user_phone", nullable = false)
	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	
	@Column(name = "user_mailbox", nullable = false)
	public String getUserMailBox() {
		return userMailBox;
	}

	public void setUserMailBox(String userMailBox) {
		this.userMailBox = userMailBox;
	}
	
	public UserDTO toDTO(){
		UserDTO userDTO  = new UserDTO();
		userDTO.setUserId(this.getUserId());
		userDTO.setUserLoginName(this.getUserLoginName());
		userDTO.setUserRealSex(this.getUserSex() == 1?"男":"女");
		userDTO.setUserPhone(this.getUserPhone());
		userDTO.setUserMailBox(this.getUserMailBox());
		userDTO.setUserPwd(this.getUserPwd());
		
		return userDTO;
	}
	
}
