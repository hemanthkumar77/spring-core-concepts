package support;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import MODEL.employee;

@Service
public class service {
static Map<String,employee> map=null;
static
{ 
	map=new HashMap();
	map.put("ABC12345",new employee(102,"harely davidson","34567-califorina",23456.45));
	map.put("ABC3245",new employee(103,"patrick willison","34568-new-york",23456.45));
}
public employee getemployee(String custom_id) throws Exception
{
	if(custom_id==null)
	{
		throw new Exception("invalid input");
	}
	employee emp=null;
	{
	   Set<Entry<String,employee>>set=map.entrySet();
	   for(Entry<String,employee>enter:set)
	   {
		   String customer=enter.getKey();
		   if(customer.equals(custom_id))
		   {
			   emp=enter.getValue();
		   }
	   }
	}
	
	return null;
	
}
}
 