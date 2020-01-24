package com.zero.deepinweather.pojo;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private long id;
    private String cityName;    // 市名字
    private int cityCode;       // 市代号
    private long provinceId;    // 省id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }
}
