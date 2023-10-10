package com.acorn.registerPrj;

public class R_Member {
	
	String name;
	String id;
	String pw;
	String phone;
	String email;
	
	public R_Member() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public R_Member(String name, String id, String pw, String phone, String email) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "R_Member [name=" + name + ", id=" + id + ", pw=" + pw + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	

}
