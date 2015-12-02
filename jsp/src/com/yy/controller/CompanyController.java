package com.yy.controller;

import java.io.PrintWriter;

import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import com.yy.logic.ICompanyLogic;
import com.yy.dto.CompanyDTO;

public class CompanyController extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	
	private CompanyDTO companyDTO;
	@Resource
	private ICompanyLogic companyLogic;

	public CompanyDTO getCompanyDTO() {
		return companyDTO;
	}

	public void setCompanyDTO(CompanyDTO companyDTO) {
		this.companyDTO = companyDTO;
	}


	public void getAllCompany()throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		try{
			System.out.println("THIS IS Company Controller 1");
			out.println(this.companyLogic.getAllCompany());
			System.out.println("THIS IS Company Controller 2");
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.flush();
			out.close();
		}
	}
}
