package com.example.hhstm4.first.service;

import com.example.hhstm4.first.data.Channel;

/**
 * Created by hhstm4 on 2/1/2016.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void seviceFailure(Exception exception);
}
