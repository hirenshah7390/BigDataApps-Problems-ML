package com.example.hhstm4.first.data;

import org.json.JSONObject;

/**
 * Created by hhstm4 on 2/1/2016.
 */
public class Channel implements JSONPopulator{
    Units units;
    private Item item;

    public Units getUnits()
    {
        return units;
    }

    public Item getItem(){
        return item;
    }

    @Override
    public void populate(JSONObject data){

        units = new Units();
        units.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));
    }
}
