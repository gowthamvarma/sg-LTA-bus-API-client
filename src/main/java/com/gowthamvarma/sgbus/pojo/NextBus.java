package com.gowthamvarma.sgbus.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class NextBus {

	public static final String LOAD_GREEN = "Seats Available";
    public static final String LOAD_ORANGE = "Standing Available";
    public static final String LOAD_RED = "Limited Standing";
    public static final String WHEEL_CHAIR_AVAILABLE = "WAB";

    public boolean isWheelChairAvailable(){
        return WHEEL_CHAIR_AVAILABLE.equalsIgnoreCase(feature);
    }

	@Override
	public String toString() {
		return "NextBus [estimatedArrival=" + estimatedArrival + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", visitNumber=" + visitNumber + ", load=" + load + ", feature=" + feature
				+ ", isWheelChairAvailable()=" + isWheelChairAvailable() + "]";
	}

	@SerializedName("EstimatedArrival")
	private Date estimatedArrival;
	
	@SerializedName("Latitude")
	private double latitude;
	
	@SerializedName("Longitude")
	private double longitude;
	
	@SerializedName("VisitNumber")
	private int visitNumber;
	
	@SerializedName("Load")
	private String load;

    @SerializedName("Feature")
    private String feature;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public int getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(int visitNumber) {
        this.visitNumber = visitNumber;
    }

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

    public Date getEstimatedArrival() {
        return estimatedArrival;
    }

    public void setEstimatedArrival(Date estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }

}
