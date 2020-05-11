package com.galleWalla.galleWalla.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class GrainCatalogue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String grainName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrainName() {
		return grainName;
	}
	public void setGrainName(String grainName) {
		this.grainName = grainName;
	}
	public GrainCatalogue(int id, String grainName) {
		super();
		this.id = id;
		this.grainName = grainName;
	}
	@Override
	public String toString() {
		return "GrailCatalogue [id=" + id + ", grainName=" + grainName + "]";
	}
	
	
}
