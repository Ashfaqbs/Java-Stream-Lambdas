/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */



package com.ashfaq.dev.models;

import java.util.Objects;

public class User {

	private int id;
	
	private String fName; 

	private String lName;
	
	private String schoolName;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String fName, String lName, String schoolName) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.schoolName = schoolName;
	}

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        User user = (User) o;
	        return id == user.id;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }
	    
	    
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", schoolName=" + schoolName + "]";
	}
	
	
	
	
	
	
}
