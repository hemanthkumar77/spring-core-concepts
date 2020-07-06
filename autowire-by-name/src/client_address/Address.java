package client_address;

public class Address {
private String streeth_address;
private String city;
private String state;
public String getStreeth_address() {
	return streeth_address;
}
public void setStreeth_address(String streeth_address) {
	this.streeth_address = streeth_address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [streeth_address=" + streeth_address + ", city=" + city + ", state=" + state + "]";
}

}
