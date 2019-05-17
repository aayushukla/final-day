package com.capgemini.restaurantAcceptOrder.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RestaurantAccept {

	private int _Id;
	private String dishName;
	private double price;
	private int quantity;
	private String paymentType;
	public RestaurantAccept(int _Id, String dishName, double price, int quantity, String paymentType) {
		super();
		this._Id = _Id;
		this.dishName = dishName;
		this.price = price;
		this.quantity = quantity;
		this.paymentType = paymentType;
	}
	public RestaurantAccept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_Id() {
		return _Id;
	}
	public void set_Id(int _Id) {
		this._Id = _Id;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	
}
