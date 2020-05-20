package com.gowthamvarma.sgbus.mapper;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.gowthamvarma.sgbus.pojo.BusStop;

public class BusStopMapper {
	
	@SerializedName("odata.metadata")
	private String header;
	@SerializedName("value")
	private List<BusStop> busStops;
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public List<BusStop> getBusStops() {
		return busStops;
	}
	public void setBusStops(List<BusStop> busStops) {
		this.busStops = busStops;
	}

}
