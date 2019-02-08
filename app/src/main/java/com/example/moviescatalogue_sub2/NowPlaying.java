package com.example.moviescatalogue_sub2;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class NowPlaying extends Fragment {
    View view;

    public NowPlaying() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_now_playing, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.RcNow_Playing);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
wait
        return view;
    }

}
