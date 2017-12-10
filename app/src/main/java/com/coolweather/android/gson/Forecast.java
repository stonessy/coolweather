package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 2017/12/7.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    private class More {
        @SerializedName("txt_d")
        public String info;
    }

    private class Temperature {
        public String max;
        public String min;
    }
}
