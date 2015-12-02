package com.yy.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.yy.dao.ICompanyDAO;
import com.yy.model.TbCompany;

@Component
public class CompanyDAO implements ICompanyDAO{
	@Resource
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TbCompany> getAllCompany() throws Exception{
		String hql = "SELECT tbcompany FROM TbCompany as tbcompany";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public int getCompanyCount() throws Exception{
		int result = 0;
		try {
			Session session = sessionFactory.getCurrentSession();
			String hql = "select count(*) from TbCompany  ";
			Query query = session.createQuery(hql);
			result = Integer.parseInt(query.uniqueResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
		
	}
	
}
