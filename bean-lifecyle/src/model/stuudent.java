package model;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class stuudent {
private int id;
private String name;

private Date date_of_joining;
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

public Date getDate_of_joining() {
	return date_of_joining;
}
public void setDate_of_joining(Date date_of_joining) {
	this.date_of_joining = date_of_joining;
}
@Override
public String toString() {
	return "stuudent [id=" + id + ", name=" + name + ", date_of_joining=" + date_of_joining
			+ "]";
}
@PostConstruct
public void firstmethod()
{
	System.out.print("Db connectivity check ");
}
@PreDestroy
public void close()
{
	System.out.print("Db connectivity closed");
}
}
