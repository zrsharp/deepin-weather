package com.zero.deepinweather.pojo;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private long id;
    private String provinceName;    // 省名字
    private int provinceCode;       // 省代号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
