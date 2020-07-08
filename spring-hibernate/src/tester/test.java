package tester;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SERVICE.service_interface;
import SERVICE_IMPL.service_impl;
import model.SPORTS;

public class test {
public static void main(String args[])
{
	Scanner input_int=new Scanner(System.in);
	 Scanner input_str=new Scanner(System.in);
	 AbstractApplicationContext appconn =null;
	 try
	 {
		 int ch=0;
		 appconn=new ClassPathXmlApplicationContext("sports.xml");
		 service_interface ser=(service_interface) appconn.getBean(service_impl.class);
		 SPORTS ser1=new SPORTS();
		 while(ch!=6)
		 {
			 System.out.print("select the operations 1.insert 2.update 3.delete 4.fetch_by_id 5.fetch_all 6.terminate ");
			 ch=input_int.nextInt();
			 switch(ch)
			 {
			 case 1:
				 insert_value(ser1);
				 ser.insert_service(ser1);
				 System.out.print("\n");
				 break;
			 case 2:
				 System.out.print("enter the id: ");
				 int id=input_int.nextInt();
				 System.out.print("enter the name: ");
				 double value=input_int.nextDouble();
				 ser.update_service(id, value);
				 System.out.print("\n");
				 break;
			 case 3:
				   System.out.print("enter the id: ");
				   int id1=input_int.nextInt();
				   ser.delete_service(id1);
					 System.out.print("\n");
					 break;
			 case 4:
				 System.out.print("enter the id: ");
				   int id2=input_int.nextInt();
				   ser.fetch_employee_by_id_service(id2);
				   System.out.print("\n");
					 break;
			 case 5:
				 ser.fetch_employee_service();
				   System.out.print("\n");
					 break;
			 case 6:
				  System.out.print("terminated");
				  System.out.print("\n");
				  break;
				   
			default:
				System.out.print("wrongly entered the value ");
			
				 
			 }
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
private static void insert_value(SPORTS ser)
{	Scanner input_int=new Scanner(System.in);
    Scanner input_str=new Scanner(System.in);
	System.out.print("enter the id: ");
	int id=input_int.nextInt();
	ser.setSports_id(id);
	System.out.print("enter the name: ");
    String name=input_str.nextLine();
    ser.setSports_name(name);
    System.out.print("enter the season: ");
    String season=input_str.nextLine();
    ser.setSeason(season);
    System.out.print("enter the cost: ");
    double cost=input_int.nextDouble();
    ser.setCost(cost);
    System.out.print("enter the number_of_players: ");
    int number=input_int.nextInt();
    ser.setNumber_of_players(number);
}
}
