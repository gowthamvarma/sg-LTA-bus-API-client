package com.gowthamvarma.sgbus.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.gowthamvarma.sgbus.pojo.BusStop;

import java.lang.reflect.Type;

/**
 * Created by gowtham on 6/4/2016.
 */

public class BusStopDeserializer implements JsonDeserializer<BusStop> {

    //@Override
    public BusStop deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonObject jobject = (JsonObject) json;
        int busStopCode;
        try {
            busStopCode = jobject.get("BusStopCode").getAsInt();
        } catch (NumberFormatException e) {
            busStopCode = 0;
        }
        String roadName = jobject.get("RoadName").getAsString();
        String description = jobject.get("Description").getAsString();
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

        BusStop busStop = new BusStop();
        busStop.setDescription(description);
        busStop.setRoadName(roadName);
        busStop.setBusStopCode(busStopCode);
        busStop.setLatitude(latitude);
        busStop.setLongitude(longitude);

        return busStop;
    }
}
