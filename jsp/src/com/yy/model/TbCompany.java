package com.yy.model;

//import java.util.HashSet;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.yy.dto.CompanyDTO;

@Entity
@Table(name = "tb_company", catalog = "jspbighomework")
@Proxy(lazy = false)
public class TbCompany implements java.io.Serializable{
	private Integer companyId;
	private String companyName;
	private String companyPhone;
	private String companyIntro;
	private String companyManName;
	private String companyManPwd;
	
	public TbCompany(){
		
	}
	
	public TbCompany(int companyId,String companyName,String companyPhone,
						String companyIntro,String companyManName,String companyManPwd){
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyPhone = companyPhone;
		this.companyIntro = companyIntro;
		this.companyManName = companyManName;
		this.companyManPwd = companyManPwd;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "company_id", unique = true, nullable = false)
	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	
	@Column(name = "company_name", nullable = false)
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Column(name = "company_phone", nullable = false)
	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	
	@Column(name = "company_introduction", nullable = false)
	public String getCompanyIntro() {
		return companyIntro;
	}

	public void setCompanyIntro(String companyIntro) {
		this.companyIntro = companyIntro;
	}
	
	@Column(name = "company_manger_name", nullable = false)
	public String getCompanyManName() {
		return companyManName;
	}

	public void setCompanyManName(String companyManName) {
		this.companyManName = companyManName;
	}
	
	@Column(name = "company_manger_pwd", nullable = false)
	public String getCompanyManPwd() {
		return companyManPwd;
	}

	public void setCompanyManPwd(String companyManPwd) {
		this.companyManPwd = companyManPwd;
	}
	
	public CompanyDTO toDTO(){
		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setCompanyId(this.getCompanyId());
		companyDTO.setCompanyName(this.getCompanyName());
		companyDTO.setCompanyPhone(this.getCompanyPhone());
		companyDTO.setCompanyIntro(this.getCompanyIntro());
		companyDTO.setCompanyManName(this.getCompanyManName());
		companyDTO.setCompanyManPwd(this.companyManPwd);
		
		return companyDTO;
	}
}
