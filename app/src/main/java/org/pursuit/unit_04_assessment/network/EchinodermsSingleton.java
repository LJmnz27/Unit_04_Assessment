package org.pursuit.unit_04_assessment.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EchinodermsSingleton {
    private static Retrofit newInstance;

    public static Retrofit getInstance() {
        if (newInstance != null) {
            return newInstance;
        }
        newInstance = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return newInstance;
    }

    public EchinodermsSingleton() {
    }
}
