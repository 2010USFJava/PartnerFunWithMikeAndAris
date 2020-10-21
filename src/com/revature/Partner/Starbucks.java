package com.revature.Partner;

public class Starbucks {
	private String address;
	private String manager;
	private Coffee product;
	
	public Starbucks() {
	
	}
	public Starbucks(String address, String manager, Coffee product) {
	
		this.address = address;
		this.manager = manager;
		this.product = product;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Coffee getProduct() {
		return product;
	}
	public void setProduct(Coffee product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Starbucks [address=" + address + ", manager=" + manager + ", product=" + product + "]";
	}
	
	

}
