package com.jzhong.tinyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangzhong on 2017/9/27.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
