package com.djy.dao;



import java.util.List;

import com.djy.vo.Student;


public interface IStudentDao {

	

public int insertStudent(Student student);
	
	public int deleteStudentk(Long id);
	
	public int updateStudent(Student student);
	
	public List<Student> selectPageStudents(int page,int pageSize);
	
	public List<Student> selectStudent(Long id);
	
}