        package com.example.musicplayer.model;
        import android.os.Parcel;
        import android.os.Parcelable;
        import android.widget.ImageView;

        import androidx.databinding.BaseObservable;
        import androidx.databinding.Bindable;
        import androidx.databinding.BindingAdapter;
        import androidx.databinding.library.baseAdapters.BR;

        import com.bumptech.glide.Glide;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

        import java.util.Collections;
        import java.util.List;
        import javax.annotation.Generated;
        //observable Nedir?
        //Observable : Veriyi dışa aktaran yapıdır. Observer : Observable tarafından dışa aktarılan veriyi
        // dinleyen yapıdır. Observer ,Observable'ı dinleyerek Observable tarafından aktarılan veriyi alır.
        // Dinleme işlemi farklı threadlerde gerçekleştirebilir.
        @Generated("jsonschema2pojo")
       public class Movie extends BaseObservable implements Parcelable
        {


                @SerializedName("poster_path")
                @Expose
                private String posterPath;
                @SerializedName("adult")
                @Expose
                private Boolean adult;
                @SerializedName("overview")
                @Expose
                private String overview;
                @SerializedName("release_date")
                @Expose
                private String releaseDate;
                @SerializedName("genre_ids")
                @Expose
                private List<Integer> genreIds = null;
                @SerializedName("id")
                @Expose
                private Integer id;
                @SerializedName("original_title")
                @Expose
                private String originalTitle;
                @SerializedName("original_language")
                @Expose
                private String originalLanguage;
                @SerializedName("title")
                @Expose
                private String title;
                @SerializedName("backdrop_path")
                @Expose
                private String backdropPath;
                @SerializedName("popularity")
                @Expose
                private Double popularity;
                @SerializedName("vote_count")
                @Expose
                private Integer voteCount;
                @SerializedName("video")
                @Expose
                private Boolean video;
                @SerializedName("vote_average")
                @Expose
                private Double voteAverage;

                public final static Parcelable.Creator<Movie> CREATOR=new Creator<Movie>() {
                        @Override
                        public Movie createFromParcel(Parcel parcel) {
                                return new Movie(parcel);
                        }

                        @Override
                        public Movie[] newArray(int i) {
                                return (new Movie[i]);
                        }
                };
                @BindingAdapter({"posterPath"})
                public static void loadImage(ImageView imageView,String imageUrl)
                {
                String imagePath="https://image.tmdb.org/t/p/w500"+imageUrl;
                        Glide.with(imageView.getContext()).load(imagePath).into(imageView);
                }

                @Bindable
                public String getPosterPath() {
                        return posterPath;
                }

                public void setPosterPath(String posterPath) {
                        this.posterPath = posterPath;
                        notifyPropertyChanged(BR.posterPath);

                }
                @Bindable
                public Boolean getAdult() {
                        return adult;
                }

                public void setAdult(Boolean adult) {
                        this.adult = adult;
                        notifyPropertyChanged(BR.adult);
                }

                @Bindable
                public String getOverview() {
                        return overview;
                }

                public void setOverview(String overview) {
                        this.overview = overview;
                        notifyPropertyChanged(BR.overview);
                }
                @Bindable
                public String getReleaseDate() {
                        return releaseDate;
                }

                public void setReleaseDate(String releaseDate) {
                        this.releaseDate = releaseDate;
                        notifyPropertyChanged(BR.releaseDate);
                }
                @Bindable
                public List<Integer> getGenreIds() {
                        return genreIds;
                }

                public void setGenreIds(List<Integer> genreIds) {
                        this.genreIds = genreIds;
                        notifyPropertyChanged(BR.genreIds);
                }
                @Bindable
                public Integer getId() {
                        return id;
                }

                public void setId(Integer id) {
                        this.id = id;
                        notifyPropertyChanged(BR.id);
                }
                @Bindable
                public String getOriginalTitle() {
                        return originalTitle;
                }

                public void setOriginalTitle(String originalTitle) {
                        this.originalTitle = originalTitle;
                        notifyPropertyChanged(BR.originalTitle);
                }
                @Bindable
                public String getOriginalLanguage() {
                        return originalLanguage;
                }

                public void setOriginalLanguage(String originalLanguage) {
                        this.originalLanguage = originalLanguage;
                        notifyPropertyChanged(BR.originalLanguage);
                }
                @Bindable
                public String getTitle() {
                        return title;
                }

                public void setTitle(String title) {
                        this.title = title;
                        notifyPropertyChanged(BR.title);
                }

                @Bindable
                public String getBackdropPath() {
                        return backdropPath;
                }

                public void setBackdropPath(String backdropPath) {
                        this.backdropPath = backdropPath;
                        notifyPropertyChanged(BR.backdropPath);
                }
                @Bindable
                public Double getPopularity() {
                        return popularity;
                }

                public void setPopularity(Double popularity) {
                        this.popularity = popularity;
                        notifyPropertyChanged(BR.popularity);
                }

                @Bindable
                public Integer getVoteCount() {
                        return voteCount;
                }

                public void setVoteCount(Integer voteCount) {
                        this.voteCount = voteCount;
                        notifyPropertyChanged(BR.voteCount);
                }

                @Bindable
                public Boolean getVideo() {
                        return video;
                }

                public void setVideo(Boolean video) {
                        this.video = video;
                        notifyPropertyChanged(BR.video);
                }

                @Bindable
                public Double getVoteAverage() {
                        return voteAverage;
                }

                public void setVoteAverage(Double voteAverage) {
                        this.voteAverage = voteAverage;
                        notifyPropertyChanged(BR.voteAverage);
                }

                @Override
                public int describeContents() {
                        return 0;
                }

                @Override
                public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeValue(voteCount);
                        parcel.writeValue(id);
                        parcel.writeValue(video);
                        parcel.writeValue(voteAverage);
                        parcel.writeValue(title);
                        parcel.writeValue(popularity);
                        parcel.writeValue(posterPath);
                        parcel.writeValue(originalLanguage);
                        parcel.writeValue(originalTitle);
                        parcel.writeValue(backdropPath);
                        parcel.writeValue(adult);
                        parcel.writeValue(overview);
                        parcel.writeValue(releaseDate);

                }
                public Movie(Parcel in) {
                        this.voteCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
                        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
                        this.video = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
                        this.voteAverage = ((Double) in.readValue((Double.class.getClassLoader())));
                        this.title = ((String) in.readValue((String.class.getClassLoader())));
                        this.popularity = ((Double) in.readValue((Double.class.getClassLoader())));
                        this.posterPath = ((String) in.readValue((String.class.getClassLoader())));
                        this.originalLanguage = ((String) in.readValue((String.class.getClassLoader())));
                        this.originalTitle = ((String) in.readValue((String.class.getClassLoader())));
                        this.backdropPath = ((String) in.readValue((String.class.getClassLoader())));
                        this.adult = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
                        this.overview = ((String) in.readValue((String.class.getClassLoader())));
                        this.releaseDate = ((String) in.readValue((String.class.getClassLoader())));
                }
        }