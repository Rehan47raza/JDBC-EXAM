package com;

public class Train {

	private int train_id;
	private String train_name;
	private String start_loc;
	private String end_loc;
	private String status;
	public Train(int train_id, String train_name, String start_loc,
			String end_loc, String status) {
		super();
		this.train_id = train_id;
		this.train_name = train_name;
		this.start_loc = start_loc;
		this.end_loc = end_loc;
		this.status = status;
	}
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getStart_loc() {
		return start_loc;
	}
	public void setStart_loc(String start_loc) {
		this.start_loc = start_loc;
	}
	public String getEnd_loc() {
		return end_loc;
	}
	public void setEnd_loc(String end_loc) {
		this.end_loc = end_loc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
