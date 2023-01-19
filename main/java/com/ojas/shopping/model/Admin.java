package com.ojas.shopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Admin {
	@Id
	public int productId;
	public String productName;
	public int Qty;
	public double price;
	
	public Admin() {}
	public Admin(int productId, String productName, int qty, double price) {
		
		this.productId = productId;
		this.productName = productName;
		Qty = qty;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Admin [productId=" + productId + ", productName=" + productName + ", Qty=" + Qty + ", price=" + price
				+ "]";
	}
	

	
	
}
