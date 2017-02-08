package com;

public class Booking 
{
private int cust_id;
private int train_no;
private double price;
private String date;
public Booking(int cust_id, int train_no, double price, String date) {
	super();
	this.cust_id = cust_id;
	this.train_no = train_no;
	this.price = price;
	this.date = date;
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public int getTrain_no() {
	return train_no;
}
public void setTrain_no(int train_no) {
	this.train_no = train_no;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


}
