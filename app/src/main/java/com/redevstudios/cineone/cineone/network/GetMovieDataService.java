package com.redevstudios.cineone.cineone.network;

import com.redevstudios.cineone.cineone.model.MoviePageResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Redouane on 2/18/2018.
 */

@SuppressWarnings("ALL")
public interface GetMovieDataService {
    @GET("movie/popular")
    Call<MoviePageResult> getPopularMovies(@Query("page") int page, @Query("api_key") String userkey);

    @GET("movie/top_rated")
    Call<MoviePageResult> getTopRatedMovies(@Query("page") int page, @Query("api_key") String userkey);
}
