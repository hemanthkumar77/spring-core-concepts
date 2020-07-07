package Service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.DAO_interface;
import Service.Service_interface;
import model.STUDENT;
@Service
public class service implements Service_interface {
	@Autowired
   private DAO_interface da;
	@Override
	public void createstudent(STUDENT stu) {
	  da.createstudentservice(stu);	
	}
	@Override
	public void updatestudent(int id, double gpa) {
      da.updatestudentservice(id, gpa);	
	}
	@Override
	public void deletestudent(int id) {
	 da.deletestudentservice(id);	
	}
	@Override
	public STUDENT getemployee_by_id(int id) {
		return da.get_employee_byid_service(id);
	}
	@Override
	public List<STUDENT> stud() {
		
		return da.students();
	}

}
