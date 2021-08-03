package com.example.rretrofit_01.data;

import com.example.rretrofit_01.model.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface PostInterface {
    @GET("marvel")
    Call<List<PostModel>> getPosts();
}
