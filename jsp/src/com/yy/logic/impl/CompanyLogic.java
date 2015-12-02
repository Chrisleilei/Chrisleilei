package com.yy.logic.impl;

import com.yy.logic.ICompanyLogic;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.yy.dao.ICompanyDAO;
import com.yy.model.TbCompany;
import com.yy.dto.CompanyDTO;

@Component
public class CompanyLogic implements ICompanyLogic{
	@Resource
	private ICompanyDAO companyDAO;
	
	@Transactional
	@Override
	public JSONObject getAllCompany()throws Exception{
		Map<String,Object> jsonMap = new HashMap<String,Object>();
		int count = 0;
		try{
			List<TbCompany> listCompanyBean = this.companyDAO.getAllCompany(); 
			count = this.companyDAO.getCompanyCount();
			List<CompanyDTO> listCompanyDTO = new ArrayList<CompanyDTO>();
			Iterator<TbCompany> itrCompanyBean = listCompanyBean.iterator();
			while(itrCompanyBean.hasNext()){
				TbCompany objCompanyBean = (TbCompany) itrCompanyBean.next();
				listCompanyDTO.add(objCompanyBean.toDTO());
			}
			jsonMap.put("data", listCompanyDTO);
			jsonMap.put("num",count);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return JSONObject.fromObject(jsonMap);
	}
}
