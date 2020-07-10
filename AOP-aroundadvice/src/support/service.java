package support;

import org.springframework.stereotype.Service;

import MODEL.employee;

@Service
public class service {
public employee updateaccount(employee emp,double tax) throws Exception
{
	if(tax==0)
	{
		throw new Exception("invalid tax statement");
	}
	System.out.println("Account_number of the employee: "+emp.getAcc_num()+"\t "+"salary credited: "+emp.getSalary()+"\t"+"after the tax deduction: "+tax);
	return emp;
}
}
 