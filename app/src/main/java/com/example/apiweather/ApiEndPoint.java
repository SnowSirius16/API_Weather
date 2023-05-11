package com.example.apiweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiEndPoint {
    @GET("latitude")
    Call<Weather> getWeather(String latitude) ;

    @GET("weather")
    Call<ApiService> getweather(
            @Query("lat") float latitude,
            @Query("lon") double longitude,
            @Query("tem") double temperature,
            @Query("win") double windspeed,
            @Query("wea") String weathercode
    );
}
