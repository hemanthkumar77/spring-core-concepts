package tester;

import java.util.Date;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.stuudent;
public class test {
public static void main(String args[])
{
	AbstractApplicationContext appconn=null;
	try
	{
		appconn=new ClassPathXmlApplicationContext("callback.xml");
		stuudent stu=appconn.getBean(stuudent.class);
		if(stu!=null)
		{
			setters(stu);
			getters(stu);
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
private static void setters(stuudent stu)
{
	stu.setId(120);
	stu.setName("joker");
	stu.setDate_of_joining(new Date());
	
}
private static void getters(stuudent stu)
{
	System.out.print(stu);
}
}
