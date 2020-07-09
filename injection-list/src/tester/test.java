package tester;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.student;
import setters.support;

public class test {
public static void main(String args[])
{
	AbstractApplicationContext appconn=null;
	try
	{
		appconn =new ClassPathXmlApplicationContext("injectionxml.xml");
		support su=appconn.getBean("sup",support.class);
		List<student>stdu=su.getStu_obj();
		for(student stu:stdu)
		{
			System.out.print(stu);
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
}
