package com.example.moviescatalogue_sub2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.moviescatalogue_sub2.Detail_Movies;
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
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, final int i) {
        myViewHolder.txtName.setText(listMovies.get(i).getcName());
        myViewHolder.txtDesc.setText(listMovies.get(i).getcDescription());
        myViewHolder.imageView.setImageResource(listMovies.get(i).getcImage());
        myViewHolder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("position", listMovies.get(i).getcName().toString());
                Toast.makeText(context, "Share " + listMovies.get(i).getcName(), Toast.LENGTH_LONG);
            }
        });
        myViewHolder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Detail_Movies.class);
                Movie m = listMovies.get(i);
                intent.putExtra("movie", m);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        Button btnDetail, btnShare;
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
