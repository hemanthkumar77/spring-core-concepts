package DAO_IMPL;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.PreparedStatement;

import DAO.DAO_interface;
import model.STUDENT;
@Repository
public class dao_impl implements DAO_interface {
	@Autowired
   private JdbcTemplate jdbc;
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public void createstudentservice( final STUDENT stu) {	
		String sql="insert into STUDENT values(?,?,?,?,?)";
		int value=jdbc.update(sql,new PreparedStatementSetter() {
			@Override
			public void setValues(java.sql.PreparedStatement ps) throws SQLException {
				ps.setInt(1,stu.getId());
				ps.setDouble(2,stu.getGpa());
				ps.setString(3, stu.getName());
				ps.setString(4,stu.getMajor());
				ps.setInt(5, stu.getAge());
			}
			
		});
	   if(value>0)
	   {
		   System.out.print("value inserted in db");
	   }
	   else
	   {
		   System.out.print("not inserted in db");
	   }
	}

	@Override
	public void updatestudentservice(int id, double gpa) {
		String sql="update STUDENT set gpa=? where id=?";
		int value=jdbc.update(sql,gpa,id);
		if(value>0)
		{
			System.out.print("updated in DB");
		}
		else
		{
			System.out.print("not inserted");
		}
	}

	@Override
	public void deletestudentservice(int id) {
    String sql="delete from STUDENT where id=?";
    int value=jdbc.update(sql,id);
    if(value>0)
    {
    	System.out.print("deleted from the db");
    }
    else
    {
    	System.out.print("value not deleted");
    }
	}

	@Override
	public STUDENT get_employee_byid_service(int id) {
		String sql="select * from STUDENT where id=?";
	   STUDENT stu= jdbc.queryForObject(sql,new row_mapper(),id);
	   return stu;
	}

	@Override
	public List<STUDENT> students() {
		String sql="select * from STUDENT";
		return jdbc.query(sql, new row_mapper());
	}

}
