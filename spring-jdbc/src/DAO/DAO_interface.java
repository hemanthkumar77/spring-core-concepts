package DAO;

import java.util.List;

import model.STUDENT;

public interface DAO_interface {
	public abstract void createstudentservice(STUDENT stu);
	public abstract void updatestudentservice(int id,double gpa);
	public abstract  void deletestudentservice(int id);
	public abstract STUDENT get_employee_byid_service(int id);
	public abstract List<STUDENT> students();
}
