package client_details;

import org.springframework.beans.factory.annotation.Autowired;

import client_address.Address;

public class client {
private int id;
private String name;
private Address adress;
@Autowired
public client(int id, String name, Address adress) {
	super();
	this.id = id;
	this.name = name;
	this.adress = adress;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public Address getAdress() {
	return adress;
}

}
