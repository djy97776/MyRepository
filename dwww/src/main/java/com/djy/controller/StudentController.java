package com.djy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djy.service.IStudentService;
import com.djy.vo.Student;

@Controller
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/addStu/{id}/{name}/{phone}/{adress}/{stateid}")
	@ResponseBody
	public int addStu(@PathVariable long id,@PathVariable String name,@PathVariable String phone,@PathVariable String adress,@PathVariable long stateid){
		Student student = new Student(id,name, phone, adress, stateid);
		int c = studentService.addStudent(student);
		return c;
		
	}
	
	@RequestMapping("/loadStu/{page}/{size}")
	@ResponseBody
	public List<Student> loadStu(@PathVariable int page,@PathVariable int size){
		List<Student> students  = studentService.findPagestudents(page, size);
		return students;
		
	}
	
	@RequestMapping("/dell/{id}")
	@ResponseBody
	public int delete(@PathVariable long id){
		int c = studentService.deleteStu(id);
		return c;
	}
	@RequestMapping("/updateStu/{id}/{name}/{phone}/{adress}/{stateid}")
	@ResponseBody
	public int updateS(@PathVariable long id,@PathVariable String name,@PathVariable String phone,@PathVariable String adress,@PathVariable long stateid){
		Student student = new Student(id,name, phone, adress, stateid);
		int c = studentService.updateStu(student);
		return c;
		
	}
	@RequestMapping("/update/{id}")
	@ResponseBody
	public List<Student> selectOne(@PathVariable long id){
		
		List<Student> student = studentService.selectOne(id);
		return student;
		
	}
	}
