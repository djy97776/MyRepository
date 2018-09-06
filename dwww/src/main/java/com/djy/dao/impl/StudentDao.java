package com.djy.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.djy.dao.IStudentDao;
import com.djy.vo.Student;
@Repository
public class StudentDao extends BaseDao implements IStudentDao {

	public int insertStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO `newstudent` VALUES(DEFAULT,?,?,?,?)";
		return jdbcTemplate.update(sql, student.getName(),student.getPhone(),student.getAdress(),student.getStateid());
	}

	public int deleteStudentk(Long id) {
		// TODO Auto-generated method stub
		String sql = "delete from `newstudent` where `id`=?";
		return jdbcTemplate.update(sql, id);
	}

	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "UPDATE `newstudent` SET `name`=?,`phone`=?,`adress`=?,`stateid`=? WHERE `id` = ?";
		return jdbcTemplate.update(sql, student.getName(),student.getPhone(),student.getAdress(),student.getStateid(),student.getId());
	}

	public List<Student> selectPageStudents(int page, int pageSize) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM `newstudent` LIMIT ?,?";
		
		return jdbcTemplate.query(sql, new StudentRowMapper(),(page-1)*pageSize,pageSize);
	}

	public List<Student> selectStudent(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM `newstudent` where `id`=?";
		List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper(),id);
		return students==null||students.isEmpty()?null:students;
	}
	
	
	class StudentResultSetExtractor implements ResultSetExtractor<List<Student>>{
		public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			List<Student> students = new ArrayList<Student>();
			while(rs.next()){
				Student student = new Student(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(5),rs.getLong(4));
				students.add(student);
			}
			return students;
		}
		
	}
	class StudentRowMapper implements RowMapper<Student>{

		public Student mapRow(ResultSet rs, int index) throws SQLException {
			// TODO Auto-generated method stub
			Student s = new Student(rs.getLong("id"),rs.getString("name"),rs.getString("phone"),rs.getString("adress"),rs.getLong("stateid"));
			return s;
		}

	

}
}
