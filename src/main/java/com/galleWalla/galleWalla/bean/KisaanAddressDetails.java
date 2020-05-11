package com.galleWalla.galleWalla.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KisaanAddressDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String kisaan_F_Name;
	private String kisaan_M_Name;
	private String kisaan_L_Name;
	private String mobile_No;
	private String village_Name;
	private String Post_Office;
	private String tehshil;
	private String police_Station;
	private String land_Mark;
	private String district;
	private int State;
	private int Pin_Code;
	private String Geo_location;
	private String Lattidute;
	private String Longitude;
	private int User_id;
	
	
	public KisaanAddressDetails(){
		
	}
	
	public KisaanAddressDetails(int id, String kisaan_F_Name, String kisaan_M_Name, String kisaan_L_Name,
			String mobile_No, String village_Name, String post_Office, String tehshil, String police_Station,
			String land_Mark, String district, int state, int pin_Code, String geo_location, String lattidute,
			String longitude, int user_id) {
		super();
		this.id = id;
		this.kisaan_F_Name = kisaan_F_Name;
		this.kisaan_M_Name = kisaan_M_Name;
		this.kisaan_L_Name = kisaan_L_Name;
		this.mobile_No = mobile_No;
		this.village_Name = village_Name;
		Post_Office = post_Office;
		this.tehshil = tehshil;
		this.police_Station = police_Station;
		this.land_Mark = land_Mark;
		this.district = district;
		State = state;
		Pin_Code = pin_Code;
		Geo_location = geo_location;
		Lattidute = lattidute;
		Longitude = longitude;
		User_id = user_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKisaan_F_Name() {
		return kisaan_F_Name;
	}
	public void setKisaan_F_Name(String kisaan_F_Name) {
		this.kisaan_F_Name = kisaan_F_Name;
	}
	public String getKisaan_M_Name() {
		return kisaan_M_Name;
	}
	public void setKisaan_M_Name(String kisaan_M_Name) {
		this.kisaan_M_Name = kisaan_M_Name;
	}
	public String getKisaan_L_Name() {
		return kisaan_L_Name;
	}
	public void setKisaan_L_Name(String kisaan_L_Name) {
		this.kisaan_L_Name = kisaan_L_Name;
	}
	public String getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}
	public String getVillage_Name() {
		return village_Name;
	}
	public void setVillage_Name(String village_Name) {
		this.village_Name = village_Name;
	}
	public String getPost_Office() {
		return Post_Office;
	}
	public void setPost_Office(String post_Office) {
		Post_Office = post_Office;
	}
	public String getTehshil() {
		return tehshil;
	}
	public void setTehshil(String tehshil) {
		this.tehshil = tehshil;
	}
	public String getPolice_Station() {
		return police_Station;
	}
	public void setPolice_Station(String police_Station) {
		this.police_Station = police_Station;
	}
	public String getLand_Mark() {
		return land_Mark;
	}
	public void setLand_Mark(String land_Mark) {
		this.land_Mark = land_Mark;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public int getPin_Code() {
		return Pin_Code;
	}
	public void setPin_Code(int pin_Code) {
		Pin_Code = pin_Code;
	}
	public String getGeo_location() {
		return Geo_location;
	}
	public void setGeo_location(String geo_location) {
		Geo_location = geo_location;
	}
	public String getLattidute() {
		return Lattidute;
	}
	public void setLattidute(String lattidute) {
		Lattidute = lattidute;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	@Override
	public String toString() {
		return "KisaanAddressDetails [id=" + id + ", kisaan_F_Name=" + kisaan_F_Name + ", kisaan_M_Name="
				+ kisaan_M_Name + ", kisaan_L_Name=" + kisaan_L_Name + ", mobile_No=" + mobile_No + ", village_Name="
				+ village_Name + ", Post_Office=" + Post_Office + ", tehshil=" + tehshil + ", police_Station="
				+ police_Station + ", land_Mark=" + land_Mark + ", district=" + district + ", State=" + State
				+ ", Pin_Code=" + Pin_Code + ", Geo_location=" + Geo_location + ", Lattidute=" + Lattidute
				+ ", Longitude=" + Longitude + ", User_id=" + User_id + "]";
	}
	

}
