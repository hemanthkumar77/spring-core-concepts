package Service;



import java.util.List;

import model.STUDENT;

public interface Service_interface {
public abstract void createstudent(STUDENT stu);
public abstract void updatestudent(int id,double gpa);
public abstract void deletestudent(int id);
public abstract STUDENT getemployee_by_id(int id);
public abstract List<STUDENT>stud();
}
