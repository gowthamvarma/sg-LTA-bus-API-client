package com.gowthamvarma.sgbus.api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.gowthamvarma.sgbus.pojo.BusStop;

public class DataMallApiSerializer  {
	
	public static void main(String[] args) {
		System.out.println(getAllBusStops().size());
	}
	
	@SuppressWarnings("unchecked")
	public static List<BusStop> getAllBusStops() {
		
		List<BusStop> busStopList = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("busStops.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			busStopList = (List<BusStop>) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("class not found");
			c.printStackTrace();
		}
		
		if(busStopList != null  && busStopList.size() > 0){
			System.out.println("Deserialized the object");
			return busStopList;
		}
		
		busStopList = new ArrayList<BusStop>();
		
		int i = 0;
		while(true){
			
			List<BusStop> temp = DataMallApiHelper.getBusStops(i++);
			if(temp != null){
				busStopList.addAll(temp);
			}
			
			if(temp == null || temp.size() == 0){
				break;
			}
		}
		
		try {
			FileOutputStream fileOut = new FileOutputStream("busStops.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(busStopList);
			out.close();
			fileOut.close();
			System.out.printf("Serialized the object");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return busStopList;
	}

}
