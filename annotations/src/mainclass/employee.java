package mainclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class employee {
private int id;
private String first_name1;
private String last_name;
private double salary;
private String department;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name1() {
	return first_name1;
}
public void setFirst_name1(String first_name1) {
	this.first_name1 = first_name1;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "employee [id=" + id + ", first_name1=" + first_name1 + ", last_name=" + last_name + ", salary=" + salary
			+ ", department=" + department + "]";
}

}
