package com;

public class Demo 
{
public static void main(String[] args)
	
	{
		
	String url="jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP";
    String tableName="tbl_train_1190848";
	String user="aja185core";
	String password="aja185core";
    String tableName1="tbl_customer_1190848";
    String tableName2="tbl_booking_1190848";
	
	dbTransaction db=new dbTransaction(url,user,password,tableName,tableName1,tableName2);
    TrainManagementDAO tm=new TrainManagementDAO();
	Train t=new Train(1204,"NIZAMUDDIN","DELHI","MUMBAI","ARRIVED");
	int details=tm.addTrain(db, t);
	System.out.println(details);
	
	Customer c=new Customer(1204627,"akshu","bansal","female",9897683762L);
	int details1=tm.addCustomer(db, c);
	System.out.println(details1);
	
	Booking bd=new Booking(1,1204,2000.0,"march15");
	int details2=tm.addBooking(db, bd);
	System.out.println(details2);
	
	}
}
