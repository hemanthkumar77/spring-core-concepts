package support;

import org.springframework.stereotype.Service;

import MODEL.employee;

@Service
public class service {
public void updateaccount(employee emp,double tax)
{
	System.out.println("Account_number of the employee: "+emp.getAcc_num()+"\t "+"salary credited: "+emp.getSalary()+"\t"+"after the tax deduction: "+tax);
}
}
 