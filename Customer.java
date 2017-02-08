package com;

public class Customer {
private int cust_id;
private String first_name;
private String last_name;
private String gender;
private long contact;
public Customer(int cust_id, String first_name, String last_name,
		String gender, long contact) {
	super();
	this.cust_id = cust_id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.gender = gender;
	this.contact = contact;
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}


}
