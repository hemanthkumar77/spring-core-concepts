package dao_imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.bank;

public class row_mapper implements RowMapper<bank> {

	@Override
	public bank mapRow(ResultSet rs, int row_num) throws SQLException {
		bank ban=new bank();
		ban.setAcc_num(rs.getString("acc_num"));
		ban.setAccount_balance(rs.getDouble("account_balance"));
		ban.setAccount_type(rs.getString("account_type"));
		ban.setCust_name(rs.getString("cust_name"));
		ban.setBranch_name(rs.getString("branch_name"));
		return ban;
	}

}
