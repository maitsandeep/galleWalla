package com.galleWalla.galleWalla.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kisaan {
 
  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String  kisaan_MobileNO;
  private int User_Id;
  public Kisaan(){
	  
  }
  
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getKisaan_MobileNO() {
	return kisaan_MobileNO;
}
public void setKisaan_MobileNO(String kisaan_MobileNO) {
	this.kisaan_MobileNO = kisaan_MobileNO;
}
public Kisaan(Integer id, String kisaan_MobileNO) {
	super();
	this.id = id;
	this.kisaan_MobileNO = kisaan_MobileNO;
}

public int getUser_Id() {
	return User_Id;
}

public Kisaan(Integer id, String kisaan_MobileNO, int user_Id) {
	super();
	this.id = id;
	this.kisaan_MobileNO = kisaan_MobileNO;
	User_Id = user_Id;
}

public void setUser_Id(int user_Id) {
	User_Id = user_Id;
}

@Override
public String toString() {
	return "Kisaan [id=" + id + ", kisaan_MobileNO=" + kisaan_MobileNO + ", User_Id=" + User_Id + "]";
}


  
  
	

}
