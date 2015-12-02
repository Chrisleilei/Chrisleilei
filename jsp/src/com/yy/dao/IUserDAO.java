package com.yy.dao;

import java.util.List;

import com.yy.model.TbUser;

public interface IUserDAO {
	public List<TbUser> loginCheck(String userLoginName1) throws Exception;
}
