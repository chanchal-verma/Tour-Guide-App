package com.chanchal.sindhubhawanshaadi.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PublicPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        ArrayList<PlaceName> Place = new ArrayList<PlaceName>();

        Place.add(new PlaceName("Aura Mall","Address : Opposite Green City, Gulmohar, E-8, Arera Colony, Bhopal, Madhya Pradesh" +"\n"+"Contact : +917278345896",R.drawable.aura_mall));
        Place.add(new PlaceName("C 21 Mall","Address : Hoshangabad Road, Misrod, Bhopal, Madhya Pradesh, India"+"\n"+"Contact : +919865328754",R.drawable.c21_mall));
        Place.add(new PlaceName("DB Mall","Address : Sanjay Nagar, Arera Hills, Opposite MP Nagar, Behind Board Office"+"\n"+"Contact : +917845895623",R.drawable.dbcity_mall));
        Place.add(new PlaceName("Minaal Mall","Address : Minal Residency, Bhopal - 462022 "+"\n"+"Contact : +919865784585",R.drawable.minaal_mall));
        Place.add(new PlaceName("Gammon Mall (Shrishti Cbd) ","Address : New Market, Main Road 1, Malviya Nagar, Bhopal - 462003, Near Samnawaya Bhawan (Map)"+"\n"+"Contact : +918945795689",R.drawable.gammon_mall));
        Place.add(new PlaceName("City Walk ","Address : Halalpura, Lalghati, Bhopal - 462030"+"\n"+"Contact : +918945895623",R.drawable.cityp_walk));
        Place.add(new PlaceName("Apoorti Shopping Mall ","Address : Nirmal Palace, Road, Nirmal Place, Soumya Vihar i, Awadhpuri, Bhopal - 462022 "+"\n"+"Contact : +916789562435",R.drawable.apoorti_shopping_mall));
        Place.add(new PlaceName("Aashima The Lake City Mall","Address : Nh 12, Hosangabad Road, Misrod, Bhopal - 462026, Near Paras Hermitage, Bawadi Kalana "+"\n"+"Contact : +918563749652",R.drawable.aashima));
        Place.add(new PlaceName("Htc Mall","Address : Arera Colony, Bhopal - 462016, 10 No Market"+"\n"+"Contact : +916689547825",R.drawable.htc_mall));

        ListView places = (ListView) findViewById(R.id.placesList);

        PlacesAdapter adapter = new PlacesAdapter(this , Place ,R.color.publicPlaces);

        places.setAdapter(adapter);
    }
}