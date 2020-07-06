package students;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

public class students {
private int id;
private String name;
private String collegename;
private String Department;
public int getId() {
	return id;
}
@Required
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getCollegename() {
	return collegename;
}
@Required
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
@Override
public String toString() {
	return "students [id=" + id + ", name=" + name + ", collegename=" + collegename + ", Department=" + Department
			+ "]";
}

}
