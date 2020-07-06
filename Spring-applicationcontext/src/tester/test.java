package tester;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import students.students;

public class test {
public static void main(String args[])
{
	AbstractApplicationContext appconn=null;
	try
	{
	  appconn=new ClassPathXmlApplicationContext("application.xml");
	  students student=appconn.getBean("stu",students.class);
	  
	  if(student!=null)
	  {
		  gettersmethod(student);
	  }
	  else
	  {
		  System.out.print("invalid instances id");
	  }
	  
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		if(appconn!=null)
		{
			appconn.close();
		}
	}
}
private static void gettersmethod(students stu)
{
	System.out.print(stu);
}
}
