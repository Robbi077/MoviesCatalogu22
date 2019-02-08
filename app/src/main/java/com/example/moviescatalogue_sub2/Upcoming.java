package com.example.moviescatalogue_sub2;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.moviescatalogue_sub2.Adapter.MoviesAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Upcoming extends Fragment {
    private View view;
    private String[] dtName;
    private String[] dtDesc;
    private TypedArray dtPoster;
    //private AdapterMovie adapterMovie;
    private MoviesAdapter moviesAdapter;
    private ListView listView;
    private ArrayList<Movie> movies = new ArrayList<>();

    public Upcoming() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_upcoming, container, false);
        prepare();
        addItem();
        RecyclerView recyclerView = view.findViewById(R.id.Rc_Upcoming);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        //adapterMovie.setMovies(movies);
        moviesAdapter = new MoviesAdapter(getContext(), movies);
        recyclerView.setAdapter(moviesAdapter);
        return view;
    }

    private void prepare() {
        dtName = getResources().getStringArray(R.array.data_name);
        dtDesc = getResources().getStringArray(R.array.data_description);
        dtPoster = getResources().obtainTypedArray(R.array.data_poster);
    }

    private void addItem() {

        for (int i = 0; i < dtName.length; i++) {
            Movie movie = new Movie();
            movie.setcImage(dtPoster.getResourceId(i, -1));
            movie.setcName(dtName[i]);
            movie.setcDescription(dtDesc[i]);
            movies.add(movie);
        }

    }

}
