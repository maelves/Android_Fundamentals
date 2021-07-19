package com.mnicoara.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static String BASE_URL = "https://api.themoviedb.org/";
    // TODO: Your TheMovieDB Key here:
    public static String API_KEY = "7dad0e17394349021f45c4ec2e7b004f";
    private static Retrofit RETROFIT;

    public static Retrofit getRetrofitInstance() {
        if (RETROFIT == null) {
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return RETROFIT;
    }

}
