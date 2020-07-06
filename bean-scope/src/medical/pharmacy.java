package medical;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("phar")
//@Scope("prototype")
@Scope("singleton")
public class pharmacy {
@Override
	public String toString() {
		return "pharmacy [medicine_id=" + medicine_id + ", medcine_name=" + medcine_name + ", date_of_purchase="
				+ date_of_purchase + ", vaccine_name=" + vaccine_name + "]";
	}
private int medicine_id;
private String medcine_name;
private Date date_of_purchase;
private String vaccine_name;
public int getMedicine_id() {
	return medicine_id;
}
public void setMedicine_id(int medicine_id) {
	this.medicine_id = medicine_id;
}
public String getMedcine_name() {
	return medcine_name;
}
public void setMedcine_name(String medcine_name) {
	this.medcine_name = medcine_name;
}
public Date getDate_of_purchase() {
	return date_of_purchase;
}
public void setDate_of_purchase(Date date_of_purchase) {
	this.date_of_purchase = date_of_purchase;
}
public String getVaccine_name() {
	return vaccine_name;
}
public void setVaccine_name(String vaccine_name) {
	this.vaccine_name = vaccine_name;
}

}
