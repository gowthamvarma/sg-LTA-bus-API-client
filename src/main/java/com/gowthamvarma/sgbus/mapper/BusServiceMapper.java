package com.gowthamvarma.sgbus.mapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.gowthamvarma.sgbus.pojo.BusService;
import com.gowthamvarma.sgbus.system.NetworkTime;
import com.gowthamvarma.sgbus.util.Util;

public class BusServiceMapper {

    @Override
	public String toString() {
		return "BusServiceMapper [header=" + header + ", busStopID=" + busStopID + ", busServiceList=" + busServiceList
				+ ", busServicesInOperation=" + busServicesInOperation + ", busServicesNotInOperation="
				+ busServicesNotInOperation + "]";
	}

	BusServiceMapper(){
        updateTime = NetworkTime.getCurrentTime();
    }

    private static Date updateTime;

    public static Date getUpdateTime() {
        return updateTime;
    }

    public int getBusServiceListSize() {
        return getBusServicesInOperationSize() + getBusServicesNotInOperationSize();
    }

    public int getBusServiceListSizeGroupNotInOperation() {
        if(getBusServicesNotInOperationSize() > 0){
            return getBusServicesInOperationSize() + 1;
        }
        return getBusServicesInOperationSize();
    }

    public int getBusServicesInOperationSize() {
        if(!Util.isNullOrEmptyList(busServicesInOperation)){
            return busServicesInOperation.size();
        }
        return 0;
    }

    public int getBusServicesNotInOperationSize() {
        if(!Util.isNullOrEmptyList(busServicesNotInOperation)){
            return busServicesNotInOperation.size();
        }
        return 0;
    }


	@SerializedName("odata.metadata")
	private String header;
	@SerializedName("BusStopID")
	private String busStopID;
	@SerializedName("Services")
	private List<BusService> busServiceList;

    private List<BusService> busServicesInOperation;
    private List<BusService> busServicesNotInOperation;
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getBusStopID() {
		return busStopID;
	}
	public void setBusStopID(String busStopID) {
		this.busStopID = busStopID;
	}
	public List<BusService> getBusServiceList() {
		return busServiceList;
	}
	public void setBusServiceList(List<BusService> busServiceList) {
		this.busServiceList = busServiceList;
        if(!Util.isNullOrEmptyList(busServiceList)){
            for (BusService busService:busServiceList) {
               if(busService.isInOperation()){
                    if(busServicesInOperation == null){
                        busServicesInOperation = new ArrayList<BusService>();
                    }
                    busServicesInOperation.add(busService);
               } else {
                   if(busServicesNotInOperation == null){
                       busServicesNotInOperation = new ArrayList<BusService>();
                   }
                   busServicesNotInOperation.add(busService);
               }
            }
        }
	}

    public List<BusService> getBusServicesInOperation() {
        return busServicesInOperation;
    }

    public void setBusServicesInOperation(List<BusService> busServicesInOperation) {
        this.busServicesInOperation = busServicesInOperation;
    }

    public List<BusService> getBusServicesNotInOperation() {
        return busServicesNotInOperation;
    }

    public void setBusServicesNotInOperation(List<BusService> busServicesNotInOperation) {
        this.busServicesNotInOperation = busServicesNotInOperation;
    }

}
