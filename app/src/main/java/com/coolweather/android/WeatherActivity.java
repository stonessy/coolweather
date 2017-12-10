package com.coolweather.android;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.coolweather.android.gson.Weather;
import com.coolweather.android.util.Utility;

public class WeatherActivity extends AppCompatActivity {
    private ScrollView weatherLayout;
    private TextView titleCity;
    private TextView titleUpdateTime;
    private TextView degreeText;
    private TextView weathetInfoText;
    private LinearLayout forecastLayout;
    private TextView aqiText;
    private TextView pm25Text;
    private TextView comforeText;
    private TextView carWashText;
    private TextView sportText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        weatherLayout = (ScrollView) findViewById(R.id.weather_layout);
        titleCity = (TextView) findViewById(R.id.title_city);
        titleUpdateTime = (TextView) findViewById(R.id.title_update_time);
        degreeText = (TextView) findViewById(R.id.degree_text);
        weathetInfoText = (TextView) findViewById(R.id.weather_info_text);
        forecastLayout = (LinearLayout) findViewById(R.id.forecast_layout);
        aqiText = (TextView) findViewById(R.id.aqi_text);
        pm25Text = (TextView) findViewById(R.id.pm25_text);
        comforeText = (TextView) findViewById(R.id.comfort_text);
        carWashText = (TextView) findViewById(R.id.car_wash_text);
        sportText = (TextView) findViewById(R.id.sport_text);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String weatherString = prefs.getString("weather", null);
        if (weatherString != null){
            Weather weather = Utility.handleWeatherReponse(weatherString);
            showWesatherInfo(weather);
        }else {
            String weatherId = getIntent().getStringExtra("weather_id");
            weatherLayout.setVisibility(View.VISIBLE);
            requestWeather(weatherId);

        }

    }

    private void requestWeather(final String weatherId) {
        String weatherUrl = "http://guo"
    }

    private void showWesatherInfo(Weather weather) {
        String
    }
}
