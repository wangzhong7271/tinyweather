package com.jzhong.tinyweather.gson;

/**
 * Created by wangzhong on 2017/9/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
