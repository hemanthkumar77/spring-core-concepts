package DAO;

import model.SPORTS;

public interface DAO_interfcae {
 abstract void insert(SPORTS sp);
abstract void update(int id,double value);
abstract void delete(int id);
abstract void fetch_employee_by_id(int id);
abstract void fetch_employee();
}
