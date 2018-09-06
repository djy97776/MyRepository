package com.djy.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.djy.dao.IManagerDao;
import com.djy.vo.Manager;
@Repository
public class ManagerDao extends BaseDao implements IManagerDao {

	public Manager selectUser(String name, String password) {
		// TODO Auto-generated method stub
		String sql = "select * from `manager` where `name`=? AND `password`=?";
		List<Manager> managers = jdbcTemplate.query(sql, new ManagerRowMapper(),name,password);
		return managers==null||managers.isEmpty()?null:managers.get(0);
	}
	class ManagerRowMapper implements RowMapper<Manager>{

		public Manager mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Manager m = new Manager(rs.getLong("id"),rs.getString("name"),rs.getString("password"),rs.getInt("flag"));
			
			return m;
		}
		
	}
}
