package com.zero.deepinweather.model.resultJsonModel;

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
