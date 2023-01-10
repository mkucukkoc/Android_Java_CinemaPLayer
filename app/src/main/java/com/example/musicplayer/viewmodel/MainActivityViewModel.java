package com.example.musicplayer.viewmodel;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.example.musicplayer.model.*;
import com.example.musicplayer.model.MovieRepository;
import java.util.List;
public class MainActivityViewModel extends AndroidViewModel {
    private MovieRepository movieRepository;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        movieRepository=new MovieRepository(application);
    }
    public MutableLiveData<List<Movie>> getAllMovies(){
        return movieRepository.getMutableLiveData();
    }
}
