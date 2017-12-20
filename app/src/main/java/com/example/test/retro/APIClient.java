package com.example.test.retro;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SITH 5 on 20-Dec-17.
 */

public class APIClient {

    public static final String BASE_URI="https://api.github.com/";
    private static Retrofit retrofit=null;

    public static Retrofit getClient(){

        if (retrofit==null){

            retrofit=new Retrofit.Builder().baseUrl(BASE_URI).addConverterFactory(GsonConverterFactory.create()).build();
        }
         return retrofit;
    }
}
