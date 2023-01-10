package com.example.musicplayer.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.musicplayer.R;
import com.example.musicplayer.service.MovieDataService;
import com.example.musicplayer.service.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//Repository Pattern Nedir?
//“Veri merkezli uygulamalarda veriye erişimin ve yönetimin tek noktaya indirilmesini sağlayan yapıya Repository Pattern denir.
// ” *Yani OOP mantığında da söylediğimiz gibi kod tekrarı olmadan, saf ve temiz bir şekilde veritabanı işlemlerinin tek bir noktadan
// kontrol edip, yönetilmesini Repository Pattern ile sağlıyoruz.
public class MovieRepository
{
    //MutableLiveData Nedir?Canlı veriler(MutableLiveData) veya Değişken Canlı Veriler, gözlemlenebilir bir veri tutucu sınıfıdır.
    // Uygulama bileşenleri, etkinlikler, parçalar ve hizmetler gibi Android Yaşam Döngülerinin farkında olduğundan
    // View Model içindeki verileri işlemeyi kolaylaştırdığı için bu sınıfa ihtiyacımız var. Veriler her zaman güncellenecek
    // ve Yaşam Döngülerinden haberdar olacaktır.
   private ArrayList<Movie> movies=new ArrayList<>();
   private MutableLiveData<List<Movie>> mutableLiveData=new MutableLiveData<>();
   private Application application;
    public MovieRepository( Application application)
    {
        this.application = application;
    }
    //Retrofit Instance Nedir?->Retrofit, Java ve Android için Square Inc. şirketi tarafından Apache 2.0 lisansı altında sunulmuş bir HTTP istemcisidir.
    public MutableLiveData<List<Movie>> getMutableLiveData()
    {
        MovieDataService movieDataService= RetrofitInstance.getService();
        Call<Result> call=movieDataService.getPopularMovies(application.getApplicationContext().getString(R.string.api_key));
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result=response.body();
                if (result!=null&&result.getResults()!=null)
                {
                    movies=(ArrayList<Movie>) result.getResults();
                    mutableLiveData.setValue(movies);
                }
            }
            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });
        return mutableLiveData;
    }
}
