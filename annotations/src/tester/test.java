package tester;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import configurations.config;
import mainclass.employee;

public class test {
public static void main(String args[])
{
	
	try
	{
		   AnnotationConfigApplicationContext context
	          = new AnnotationConfigApplicationContext(config.class);
		   employee emp=context.getBean(employee.class);
		   System.out.print(emp);
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
}
