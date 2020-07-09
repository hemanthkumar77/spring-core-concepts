package tester;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.employee;
import support.map;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class test {

	public static void main(String[] args) {
		AbstractApplicationContext appconn=null;
		try
		{
			appconn=new ClassPathXmlApplicationContext("mapvalue.xml");
			map mapped1=appconn.getBean("mapped",map.class);
			Map<Integer,employee> ma =mapped1.getMap1();
			Set<Entry<Integer,employee>> m=ma.entrySet();
			for(Entry<Integer, employee> em:m)
			{
				System.out.print("key: "+em.getKey()+"\t");
				employee emp=em.getValue();
				System.out.print(emp);
				System.out.print("\n");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
