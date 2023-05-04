package com.stark.inventory.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int pId;
	private String SPN;
	private String description;
	private int quantity;
		
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getSPN() {
		return SPN;
	}
	public void setSPN(String sPN) {
		SPN = sPN;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", SPN=" + SPN + ", description=" + description + ", quantity=" + quantity + "]";
	}
}
	
