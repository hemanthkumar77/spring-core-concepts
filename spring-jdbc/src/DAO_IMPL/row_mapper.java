package DAO_IMPL;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.STUDENT;

public class row_mapper implements RowMapper<STUDENT> {

	@Override
	public STUDENT mapRow(ResultSet rs, int num) throws SQLException {
		STUDENT STU=new STUDENT();
		STU.setId(rs.getInt("id"));
		STU.setName(rs.getString("name"));
		STU.setMajor(rs.getString("major"));
		STU.setGpa(rs.getDouble("gpa"));
		STU.setAge(rs.getInt("age"));
		return STU;
	}

}
