package com.example.test.retro;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SITH 5 on 20-Dec-17.
 */

public interface APIInterface {
    @GET("users/Akshay2017")
    Call<UserModel> getUserData();




}
