package com.djy.vo;

public class Student {
	
	private Long id;
	private String name;
	private String phone;
	private String adress;
	private Long stateid;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Long getStateid() {
		return stateid;
	}
	public void setStateid(Long stateid) {
		this.stateid = stateid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", adress=" + adress + ", stateid="
				+ stateid + "]";
	}
	public Student(Long id, String name, String phone, String adress, Long stateid) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.adress = adress;
		this.stateid = stateid;
	}
	public Student() {
		super();
	}
	public Student(String name, String phone, String adress, Long stateid) {
		super();
		this.name = name;
		this.phone = phone;
		this.adress = adress;
		this.stateid = stateid;
	}
	

	
	

}
