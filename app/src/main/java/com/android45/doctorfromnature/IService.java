package com.android45.doctorfromnature;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IService {

    @GET("getHerbal")
    Call<List<Herbal>> getHerbal();

}
