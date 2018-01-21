package com.example.kesar.carsensetasktwo.Common;

import com.example.kesar.carsensetasktwo.Remote.IGoogleAPI;
import com.example.kesar.carsensetasktwo.Remote.RetrofitClient;

/**
 * Created by kesar on 1/7/2018.
 */

public class Common {

    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI() {

        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);

    }
}
