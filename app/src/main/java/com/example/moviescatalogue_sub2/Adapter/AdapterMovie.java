package com.example.moviescatalogue_sub2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moviescatalogue_sub2.Movie;
import com.example.moviescatalogue_sub2.R;

import java.util.ArrayList;

public class AdapterMovie extends BaseAdapter {
    private Context context;
    private ArrayList<Movie> movies;

    public AdapterMovie(Context context) {
        this.context = context;
        movies = new ArrayList<>();
    }

    public AdapterMovie(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        }
        Movie movie = (Movie) getItem(position);
        TextView txtName = convertView.findViewById(R.id.txt_Name);
        TextView txtDesc = convertView.findViewById(R.id.txt_Desc);
        ImageView imgPoster = convertView.findViewById(R.id.img_Poster);
        txtName.setText(movie.getcName());
        txtDesc.setText(movie.getcDescription());
        imgPoster.setImageResource(movie.getcImage());
        return convertView;
    }

}
