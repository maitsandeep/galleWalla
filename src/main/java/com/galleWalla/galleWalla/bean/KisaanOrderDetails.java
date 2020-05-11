package com.galleWalla.galleWalla.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KisaanOrderDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private int typeOfGrain;
private String grainweight;
private Date orderDate;
private Date orderDoneDate;
private String OrderType; 
private int user_id;

public KisaanOrderDetails(){
	
}


public KisaanOrderDetails(int id, int typeOfGrain, String grainweight, Date orderDate, Date orderDoneDate,
		String orderType, int user_id) {
	super();
	this.id = id;
	this.typeOfGrain = typeOfGrain;
	this.grainweight = grainweight;
	this.orderDate = orderDate;
	this.orderDoneDate = orderDoneDate;
	OrderType = orderType;
	this.user_id = user_id;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTypeOfGrain() {
	return typeOfGrain;
}
public void setTypeOfGrain(int typeOfGrain) {
	this.typeOfGrain = typeOfGrain;
}
public String getGrainweight() {
	return grainweight;
}
public void setGrainweight(String grainweight) {
	this.grainweight = grainweight;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public Date getOrderDoneDate() {
	return orderDoneDate;
}
public void setOrderDoneDate(Date orderDoneDate) {
	this.orderDoneDate = orderDoneDate;
}
public String getOrderType() {
	return OrderType;
}
public void setOrderType(String orderType) {
	OrderType = orderType;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
@Override
public String toString() {
	return "KisaanOrderDetails [id=" + id + ", typeOfGrain=" + typeOfGrain + ", grainweight=" + grainweight
			+ ", orderDate=" + orderDate + ", orderDoneDate=" + orderDoneDate + ", OrderType=" + OrderType
			+ ", user_id=" + user_id + "]";
}




}
