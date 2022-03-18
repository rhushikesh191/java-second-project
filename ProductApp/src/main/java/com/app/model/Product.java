package com.app.model;
//package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Product_table")
public class Product {

	@Id
	private int PRODID;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPRODID() {
		return PRODID;
	}
	public void setPRODID(int PRODID) {
		this.PRODID = PRODID;
	}
	private String pname;
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	private double price;
	private String DESCRIP;
	public String getDESCRIP() {
		return DESCRIP;
	}
	public void setDESCRIP(String dESCRIP) {
		DESCRIP = dESCRIP;
	}
	
}