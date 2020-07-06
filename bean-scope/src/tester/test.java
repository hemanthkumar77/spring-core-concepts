package tester;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import medical.pharmacy;

public class test {
public static void main(String args[])
{
	AbstractApplicationContext appconn=null;
	try
	{
	 appconn=new ClassPathXmlApplicationContext("scope.xml");
	pharmacy phara=appconn.getBean("phar",pharmacy.class);
	pharmacy phara1=appconn.getBean("phar",pharmacy.class);
	if(phara!=null)
	{
		setters(phara);
		getters(phara);
		getters(phara1);
	}
	else
	{
		System.out.print("instance value is not available");
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
	private static void setters(pharmacy pha)
	{
		pha.setMedicine_id(100);
		pha.setMedcine_name("flu-shot");
		pha.setVaccine_name("immune-h1n1");
		pha.setDate_of_purchase(new Date());
	}
	private static void getters(pharmacy pha)
	{
		System.out.print(pha);
	}
}
