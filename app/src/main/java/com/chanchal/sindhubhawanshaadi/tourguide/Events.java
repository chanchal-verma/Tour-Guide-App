package com.chanchal.sindhubhawanshaadi.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        ArrayList<PlaceName> Place = new ArrayList<PlaceName>();

        Place.add(new PlaceName("Educational Tour To Chanderi From Bhopal","The primary objective of the tour is to awaken intelligence in the educator and the student. This has to be kept in the forefront of all activities in the College/Schools academic "));
        Place.add(new PlaceName("Laal Kothi, Bhopal ","Royal heritage stay equipped with modern luxury, Best place for a private party,Accommodation in Luxury Rooms"));
        Place.add(new PlaceName("Madhuban Camp, Bhopal ","Jungle Camping Experience ,SpriteIndulge in rope and rock adventure activities ,SpriteThe package is valued up to INR 2000 ,SpriteInfinity pool with forest valley view"));
        Place.add(new PlaceName("Chidikho Trek, Bhopal","Exclusive Monsoon Trekking Experience, Explore Nature's Treasures, Guided Trekking Experience"));
        Place.add(new PlaceName("The Summer House, Bhopal","Royal heritage stay equipped with modern luxury, Best place for a private party,Accommodation in Luxury Rooms"));
        Place.add(new PlaceName("River side camping near Bhopal ","Jungle Camping Experience ,SpriteIndulge in rope and rock adventure activities ,SpriteThe package is valued up to INR 2000 ,SpriteInfinity pool with forest valley view"));
        Place.add(new PlaceName("Camping with jungle walk","Exclusive Monsoon Trekking Experience, Explore Nature's Treasures, Guided Trekking Experience"));
        Place.add(new PlaceName("Educational Tour from Bhopal","The primary objective of the tour is to awaken intelligence in the educator and the student. This has to be kept in the forefront of all activities in the College/Schools academic "));
        Place.add(new PlaceName("Adventure camping in nature's karavas","Royal heritage stay equipped with modern luxury, Best place for a private party,Accommodation in Luxury Rooms"));


        ListView places = (ListView) findViewById(R.id.placesList);

        PlacesAdapter adapter = new PlacesAdapter(this , Place ,R.color.Events);

        places.setAdapter(adapter);

    }
}