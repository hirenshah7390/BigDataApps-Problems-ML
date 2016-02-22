package com.example.hhstm4.first.data;

import org.json.JSONObject;

/**
 * Created by hhstm4 on 2/1/2016.
 */
public class Item implements JSONPopulator {
    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data){
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));
    }
}
