package com.example.myapplication;

import com.example.myapplication.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {

    @GET("list_movies.json?sort_by=date_added")
    Call<MovieResponse> getLastMovies();
}