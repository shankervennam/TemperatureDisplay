package com.example.user.tempdisplay.TempDb.Model;

public class TempDbCurrently {
    private String summary;
    private int precipProbability;
    private double visibility;
    private int precipIntensity;
    private String icon;
    private double cloudCover;
    private int windBearing;
    private double apparentTemperature;
    private double pressure;
    private double dewPoint;
    private double ozone;
    private int nearestStormBearing;
    private int nearestStormDistance;
    private double temperature;
    private double humidity;
    private int time;
    private double windSpeed;

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPrecipProbability() {
        return this.precipProbability;
    }

    public void setPrecipProbability(int precipProbability) {
        this.precipProbability = precipProbability;
    }

    public double getVisibility() {
        return this.visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public int getPrecipIntensity() {
        return this.precipIntensity;
    }

    public void setPrecipIntensity(int precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getCloudCover() {
        return this.cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public int getWindBearing() {
        return this.windBearing;
    }

    public void setWindBearing(int windBearing) {
        this.windBearing = windBearing;
    }

    public double getApparentTemperature() {
        return this.apparentTemperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public double getPressure() {
        return this.pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getDewPoint() {
        return this.dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getOzone() {
        return this.ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }

    public int getNearestStormBearing() {
        return this.nearestStormBearing;
    }

    public void setNearestStormBearing(int nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public int getNearestStormDistance() {
        return this.nearestStormDistance;
    }

    public void setNearestStormDistance(int nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return this.humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getWindSpeed() {
        return this.windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
