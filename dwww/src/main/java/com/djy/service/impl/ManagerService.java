package com.djy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djy.dao.IManagerDao;
import com.djy.service.IManagerService;
import com.djy.vo.Manager;
@Service
public class ManagerService implements IManagerService {
	
	@Autowired
	private IManagerDao managerDao;
	
	public Manager login(String name, String password) {
		// TODO Auto-generated method stub
		return managerDao.selectUser(name, password);
	}

}
