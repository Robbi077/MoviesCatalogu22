package com.example.moviescatalogue_sub2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Movies extends AppCompatActivity {
    private ImageView imageView, imPoster;
    private TextView txtName, txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__movies);
        Movie movie = getIntent().getParcelableExtra("movie");
        imageView = findViewById(R.id.img_backdrop);
        imageView.setImageResource(movie.getcImage());
        txtName = findViewById(R.id.txt_name_detail);
        txtName.setText(movie.getcName());
        txtDesc = findViewById(R.id.txt_overview_detail);
        txtDesc.setText(movie.getcDescription());
    }
}
