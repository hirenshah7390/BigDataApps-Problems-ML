package com.example.hhstm4.first.data;

import org.json.JSONObject;

/**
 * Created by hhstm4 on 2/1/2016.
 */
public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data){
       temperature = data.optString("temperature");
    }

}
