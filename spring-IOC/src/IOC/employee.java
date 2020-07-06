package IOC;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("emp")
public class employee {
private int id;
private String name;
private Double salary;
private String department;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
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
	return "employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
}


}
