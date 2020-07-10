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
		ser.updateaccount(new employee(200,"patrick","NEW-YORK-123890",5000.23),1890.23);
		appconn.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
