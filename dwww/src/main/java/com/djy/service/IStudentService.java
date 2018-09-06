package com.djy.service;

import java.util.List;

import com.djy.vo.Student;


public interface IStudentService {
	
	
	public int addStudent(Student student);

	public int deleteStu(Long id);
	
	public List<Student> findstudents();
	
	public List<Student> findPagestudents(int page,int size);
	
	public int updateStu(Student student);
	
	public List<Student> selectOne(Long id);
}
