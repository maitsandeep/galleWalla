package com.galleWalla.galleWalla.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class GrainCatalogueDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int graincatalogueId;
	private String tradeType;
	public GrainCatalogueDetails(int id, int graincatalogueId, String tradeType) {
		super();
		this.id = id;
		this.graincatalogueId = graincatalogueId;
		this.tradeType = tradeType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGraincatalogueId() {
		return graincatalogueId;
	}
	public void setGraincatalogueId(int graincatalogueId) {
		this.graincatalogueId = graincatalogueId;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	@Override
	public String toString() {
		return "GrainCatalogueDetails [id=" + id + ", graincatalogueId=" + graincatalogueId + ", tradeType=" + tradeType
				+ "]";
	}
	

}
