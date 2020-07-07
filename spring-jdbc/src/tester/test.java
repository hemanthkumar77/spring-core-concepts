package tester;

import java.security.Provider.Service;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Service_impl.service;
import model.STUDENT;
import Service.Service_interface;
public class test {
	
public static void main(String args[])
{
	
	AbstractApplicationContext appconn=null;
	try
	{
		Scanner input_int=new Scanner(System.in);
		Scanner input_String=new Scanner(System.in);
		int ch=0;
		while(ch!=6)
		{
		appconn=new ClassPathXmlApplicationContext("db.xml");
		Service_interface ser=appconn.getBean(service.class);
		System.out.print("select the option to perform the operation:1.insert  2.update 3.delete 4.fetch by id 5.fetch all  6.close the DB");
		ch= input_int.nextInt();
		switch(ch)
		{
		case 1:
			  STUDENT stu=new STUDENT();
			  System.out.print("enter the id: ");
				int id=input_int.nextInt();
				stu.setId(id);
				System.out.print("enter the name : ");
				String name=input_String.nextLine();
				stu.setName(name);
				System.out.print("enter the age : ");
				int age=input_int.nextInt();
				stu.setAge(age);
				System.out.print("enter the major: ");
			    String major=input_String.nextLine();
			    stu.setMajor(major);
			    System.out.print("enter the gpa: ");
			    double gpa=input_int.nextDouble();
			    stu.setGpa(gpa);
			    ser.createstudent(stu);
			    System.out.print("\n");
			    break;
		case 2:
			System.out.print("enter the id: ");
			int id1=input_int.nextInt();
			System.out.print("enter the new gpa: ");
			 double gpa2=input_int.nextDouble();
			 ser.updatestudent(id1, gpa2);
			 System.out.print("\n");
			 break;
		case 3:
			System.out.print("enter the id: ");
			int id2=input_int.nextInt();
			ser.deletestudent(id2);
			System.out.print("\n");
			break;
		case 4:
			System.out.print("enter the id value: ");
			int id3=input_int.nextInt();
			STUDENT student=ser.getemployee_by_id(id3);
			if(student!=null)
			{
			System.out.print("id: "+student.getId()+"  name "+student.getName()+"\t"+"major: "+ student.getMajor()+"\t"+"GPA: "+student.getGpa());
			}
			else
			{
				System.out.print("value not in the DB");
			}
			break;
		case 5:
			List<STUDENT> stud1=ser.stud();
			for(STUDENT obj:stud1)
			{
				System.out.print("id: "+obj.getId()+"  name "+obj.getName()+"\t"+"major: "+ obj.getMajor()+"\t"+"GPA: "+obj.getGpa());
			}
			break;
		case 6:
			System.out.print("DB connectivity closed!!!");
			System.out.print("\n");
			break;
			
		default:
			System.out.print("wrong option!!");
			System.out.print("\n");
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


}
