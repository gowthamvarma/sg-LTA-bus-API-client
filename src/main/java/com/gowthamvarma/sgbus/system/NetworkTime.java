package com.gowthamvarma.sgbus.system;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by gowtham on 6/9/2016.
 */
public class NetworkTime {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(getSystemTime());
        cal.add(Calendar.SECOND, Math.round(200));

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            getOffsetSeconds(cal.getTime());
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);

        long temp = getOffsetSeconds(cal.getTime());
        System.out.println("-----------------");
        System.out.println(temp / 60);
        System.out.println(temp % 60);
    }

    private static long networkTime;
    private static long offsetMilli;

    public static long getOffsetSeconds(Date date) {
        if(calculateOffset() > 3600){
            updateNetworkTime();
        }
        return Math.round( (date.getTime() - getSystemTime().getTime())/1000);
    }

    public static long getOffsetMilliSeconds(Date date) {
        if(calculateOffset() > 3600){
            updateNetworkTime();
        }
        return Math.round( (date.getTime() - getSystemTime().getTime()));
    }

    public static Date getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getSystemTime());
        cal.add(Calendar.SECOND, Math.round(offsetMilli/1000));
        return cal.getTime();
    }

    private static void updateNetworkTime() {
        String TIME_SERVER = "time-a.nist.gov";
        NTPUDPClient timeClient = new NTPUDPClient();
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName(TIME_SERVER);
            TimeInfo timeInfo = timeClient.getTime(inetAddress);
            networkTime = timeInfo.getMessage().getTransmitTimeStamp().getTime();
            //System.out.println(networkTime);
            //System.out.println(System.currentTimeMillis());
            offsetMilli = calculateOffset();
            //System.out.println(offsetSeconds);
        } catch (UnknownHostException e) {
            offsetMilli = 0;
            e.printStackTrace();
        } catch (IOException ex) {
            offsetMilli = 0;
            ex.printStackTrace();
        }
    }

    private static long calculateOffset() {
        return networkTime - System.currentTimeMillis();
    }

    private static Date getSystemTime() {
        return Calendar.getInstance().getTime();
    }
}