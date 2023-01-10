package com.example.musicplayer.service;
import com.example.musicplayer.model.Result;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface MovieDataService
{
    //https://api.themoviedb.org/3/movie/popular?api_key=65061cfc1dd1c719788c2e650115789c


    @GET("movie/popular")
    Call<Result>getPopularMovies(@Query("api_key") String apiKey);
    //Yukarıda Tanımladığımız bu servis ile,HTTP istek metodu olarak: GETİstek yapılacak adres olarak: posts
    // @Query tanımlaması ile ‘userId’ adında bir parametrem var ve ben bu parametreyi String türünde dışarıdan atayacağım demiş oluyoruz.

}
