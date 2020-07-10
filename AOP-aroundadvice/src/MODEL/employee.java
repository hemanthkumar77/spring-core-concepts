package MODEL;

public class employee {
private int emp_id;
private String name;
private String acc_num;
private double salary;
public employee(int emp_id, String name, String acc_num, double salary) {
	super();
	this.emp_id = emp_id;
	this.name = name;
	this.acc_num = acc_num;
	this.salary = salary;
}
public int getEmp_id() {
	return emp_id;
}
public String getName() {
	return name;
}
public String getAcc_num() {
	return acc_num;
}
public double getSalary() {
	return salary;
}

}
