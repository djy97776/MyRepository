package com.djy.dao;

import com.djy.vo.Manager;

public interface IManagerDao {
	
	public Manager selectUser(String name,String password);
}
