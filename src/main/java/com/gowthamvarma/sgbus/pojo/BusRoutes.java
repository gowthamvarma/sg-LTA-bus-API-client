package com.gowthamvarma.sgbus.pojo;

import com.google.gson.annotations.SerializedName;

public class BusRoutes {
	
	@Override
	public String toString() {
		return "BusRoutes [serviceNo=" + serviceNo + ", operator=" + operator + ", direction=" + direction
				+ ", stopSequence=" + stopSequence + ", busStopCode=" + busStopCode + ", distance=" + distance
				+ ", firstBus=" + firstBus + ", weekDayLastBus=" + weekDayLastBus + ", saturdayFirstBus="
				+ saturdayFirstBus + ", saturdayLastBus=" + saturdayLastBus + ", sundayFirstBus=" + sundayFirstBus
				+ ", sundayLastBus=" + sundayLastBus + "]";
	}

	@SerializedName("ServiceNo")
	private String serviceNo;
	
	@SerializedName("Operator")
	private String operator;
	
	@SerializedName("Direction")
	private String direction;
	
	@SerializedName("StopSequence")
	private String stopSequence;

	@SerializedName("BusStopCode")
	private String busStopCode;
	
	@SerializedName("Distance")
	private String distance;
	
	@SerializedName("WD_FirstBus")
	private String firstBus;
	
	@SerializedName("WD_LastBus")
	private String weekDayLastBus;
	
	@SerializedName("SAT_FirstBus")
	private String saturdayFirstBus;
	
	@SerializedName("SAT_LastBus")
	private String saturdayLastBus;
	
	@SerializedName("SUN_FirstBus")
	private String sundayFirstBus;
	
	@SerializedName("SUN_LastBus")
	private String sundayLastBus;

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getStopSequence() {
		return stopSequence;
	}

	public void setStopSequence(String stopSequence) {
		this.stopSequence = stopSequence;
	}

	public String getBusStopCode() {
		return busStopCode;
	}

	public void setBusStopCode(String busStopCode) {
		this.busStopCode = busStopCode;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getFirstBus() {
		return firstBus;
	}

	public void setFirstBus(String firstBus) {
		this.firstBus = firstBus;
	}

	public String getWeekDayLastBus() {
		return weekDayLastBus;
	}

	public void setWeekDayLastBus(String weekDayLastBus) {
		this.weekDayLastBus = weekDayLastBus;
	}

	public String getSaturdayFirstBus() {
		return saturdayFirstBus;
	}

	public void setSaturdayFirstBus(String saturdayFirstBus) {
		this.saturdayFirstBus = saturdayFirstBus;
	}

	public String getSaturdayLastBus() {
		return saturdayLastBus;
	}

	public void setSaturdayLastBus(String saturdayLastBus) {
		this.saturdayLastBus = saturdayLastBus;
	}

	public String getSundayFirstBus() {
		return sundayFirstBus;
	}

	public void setSundayFirstBus(String sundayFirstBus) {
		this.sundayFirstBus = sundayFirstBus;
	}

	public String getSundayLastBus() {
		return sundayLastBus;
	}

	public void setSundayLastBus(String sundayLastBus) {
		this.sundayLastBus = sundayLastBus;
	}
	
}
