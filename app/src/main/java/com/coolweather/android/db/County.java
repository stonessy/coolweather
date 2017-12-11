package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Admin on 2017/12/4.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    private int  getId(){
        return id;
    }
    private void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public String getWeatherId(){
        return  weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    private int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }

}
