package com.djy.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djy.dao.IStudentDao;
import com.djy.service.IStudentService;
import com.djy.vo.Student;
@Service
public class StudentService implements IStudentService {
	@Autowired
	private IStudentDao studentDao;


	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.insertStudent(student);
	}

	public List<Student> findstudents() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Student> findPagestudents(int page, int size) {
		// TODO Auto-generated method stub
		return studentDao.selectPageStudents(page, size);
	}

	public int deleteStu(Long id) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudentk(id);
	}

	public int updateStu(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

	public List<Student> selectOne(Long id) {
		// TODO Auto-generated method stub
		return studentDao.selectStudent(id);
	}


}
