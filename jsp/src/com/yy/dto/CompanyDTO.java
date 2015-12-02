package com.yy.dto;

import java.io.Serializable;

import com.yy.model.TbCompany;

public class CompanyDTO implements Serializable{
	private static final long serialVersionUID = 1L;//为了序列化
	private Integer companyId;
	private String companyName;
	private String companyPhone;
	private String companyIntro;
	private String companyManName;
	private String companyManPwd;
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public String getCompanyIntro() {
		return companyIntro;
	}
	public void setCompanyIntro(String companyIntro) {
		this.companyIntro = companyIntro;
	}
	public String getCompanyManName() {
		return companyManName;
	}
	public void setCompanyManName(String companyManName) {
		this.companyManName = companyManName;
	}
	public String getCompanyManPwd() {
		return companyManPwd;
	}
	public void setCompanyManPwd(String companyManPwd) {
		this.companyManPwd = companyManPwd;
	}
	
	
	public TbCompany toDAO(){
		TbCompany companyBean = new TbCompany();
		companyBean.setCompanyId(this.getCompanyId());
		companyBean.setCompanyName(this.getCompanyName());
		companyBean.setCompanyIntro(this.getCompanyIntro());
		companyBean.setCompanyPhone(this.getCompanyPhone());
		companyBean.setCompanyManName(this.getCompanyManName());
		companyBean.setCompanyManPwd(this.getCompanyManPwd());
		
		return companyBean;
	}
	
}
