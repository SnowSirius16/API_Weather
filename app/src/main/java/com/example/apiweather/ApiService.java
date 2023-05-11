package com.example.apiweather;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    private static String base_url = "https://api.open-meteo.com/v1/forecast?latitude=-7.98&longitude=112.63&daily=weathercode&current_weather=true&timezone=auto";
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

//Tutorial bapak2 yutub :
//    private static Retrofit retrofit;

//    public static ApiEndPoint endPoint () {
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(base_url)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        return retrofit.create(ApiEndPoint.class);
//
//    }


//Tutorial ChatGPT
//    static Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl(base_url)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();
//
//    static ApiEndPoint endPoint = retrofit.create(ApiEndPoint.class);



}
