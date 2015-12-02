package com.yy.dao;

import java.util.List;

import com.yy.model.TbCompany;

public interface ICompanyDAO {
	public List<TbCompany> getAllCompany() throws Exception;
	public int getCompanyCount() throws Exception;
}
