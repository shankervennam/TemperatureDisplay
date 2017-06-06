package com.example.user.tempdisplay.TempDb.Retrofit;

import com.example.user.tempdisplay.TempDb.Model.TempDbCurrently;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterfaceTemp
{
    @GET("bf10b0f9631a80747ebfe6d51ca674c0/37.8267,-122.4233")
    Call<TempDbCurrently> getTopRatedMovies();
}
