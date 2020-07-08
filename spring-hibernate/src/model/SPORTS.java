package model;

import javax.persistence.*;

@Entity
@Table(name="GAMES")
public class SPORTS {
@Id
private int sports_id;
@Column(columnDefinition="varchar(18)",unique=true)
private String sports_name;
private int number_of_players;
@Column(columnDefinition="varchar(19)")
private String season;
@Column(precision=4,scale=2)
private double cost;
public int getSports_id() {
	return sports_id;
}
public void setSports_id(int sports_id) {
	this.sports_id = sports_id;
}
public String getSports_name() {
	return sports_name;
}
public void setSports_name(String sports_name) {
	this.sports_name = sports_name;
}
public int getNumber_of_players() {
	return number_of_players;
}
public void setNumber_of_players(int number_of_players) {
	this.number_of_players = number_of_players;
}
public String getSeason() {
	return season;
}
public void setSeason(String season) {
	this.season = season;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}

}
