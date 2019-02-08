package com.example.moviescatalogue_sub2;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.moviescatalogue_sub2.Adapter.AdapterMovie;
import com.example.moviescatalogue_sub2.Adapter.TbAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TabLayout tbLayout;
    private ViewPager vwPager;
    private TbAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTabLayout();

    }

    private void setTabLayout() {
        tbLayout = findViewById(R.id.tab_Layout_ac);
        vwPager = findViewById(R.id.Vg_Activity);
        tbLayout.setTabTextColors(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent)));
        //Penambahan Tab
        mAdapter = new TbAdapter(getSupportFragmentManager());
        mAdapter.AddFragment(new NowPlaying(), getString(R.string.nowplaying));
        vwPager.setAdapter(mAdapter);
        tbLayout.setupWithViewPager(vwPager);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Language:
                Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(mIntent);
                break;
            case R.id.search_button:
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}
