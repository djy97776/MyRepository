package com.djy.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.AfterThrowing;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djy.service.IStudentService;
import com.djy.vo.Student;

@Controller
public class TestController {
	@Autowired
	private IStudentService studentService;
	
	
	
	@RequestMapping("/abc")
	public String abc(){
		
		System.out.println("abc 到此一游");
		return "abc";
	}
	/*@RequestMapping("/addStu")
	@ResponseBody
	public int addStu(Student student){
		System.out.println(student);
		int c = studentService.addStudent(student);
		System.out.println(c);
		return c;
		
	}*/
	
/*	@RequestMapping("/loadStu")
	@ResponseBody
	public List<Student> loadStu(){
		List<Student> students  = studentService.findPagestudents(2, 5);
		System.out.println(students);
		return students;
		
	}*/
	
	}
