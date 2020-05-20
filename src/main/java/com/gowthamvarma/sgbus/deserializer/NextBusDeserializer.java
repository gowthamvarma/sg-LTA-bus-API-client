package com.gowthamvarma.sgbus.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.gowthamvarma.sgbus.pojo.NextBus;
import com.gowthamvarma.sgbus.util.Util;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gowtham on 6/4/2016.
 */

public class NextBusDeserializer implements JsonDeserializer<NextBus> {

    //@Override
    public NextBus deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonObject jobject = (JsonObject) json;

        Date estimatedArrival;
        try {
            String strEstimatedArrival = jobject.get("EstimatedArrival").getAsString();
            if(Util.isNullOrEmptyString(strEstimatedArrival)){
                return null;
            }
            try {
                SimpleDateFormat readFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                strEstimatedArrival = strEstimatedArrival.replace("T", " ");
                strEstimatedArrival = strEstimatedArrival.replace("+08:00", "");
                estimatedArrival = readFormat.parse(strEstimatedArrival);
            } catch (ParseException e) {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }

        int visitNumber;
        try {
            visitNumber = jobject.get("VisitNumber").getAsInt();
        } catch (NumberFormatException e) {
            visitNumber = 0;
        }
        String load = jobject.get("Load").getAsString();
        String feature = jobject.get("Feature").getAsString();

        Double latitude;
        try {
            latitude = jobject.get("Latitude").getAsDouble();
        } catch (NumberFormatException e) {
            latitude = 0.00d;
        }
        Double longitude;
        try {
            longitude = jobject.get("Longitude").getAsDouble();
        } catch (NumberFormatException e) {
            longitude = 0.00d;
        }

        NextBus nextBus = new NextBus();
        nextBus.setEstimatedArrival(estimatedArrival);
        nextBus.setVisitNumber(visitNumber);
        nextBus.setLoad(load);
        nextBus.setFeature(feature);
        nextBus.setLatitude(latitude);
        nextBus.setLongitude(longitude);

        return nextBus;
    }
}
