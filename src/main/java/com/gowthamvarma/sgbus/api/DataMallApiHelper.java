package com.gowthamvarma.sgbus.api;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.gowthamvarma.sgbus.mapper.BusServiceMapper;
import com.gowthamvarma.sgbus.deserializer.BusStopDeserializer;
import com.gowthamvarma.sgbus.deserializer.NextBusDeserializer;
import com.gowthamvarma.sgbus.mapper.BusRoutesMapper;
import com.gowthamvarma.sgbus.mapper.BusServicesFrequencyMapper;
import com.gowthamvarma.sgbus.mapper.BusStopMapper;
import com.gowthamvarma.sgbus.pojo.BusRoutes;
import com.gowthamvarma.sgbus.pojo.BusServiceFrequency;
import com.gowthamvarma.sgbus.pojo.BusStop;
import com.gowthamvarma.sgbus.pojo.NextBus;

public class DataMallApiHelper {
	
	public static void main(String[] args) {
		
		//getAllBusStops();
		//getAllBusRoutes();
		//getAllBusServices();
		
		//System.out.println(getBusStops(0).toString());
		//System.out.println(getBusRoutes(0).toString());
		//System.out.println(getBusServices(0).toString());
		
		System.out.println(getBusArrival("1012",null,true).toString());
		
	}
	
	public static void getAllBusStops(){
		int i = 0;
		while(true){
			List<BusStop> busStopList = DataMallApiHelper.getBusStops(i++);
			if(busStopList == null || busStopList.size() == 0){
				break;
			}
		}
	}
	
	public static List<BusStop> getBusStops(int skip) {
		BusStopMapper busStopMapper = null;

        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(BusStop.class, new BusStopDeserializer());
        Gson gson = builder.create();

        try {
            busStopMapper = gson.fromJson(DataMallApi.getBusStops(skip).toString(), BusStopMapper.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		if(busStopMapper == null){
			return null;
		}
		
		if(busStopMapper.getBusStops() == null){
			return null;
		}
		
		System.out.println(skip);
		System.out.println(busStopMapper.getBusStops().size());
		if(busStopMapper.getBusStops().size() == 0){
			return null;
		}
		
		return busStopMapper.getBusStops();
	}
	
	public static BusServiceMapper getBusArrival(String busStopID, String serviceNo, boolean SST) {

		BusServiceMapper busArrivalMapper = null;

        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(NextBus.class, new NextBusDeserializer());
        Gson gson = builder.create();

		try {
			busArrivalMapper = gson.fromJson(DataMallApi.getBusArrival(busStopID, serviceNo, SST).toString(), BusServiceMapper.class);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		if(busArrivalMapper == null){
			return null;
		}
		
		if(busArrivalMapper.getBusServiceList() == null){
			return null;
		}
		
		System.out.println(busArrivalMapper.getBusServiceList().size());
		
		if(busArrivalMapper.getBusServiceList().size() == 0){
			return null;
		} else {
			System.out.println("DataMallApiHelper" + "  $$ "+busArrivalMapper.getBusServiceList().size());
		}
		
		return busArrivalMapper;
	}
	
	public static void getAllBusRoutes(){
		int i = 0;
		while(true){
			List<BusRoutes> busRoutesList = DataMallApiHelper.getBusRoutes(i++);
			if(busRoutesList == null || busRoutesList.size() == 0){
				break;
			}
		}
	}
	
	public static List<BusRoutes> getBusRoutes(int skip) {

		BusRoutesMapper busRoutesMapper = null;
		Gson gson = new Gson();
		try {
			busRoutesMapper = gson.fromJson(DataMallApi.getBusRoutes(skip).toString(), BusRoutesMapper.class);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		if(busRoutesMapper == null){
			return null;
		}
		
		if(busRoutesMapper.getBusRoutes() == null){
			return null;
		}
		
		System.out.println(skip);
		System.out.println(busRoutesMapper.getBusRoutes().size());
		if(busRoutesMapper.getBusRoutes().size() == 0){
			return null;
		}
		
		return busRoutesMapper.getBusRoutes();
	}
	
	public static void getAllBusServices(){
		int i = 0;
		while(true){
			List<BusServiceFrequency> busServicesList = DataMallApiHelper.getBusServices(i++);
			if(busServicesList == null || busServicesList.size() == 0){
				break;
			}
		}
	}
	
	public static List<BusServiceFrequency> getBusServices(int skip) {

		BusServicesFrequencyMapper busServicesMapper = null;
		Gson gson = new Gson();
		try {
			busServicesMapper = gson.fromJson(DataMallApi.getBusServices(skip).toString(), BusServicesFrequencyMapper.class);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		if(busServicesMapper == null){
			return null;
		}
		
		if(busServicesMapper.getBusServiceFrequency() == null){
			return null;
		}
		
		System.out.println(skip);
		System.out.println(busServicesMapper.getBusServiceFrequency().size());
		if(busServicesMapper.getBusServiceFrequency().size() == 0){
			return null;
		}
		
		return busServicesMapper.getBusServiceFrequency();
	}
	
}
