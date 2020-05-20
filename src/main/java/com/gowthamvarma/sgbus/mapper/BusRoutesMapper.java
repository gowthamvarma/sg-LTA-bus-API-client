package com.gowthamvarma.sgbus.mapper;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.gowthamvarma.sgbus.pojo.BusRoutes;

public class BusRoutesMapper {
	
	@SerializedName("odata.metadata")
	private String header;
	
	@SerializedName("value")
	private List<BusRoutes> busRoutes;
	
	public String getHeader() {
		return header;
	}
	
	public void setHeader(String header) {
		this.header = header;
	}
	
	public List<BusRoutes> getBusRoutes() {
		return busRoutes;
	}
	
	public void setBusRoutes(List<BusRoutes> busRoutes) {
		this.busRoutes = busRoutes;
	}
	
}
