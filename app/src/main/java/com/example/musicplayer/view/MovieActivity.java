package com.example.musicplayer.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import com.example.musicplayer.R;
import com.example.musicplayer.databinding.ActivityMovieBinding;
import com.example.musicplayer.model.Movie;

public class MovieActivity extends AppCompatActivity {
        private Movie movie;
        private ActivityMovieBinding activityMovieBinding;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        activityMovieBinding= DataBindingUtil.setContentView(this,R.layout.activity_movie);
        Intent intent=getIntent();
        if (intent.hasExtra("movie"))
        {
         movie=getIntent().getParcelableExtra("movie");
         activityMovieBinding.setMovie(movie);
         getSupportActionBar().setTitle(movie.getTitle());
        }
        }
}
