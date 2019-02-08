package com.example.moviescatalogue_sub2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moviescatalogue_sub2.Movie;
import com.example.moviescatalogue_sub2.R;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.myViewHolder> {
    private ArrayList<Movie> listMovies;
    private Context context;

    public MoviesAdapter(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.listMovies = movies;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, viewGroup, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {
        myViewHolder.txtName.setText(listMovies.get(i).getcName());
        myViewHolder.txtDesc.setText(listMovies.get(i).getcDescription());
        myViewHolder.imageView.setImageResource(listMovies.get(i).getcImage());
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtDesc;
        ImageView imageView;



        public myViewHolder(View itemView) {
            super(itemView);
            txtDesc = itemView.findViewById(R.id.txt_Desc);
            txtName = itemView.findViewById(R.id.txt_Name);
            imageView = itemView.findViewById(R.id.img_Poster);
        }
    }
}
