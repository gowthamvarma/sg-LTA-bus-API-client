package com.gowthamvarma.sgbus.api;

import com.gowthamvarma.sgbus.util.Constants;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DataMallApi {
	
	public static void main(String[] args) {
		//System.out.println(getBusStops(0).toString());
		//System.out.println(getBusArrival("1012",null,true).toString());
		//System.out.println(getBusRoutes(0).toString());
		//System.out.println(getBusServices(0).toString());
	}
	
	private static final String USER_AGENT = "Mozilla/5.0";
	private static final String ACCEPT = "application/json";

	private static final String URL_BUS_STOPS = "http://datamall2.mytransport.sg/ltaodataservice/BusStops";
	private static final String URL_BUS_ARRIVAL = "http://datamall2.mytransport.sg/ltaodataservice/BusArrivalv2";
	private static final String URL_BUS_ROUTES= "http://datamall2.mytransport.sg/ltaodataservice/BusRoutes";
	private static final String URL_BUS_SERVICES = "http://datamall2.mytransport.sg/ltaodataservice/BusServices";
	
	private static final int INT_BUS_SKIP = 50;
		
	public static StringBuffer getBusStops(int skip) {
		return makeGetCall(URL_BUS_STOPS + "?$skip=" + (skip * INT_BUS_SKIP));	
	}
	
	public static StringBuffer getBusArrival(String busStopID, String serviceNo, boolean SST) {
		String url = URL_BUS_ARRIVAL;
		if(busStopID != null){
			url += "?BusStopCode=" + busStopID;
		}
		if(serviceNo != null){
			url += "&ServiceNo=" + serviceNo;
		}
		if(SST){
			url += "&SST=True";
		}
		return makeGetCall(url);	
	}
	
	public static StringBuffer getBusRoutes(int i) {
		return makeGetCall(URL_BUS_ROUTES + "?$skip=" + (i * INT_BUS_SKIP));	
	}
	
	public static StringBuffer getBusServices(int i) {
		return makeGetCall(URL_BUS_SERVICES + "?$skip=" + (i * INT_BUS_SKIP));	
	}

	private static StringBuffer makeGetCall(String url) {
		StringBuffer response = null;
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			// add request header
			con.setRequestProperty("User-Agent", USER_AGENT);
			con.setRequestProperty("AccountKey", Constants.ACCOUNT_KEY);
			con.setRequestProperty("UniqueUserID", Constants.UNIIQUE_USER_ID);
			con.setRequestProperty("accept", ACCEPT);

			int responseCode = con.getResponseCode();

			System.out.println("Sending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			System.out.println("Response Message : " + con.getResponseMessage());

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("DataMallApi " + response.toString());
		return response;
	}
	
}
