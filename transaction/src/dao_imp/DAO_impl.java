package dao_imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DAO.dao;
import DAOexception.nomoneyinaccount;
import model.bank;
@Repository
public class DAO_impl implements dao {
	@Autowired
public JdbcTemplate jdbc;
	public JdbcTemplate getJdbc() {
	return jdbc;
}

public void setJdbc(JdbcTemplate jdbc) {
	this.jdbc = jdbc;
}

	@Override
	public void debit(bank fromacc, bank toacc, double money) throws nomoneyinaccount {
		bank acc=get_details(fromacc.getAcc_num());
		double new_bal=acc.getAccount_balance()-money;
		if(acc.getAccount_balance()>=money)
		{
			String sql="update bank set account_balance=?  where acc_num=?";
			int update=getJdbc().update(sql,new_bal,acc.getAcc_num());
			if(update>0)
			{
				System.out.println("transfer from the account: "+acc.getAcc_num()+"\t"+"debited amount: "+money +"\t"+"tansfered to: "+toacc.getAcc_num());	
			}
			else
			{
				System.out.println("not updated");
			}
		}
		else
		{
			throw new nomoneyinaccount("insufficent fund");
		}
		
	}

	@Override
	public void credit(bank fromacc, bank toacc, double money) {
		bank acc=get_details(toacc.getAcc_num());
		double new_bal=acc.getAccount_balance()+money;
			String sql="update bank set account_balance1=?  where acc_num=?";
			int update=getJdbc().update(sql,new_bal,acc.getAcc_num());
			if(update>0)
			{
				System.out.println("credited with the amount: "+money+"\t"+"from the account_number: "+fromacc.getAcc_num());	
			}
			else
			{
				System.out.println("not updated");
			}
		
	}
  private bank get_details(String number)
  {
	  bank ban=null;
	  String sql="select * from bank where acc_num=?";
	   ban=getJdbc().queryForObject(sql,new row_mapper(),number);
	  return ban;
  }
}
