package com.chanchal.sindhubhawanshaadi.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Attractions extends AppCompatActivity {

    private MediaPlayer sound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        final ArrayList<PlaceName> Place = new ArrayList<PlaceName>();

        Place.add(new PlaceName("Upper Lake" , "Popularly known as Bhojtal, Upper Lake is an eminent lake that is one of the must visit places in Bhopal." , R.drawable.upper_lake));
        Place.add(new PlaceName("Taj-Ul-Masjid" , "Literally meaning the ‘crown of mosques’, Taj-ul-Masajid is one of the most elegant mosques in India." , R.drawable.taj_masjid));
        Place.add(new PlaceName("Sanchi Stupa" , "One of the most unbeatable places to visit near Bhopal, the magnificence of the Sanchi Stupa remains unmatched till date" , R.drawable.sanchi_stupa));
        Place.add(new PlaceName("Lower Lake" , "Nestled amidst beautiful hills and the grand Upper Lake, the Lower Lake is a famous attraction among places to visit in M.P" , R.drawable.lower_lake));
        Place.add(new PlaceName("Bhimbetka Caves" , "A famous and most visited, archaeological site that has been famed as a UNESCO World Heritage Site as well." , R.drawable.bimbhetika_caves));
        Place.add(new PlaceName("State Tribal Museum" , "Dive deep into the history of the cultural city of Bhopal with a visit to the State Tribal Museum." , R.drawable.tribal_museum));
        Place.add(new PlaceName("Bhojpur Shiv Temple" , "Often called the Somnath of the East, Bhojpur Temple in Raisen district of Madhya Pradesh is named after King Bhoj. " , R.drawable.bhojpur_temple));
        Place.add(new PlaceName("Raisen Fort" , "One of the popular weekend getaways from Bhopal, Raisen Fort is known for its fascinating history among famous places to visit in Madhya Pradesh." , R.drawable.raisen_fort ));
        Place.add(new PlaceName("Central Museum" , "With its precious artifacts, Central Museum puts on view a superb picture of the state's rich culture and heritage." , R.drawable.central_museum));

        final ListView places = (ListView) findViewById(R.id.placesList);

        PlacesAdapter adapter = new PlacesAdapter(this , Place ,R.color.Attractions);

        places.setAdapter(adapter);


    }

}