package tester;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import MODEL.employee;
import support.service;

public class test {
public static void main(String args[])
{
	AbstractApplicationContext appconn =null;
	try
	{
		appconn=new ClassPathXmlApplicationContext("aop.xml");
		service ser=appconn.getBean(service.class);
		employee emp=ser.getemployee(null);
		if(emp!=null)
		{
			System.out.println("name: "+emp.getName()+"\t"+"salary: "+emp.getSalary());
		}
		appconn.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
