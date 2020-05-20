package com.gowthamvarma.sgbus.pojo;

import com.google.gson.annotations.SerializedName;

public class BusServiceFrequency {
	
	@Override
	public String toString() {
		return "BusServiceFrequency [serviceNo=" + serviceNo + ", operator=" + operator + ", direction=" + direction
				+ ", category=" + category + ", originCode=" + originCode + ", destinationCode=" + destinationCode
				+ ", amPeakFreq=" + amPeakFreq + ", amOffpeakFreq=" + amOffpeakFreq + ", pmPeakFreq=" + pmPeakFreq
				+ ", pmOffpeak_Freq=" + pmOffpeak_Freq + ", loopDesc=" + loopDesc + "]";
	}

	@SerializedName("ServiceNo")
	private String serviceNo;
	
	@SerializedName("Operator")
	private String operator;
	
	@SerializedName("Direction")
	private String direction;
	
	@SerializedName("Category")
	private String category;
	
	@SerializedName("OriginCode")
	private String originCode;
	
	@SerializedName("DestinationCode")
	private String destinationCode;
	
	@SerializedName("AM_Peak_Freq")
	private String amPeakFreq;
	
	@SerializedName("AM_Offpeak_Freq")
	private String amOffpeakFreq;
	
	@SerializedName("PM_Peak_Freq")
	private String pmPeakFreq;
	
	@SerializedName("PM_Offpeak_Freq")
	private String pmOffpeak_Freq;
	
	@SerializedName("LoopDesc")
	private String loopDesc;

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getOriginCode() {
		return originCode;
	}

	public void setOriginCode(String originCode) {
		this.originCode = originCode;
	}

	public String getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public String getAmPeakFreq() {
		return amPeakFreq;
	}

	public void setAmPeakFreq(String amPeakFreq) {
		this.amPeakFreq = amPeakFreq;
	}

	public String getAmOffpeakFreq() {
		return amOffpeakFreq;
	}

	public void setAmOffpeakFreq(String amOffpeakFreq) {
		this.amOffpeakFreq = amOffpeakFreq;
	}

	public String getPmPeakFreq() {
		return pmPeakFreq;
	}

	public void setPmPeakFreq(String pmPeakFreq) {
		this.pmPeakFreq = pmPeakFreq;
	}

	public String getPmOffpeak_Freq() {
		return pmOffpeak_Freq;
	}

	public void setPmOffpeak_Freq(String pmOffpeak_Freq) {
		this.pmOffpeak_Freq = pmOffpeak_Freq;
	}

	public String getLoopDesc() {
		return loopDesc;
	}

	public void setLoopDesc(String loopDesc) {
		this.loopDesc = loopDesc;
	}
	

}
