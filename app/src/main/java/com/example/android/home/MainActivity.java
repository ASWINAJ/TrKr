package com.example.android.home;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView listView;
    private ArrayList<Flats> flats = new ArrayList<>();
    private CustomListAdapter adapter;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (GridView)findViewById(R.id.list);
        back = (ImageView)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        flats.add(new Flats(R.drawable.d1,"3BHK HOUSE","3 Bathrooms","Banglore","20","1585","9.11","8",R.drawable.h1));
        flats.add(new Flats(R.drawable.d2,"3BHK HOUSE","3 Bathrooms","Banglore","20","1585","9.11","8",R.drawable.h2));


        adapter = new CustomListAdapter(this, flats);
        listView.setAdapter(adapter);


    }



}
