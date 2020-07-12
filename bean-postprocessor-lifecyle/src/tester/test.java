package tester;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.employee;

public class test {
public static void main(String args[])
{
	AbstractApplicationContext appconn=null;
	try
	{
		appconn=new ClassPathXmlApplicationContext("bean.xml");
		employee emp =appconn.getBean("emp",employee.class);
		if(emp!=null)
		{
			setters(emp);
			getters(emp);
		}
		else
		{
			System.out.print("invalid instances");
		}
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	finally
	{
		appconn.close();
	}
}
private static void setters(employee emp)
{
	emp.setId(102);
	emp.setName("patrick");
	emp.setSalary(5000.23);
	emp.setDepartment("csc");
}
private static void getters(employee emp)
{
	System.out.println(emp.toString());
}
}
