package com.zero.deepinweather.pojo;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private long id;
    private String countyName;  // 县名
    private String weatherId;   // 天气ID
    private long cityId;        // 市ID

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }
}
