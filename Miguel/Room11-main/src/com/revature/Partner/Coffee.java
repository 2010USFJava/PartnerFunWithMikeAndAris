package com.revature.Partner;

public class Coffee {
	private String flavor;
	private int productId;
	private String size;
	private String experationDate;

	public Coffee() {
	
	}
	public Coffee(String flavor, int productId, String size, String experationDate) {
	
		this.flavor = flavor;
		this.productId = productId;
		this.size = size;
		this.experationDate = experationDate;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getExperationDate() {
		return experationDate;
	}
	public void setExperationDate(String experationDate) {
		this.experationDate = experationDate;
	}
	@Override
	public String toString() {
		return "Coffee [flavor=" + flavor + ", productId=" + productId + ", size=" + size + ", experationDate="
				+ experationDate + "]";
	}
	
	
	

}
