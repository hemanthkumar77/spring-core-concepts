package model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("emp")
public class employee {
private int id;
private String name;
private String department;
private double salary;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
}
@PostConstruct
private void first()
{
	System.out.println("DB-CONNECTIVITY-OPENED");
}
@PreDestroy
private void last()
{
	System.out.println("DB-CONNECTIVITY-closed");
}
}
