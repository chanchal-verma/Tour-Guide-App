package com.chanchal.sindhubhawanshaadi.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        for Attractions activity
        TextView Attractions = (TextView) findViewById(R.id.Attractions);
        Attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Attractions.class);
                startActivity(a);
            }
        });

//        for public place activity
        TextView PublicPlace = (TextView) findViewById(R.id.publicPlaces);
        PublicPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(MainActivity.this,PublicPlaces.class);
                startActivity(p);
            }
        });

//        for Events activity
        TextView Events = (TextView) findViewById(R.id.Events);
        Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,Events.class);
                startActivity(e);
            }
        });

//        for Restaurants activity
        TextView Restaurants = (TextView) findViewById(R.id.Restaurants);
        Restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity.this,Restaurants.class);
                startActivity(r);
            }
        });

    }
}