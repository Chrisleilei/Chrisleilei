package com.yy.dto;

import com.yy.model.TbUser;
public class UserDTO implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private String userName;
	private String userLoginName;
	private String userPwd;
	private Integer userSex;
	private String userPhone;
	private String userMailBox;
	private String userRealSex;
	
	public UserDTO(){
	}
	
	
	
	
	public Integer getUserId() {
		return userId;
	}




	public void setUserId(Integer userId) {
		this.userId = userId;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getUserLoginName() {
		return userLoginName;
	}




	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}




	public String getUserPwd() {
		return userPwd;
	}




	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}




	public Integer getUserSex() {
		return userSex;
	}




	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}




	public String getUserPhone() {
		return userPhone;
	}




	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}




	public String getUserMailBox() {
		return userMailBox;
	}




	public void setUserMailBox(String userMailBox) {
		this.userMailBox = userMailBox;
	}




	public String getUserRealSex() {
		return userRealSex;
	}




	public void setUserRealSex(String userRealSex) {
		this.userRealSex = userRealSex;
	}




	public TbUser toDAO(){
		TbUser userBean = new TbUser();
		userBean.setUserId(this.getUserId());
		userBean.setUserLoginName(this.getUserLoginName());
		userBean.setUserName(this.getUserName());
		userBean.setUserMailBox(this.getUserMailBox());
		userBean.setUserPhone(this.getUserPhone());
		userBean.setUserSex(this.getUserSex());
		userBean.setUserPwd(this.getUserPwd());
		return userBean;
	}
}
