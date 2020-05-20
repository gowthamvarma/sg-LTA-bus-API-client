package com.gowthamvarma.sgbus.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BusStop implements Serializable{
	
	@Override
	public String toString() {
		return "BusStop [busStopCode=" + busStopCode + ", roadName=" + roadName + ", description=" + description
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	private static final long serialVersionUID = -3069375969411885427L;

	@SerializedName("BusStopCode")
	private int busStopCode;

	@SerializedName("RoadName")
	private String roadName;

	@SerializedName("Description")
	private String description;

	@SerializedName("Latitude")
	private double latitude;

	@SerializedName("Longitude")
	private double longitude;

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public int getBusStopCode() {
		return busStopCode;
	}

	public void setBusStopCode(int busStopCode) {
		this.busStopCode = busStopCode;
	}
	
}
