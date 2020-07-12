package Servicelayerimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import DAOexception.nomoneyinaccount;
import Service.service;
import dao_imp.DAO_impl;
import model.bank;
@Service
public class serviceimpl implements service {
@Autowired
 public  DAO_impl da;
 public DAO_impl getDa() {
	return da;
}
public void setDa(DAO_impl da) {
	this.da = da;
}
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED,readOnly=false,timeout=100,rollbackFor=Exception.class)
	public void transferfund(bank from_acc, bank to_acc, double amount) throws nomoneyinaccount {
		getDa().debit(from_acc, to_acc, amount);
		getDa().credit(from_acc, to_acc, amount);
		
	}

}
