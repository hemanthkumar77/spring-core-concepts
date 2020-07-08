package SERVICE_IMPL;

import DAO.DAO_interfcae;
import SERVICE.service_interface;
import model.SPORTS;

public class service_impl implements service_interface{
private DAO_interfcae dao;

public DAO_interfcae getDao() {
	return dao;
}

public void setDao(DAO_interfcae dao) {
	this.dao = dao;
}

@Override
public void insert_service(SPORTS sp) {
	dao.insert(sp);
}

@Override
public void update_service(int id, double value) {
	dao.update(id, value);
}

@Override
public void delete_service(int id) {
	dao.delete(id);
	
}

@Override
public void fetch_employee_by_id_service(int id) {
	dao.fetch_employee_by_id(id);
}

@Override
public void fetch_employee_service() {
	dao.fetch_employee();
	
}

}
