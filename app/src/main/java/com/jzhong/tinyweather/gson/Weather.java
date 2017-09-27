package com.jzhong.tinyweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wangzhong on 2017/9/27.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
