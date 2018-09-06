package com.djy.vo;
import java.io.Serializable;
/**
 * 
 * manager  µÃÂ¿‡
 * Fri Aug 10 14:35:28 CST 2018
 * @author Òºº—”Í 
 * 
 */ 
public class Manager implements Serializable{
	private Long id;
	private String name;
	private String password;
	private int flag;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", password=" + password + ", flag=" + flag + "]";
	}
	public Manager(String name, String password, int flag) {
		super();
		this.name = name;
		this.password = password;
		this.flag = flag;
	}
	public Manager(Long id, String name, String password, int flag) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.flag = flag;
	}
	public Manager() {
		super();
	}


}

