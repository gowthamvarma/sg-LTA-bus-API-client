package com.gowthamvarma.sgbus.util;

import java.util.List;

/**
 * Created by gowtham on 5/28/2016.
 */
public class Util {

    public static double roundToTwo(double input){
        return (double) Math.round(input * 100d) / 100d;
    }

    public static boolean isNullOrEmptyString(String input){
        return ( input == null ) || (input.length() == 0);
    }

    public static boolean isNullOrEmptyList(List input){
        return ( input == null ) || (input.size() == 0);
    }

}
