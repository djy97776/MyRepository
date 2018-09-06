package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.djy.dao.IManagerDao;
import com.djy.dao.IStudentDao;
import com.djy.vo.Manager;
import com.djy.vo.Student;

@ContextConfiguration(locations={"classpath:applicationContext-core.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class testjdbc {
	@Autowired
	private IStudentDao studentdao;
	@Test
	public void selectStu(){
		
		List<Student> students = studentdao.selectPageStudents(1, 5);
		
		System.out.println(students);
	}
	@Test
	public void delete(){
		
		int c = studentdao.deleteStudentk(7l);
		System.out.println(c);
		
	}
	@Test
	public void insert(){
		Student student = new Student("asd1", "122sad", "213sdasd", 4l);
		int c = studentdao.insertStudent(student);
		System.out.println(c);
	}
	  @Autowired
	  private IManagerDao managerDao;
	@Test
	public void User(){
		 Manager manager = managerDao.selectUser("djy", "123123");
		 System.out.println(manager);
		if (manager!=null&&manager.getFlag()==1) {
			System.out.println("sss");
		}
	}
}
