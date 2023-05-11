package com.example.apiweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    private Weather cuacaa;
    private TextView TVcuaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findViewById(R.id.latitude);
        TVcuaca = findViewById(R.id.latitude);
//        getDataApi();
        cuacaa = new Weather();
        cuacaa.getLatitude();

    }

//Tutorial ChatGPT
//    private void getDataApi () {
//
//        Call<ApiService> c = ApiService.endPoint.getweather(
//                -8,
//                112.625,
//                25,
//                1.8,
//                "95"
//        );
//        c.enqueue(new Callback<ApiService>() {
//            @Override
//            public void onResponse(Call<ApiService> call, Response<ApiService> response) {
//                ApiService w = response.body();
//            }
//
//            @Override
//            public void onFailure(Call<ApiService> call, Throwable t) {
//
//            }
//        });


//        Call<Weather> call = ApiService.endPoint.getWeather("1");
//        call.enqueue(new Callback<Weather>() {
//            @Override
//            public void onResponse(Call<Weather> call, Response<Weather> response) {
//                Weather cuaca = response.body();
//            }
//
//            @Override
//            public void onFailure(Call<Weather> call, Throwable t) {
//
//            }
//        });

//Tutorial bapak2 yutub :
//        ApiService.endPoint.getWeather("1")
//                .enqueue(new Callback<Weather>() {
//                    @Override
//                    public void onResponse(Call<Weather> call, Response<Weather> response) {
//                        if (response.isSuccessful()) {
//                            String result = response.body().getLatitude();
//                            Log.d(TAG, result.toString());
//                        }
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<Weather> call, Throwable t) {
//                        Log.d(TAG, t.toString());
//
//                    }
//                });
//
//    }

}