package tester;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.dao;
import Service.service;
import Servicelayerimpl.serviceimpl;
import dao_imp.DAO_impl;
import model.bank;

public class test {
public static void main(String args[])
{
	AbstractApplicationContext appconn=null;
	try
	{
		appconn=new ClassPathXmlApplicationContext("trans.xml");
		service ser=appconn.getBean(serviceimpl.class);
		bank ba=new bank();
		ba.setAcc_num("newyork-12345");
		bank ba1=new bank();
		ba1.setAcc_num("cali-45679");
		ser.transferfund(ba, ba1,1002.23);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		appconn.close();
	}
}
}
