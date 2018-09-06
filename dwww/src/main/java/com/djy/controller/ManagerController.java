package com.djy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djy.service.IManagerService;
import com.djy.vo.Manager;

@Controller
public class ManagerController {
	
	@Autowired
	private IManagerService managerService;
	
	@RequestMapping("/login/{name}/{password}")
	@ResponseBody
	public int login(@PathVariable String name,@PathVariable  String password,HttpSession session){
		Manager manager = managerService.login(name, password);
		if (manager!=null&&manager.getFlag()==1) {
			session.setAttribute("manager", manager);
			return 1;
		}else{
			return 0;
		}
	}	
	@RequestMapping("/getUser")	
	@ResponseBody
	
	public Manager getUser(HttpSession session){
		
		
		Manager manager =(Manager)session.getAttribute("manager");
		
		if (manager!=null) {
			manager.setPassword("******");
		}
		return manager;
	}
		
	
}
