package com.redevstudios.cineone.cineone.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Redouane on 2/18/2018.
 */

@SuppressWarnings("ALL")
public class RetrofitInstance {

    private static Retrofit retrofit;
    private static final String BASE_URL = "http://api.themoviedb.org/3/";

    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
