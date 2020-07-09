package configurations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import mainclass.employee;

@Configuration
public class config {
@Bean
public employee emp()
{
	employee val=new employee();
	val.setId(123);
	val.setFirst_name1("patrick");
	val.setLast_name("willson");
	val.setDepartment(".net");
	val.setSalary(234566.23);
	return val;
}

}
