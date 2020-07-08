package SERVICE;

import model.SPORTS;

public interface service_interface {
	 abstract void insert_service(SPORTS sp);
	 abstract void update_service(int id,double value);
	 abstract void delete_service(int id);
	 abstract void fetch_employee_by_id_service(int id);
	 abstract void fetch_employee_service();
}
