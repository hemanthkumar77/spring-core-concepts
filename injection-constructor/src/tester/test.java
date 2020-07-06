package tester;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import client_address.Address;
import client_details.client;

public class test {
public static void main(String args[])
{
	AbstractApplicationContext appconn=null;
	try
	{
		appconn=new ClassPathXmlApplicationContext("setter.xml");
		client object=appconn.getBean("emp",client.class);
		if(object!=null)
		{
		  System.out.print("id: "+object.getId()+"\t"+"name: "+object.getName());
		  Address add=object.getAdress();
		  System.out.print(add);
		}
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		appconn.close();
	}
}
}
