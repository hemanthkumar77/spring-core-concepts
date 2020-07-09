package model;

import java.util.Date;

public class student {
private int id;
private String name1;
private String department;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "student [id=" + id + ", name1=" + name1 + ", department=" + department + "]";
}
}
