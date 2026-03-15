package com.pojo;

public class Room {

	int roonNo;
	String type;
	
	public Room() {
		
	}

	public Room(int roonNo, String type) {
		super();
		this.roonNo = roonNo;
		this.type = type;
	}

	public int getRoonNo() {
		return roonNo;
	}

	public void setRoonNo(int roonNo) {
		this.roonNo = roonNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Room [roonNo=" + roonNo + ", type=" + type + "]";
	}
	
	
	
	
}
