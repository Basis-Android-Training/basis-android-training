package com.example.databaseexample2;

public class Student {
	private long id;
	private String name;
	private String regNo;
	
	public Student(long id, String name, String regNo)
	{
		this(name, regNo);
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		return name;
	}

	public Student(String name, String regNo)
	{
		this.name = name;
		this.regNo = regNo;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	}
