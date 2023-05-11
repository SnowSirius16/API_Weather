package com.example.apiweather;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.sql.Time;

public class Weather {

    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("temperature")
    private double temperature;
    @SerializedName("windspeed")
    private double windspeed;
    @SerializedName("weathercode")
    private String wCode;
    @SerializedName("time")
    private Time time;

    public Weather () {}

    public Weather (String latitude, String longitude, double temperature, double windspeed,
                    String wCode, Time time) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.wCode = wCode;
        this.time = time;

    }
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(double windspeed) {
        this.windspeed = windspeed;
    }

    public String getwCode() {
        return wCode;
    }

    public void setwCode(String wCode) {
        this.wCode = wCode;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @NonNull
    @Override
    public String toString() {
        return "Latitude : " + latitude + "Longitude : " + longitude ;
    }
}
