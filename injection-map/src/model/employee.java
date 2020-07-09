package model;

public class employee {
private int employee_id;
private String employee_name;
private String department;
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", department=" + department
			+ "]";
}

}
