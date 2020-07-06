package tester;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import IOC.employee;

public class tester {

	public static void main(String[] args) {
		org.springframework.core.io.Resource res=new ClassPathResource("IOC.xml");
		BeanFactory bean=new XmlBeanFactory((org.springframework.core.io.Resource) (res));
        Object obj=bean.getBean("emp");
        if(obj!=null)
        {
        	employee emp1= (employee) obj;
            settersmethod(emp1);
            gettermethod(emp1);
        }
        else
        {
        	System.out.print("invalid instance name of the class");
        }
	}
private static void settersmethod(employee emp)
{
	emp.setId(123);
    emp.setName("robert bill");
    emp.setDepartment("java-microservices");
    emp.setSalary(23400.23);
}
private static void gettermethod(employee emp)
{
	System.out.print(emp);
}
}
