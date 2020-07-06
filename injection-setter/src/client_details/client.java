package client_details;

import org.springframework.beans.factory.annotation.Autowired;

import client_address.Address;

public class client {
private int id;
private String name;
@Autowired
private Address adress;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAdress() {
	return adress;
}
public void setAdress(Address adress) {
	this.adress = adress;
}
@Override
public String toString() {
	return "client [id=" + id + ", name=" + name + ", adress=" + adress + "]";
}

}
