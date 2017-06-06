package com.example.user.tempdisplay.TempDb.Model;

public class TempDbDaily {
    private String summary;
    private TempDbDailyData[] data;
    private String icon;

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public TempDbDailyData[] getData() {
        return this.data;
    }

    public void setData(TempDbDailyData[] data) {
        this.data = data;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
