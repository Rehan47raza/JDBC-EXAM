package com;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

public class TrainManagementDAO {
	
public int addTrain(dbTransaction db,Train t)
{
	int i=0;
	try
	{
		db.getConnection();
		PreparedStatement pst= db.getConnection().prepareStatement("insert into "+db.getTableName() + " values(?,?,?,?,?)");
		
		pst.setInt(1, t.getTrain_id());
		pst.setString(2,t.getTrain_name());
		pst.setString(3, t.getStart_loc());
		pst.setString(4, t.getEnd_loc());
		pst.setString(5, t.getStatus());
		i=pst.executeUpdate();
		db.getConnection().commit();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}

	if(i==1)
		return i;
		else return 0;
}
public int addCustomer(dbTransaction db, Customer c)
{
	int i=0;
	try
	{
		db.getConnection();
		PreparedStatement pst= db.getConnection().prepareStatement("insert into "+db.getTableName1() + " values(?,?,?,?,?)");
		
		pst.setInt(1,c.getCust_id());
		pst.setString(2,c.getFirst_name() );
		pst.setString(3,c.getLast_name());
		pst.setString(4, c.getGender());
		pst.setLong(5, c.getContact());
		i=pst.executeUpdate();
		db.getConnection().commit();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	if(i==1)
	return i;
	else return 0;
}
public int addBooking(dbTransaction db,Booking bd)

{

	int i=0;
	try
	{
		db.getConnection();
		PreparedStatement pst= db.getConnection().prepareStatement("insert into "+db.getTableName2() + " values(?,?,?,?)");
		
		pst.setInt(1,bd.getCust_id());
		pst.setString(2,bd.getDate() );
		pst.setDouble(3, bd.getPrice());
		pst.setInt(4, bd.getTrain_no());
		
		
		i=pst.executeUpdate();
		db.getConnection().commit();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	if(i==1)
	return i;
	else return 0;
}
public BookingInformation getBookingInformation(dbTransaction db,int id)
{
	BookingInformation bi=new BookingInformation();
	try
	{
		db.getConnection();
		PreparedStatement pst= db.getConnection().prepareStatement("SELECT * FROM TBL_BOOKING_1204627");
		ResultSet rs= pst.executeQuery();
		while(rs.next())
		{
			
			String firstname=rs.getString("first_name");
			String lastname=rs.getString("last_name");
			int trainid=rs.getInt("Train_id");
			String trainname=rs.getString("Train_name");
			String startloc=rs.getString("start_loc");
			double price=rs.getDouble("price");
			
			bi.setFirst_name(firstname);
			bi.setLast_name(lastname);
			bi.setTrain_id(trainid);
			bi.setTrain_name(trainname);
			bi.setStart_loc(startloc);
			bi.setPrice(price);
     }
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return bi;
}
}
