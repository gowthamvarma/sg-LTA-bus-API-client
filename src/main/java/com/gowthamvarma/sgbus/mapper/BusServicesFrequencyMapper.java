package com.gowthamvarma.sgbus.mapper;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.gowthamvarma.sgbus.pojo.BusServiceFrequency;

public class BusServicesFrequencyMapper {
	
	@SerializedName("odata.metadata")
	private String header;
	
	@SerializedName("value")
	private List<BusServiceFrequency> busServiceFrequency;

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public List<BusServiceFrequency> getBusServiceFrequency() {
		return busServiceFrequency;
	}

	public void setBusServiceFrequency(List<BusServiceFrequency> busServiceFrequency) {
		this.busServiceFrequency = busServiceFrequency;
	}
	
}
