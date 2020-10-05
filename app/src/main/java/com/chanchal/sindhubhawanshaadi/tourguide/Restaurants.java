package com.chanchal.sindhubhawanshaadi.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        ArrayList<PlaceName> Place = new ArrayList<PlaceName>();

        Place.add(new PlaceName("Greek Food & Beyond" , "Address : DB City Mall, M. P. Nagar, Hoshangabad Road, Arera Hills, Bhopal, Madhya Pradesh"+ "\n" +"Contact : +917556644108" , R.drawable.greek_food_and_beyond));
        Place.add(new PlaceName("La Kuchina" , "Address : Shymala Hills, Bhopal, Madhya Pradesh"+"\n"+"Contact : +91 7552661100." , R.drawable.la_kuchina));
        Place.add(new PlaceName("Rice ‘n’ Bowl" , "Address : Near Habibganj Station, No 6 Locality, Shivaji Nagar, Bhopal, Madhya Pradesh, 462016, India"+"\n"+"Contact : +917554273888" , R.drawable.rice_n_bowl));
        Place.add(new PlaceName("Za-aiqa" , "Address : VIP Road, Kohefiza, Bhopal, Madhya Pradesh, 462001, India"+"\n"+"Contact : +917554223333" , R.drawable.za_aiqa));
        Place.add(new PlaceName("Kebabsville" , "Address : Near Sair Sapata, Van Vihar Rd, Prempura, Bhopal, Madhya Pradesh"+"\n"+"Contact : +91 7552767777" , R.drawable.kebabsville));
        Place.add(new PlaceName("Bhopal Express" , "Address : Shymala Hills, Bhopal, Madhya Pradesh, 462013, India"+"\n"+"Contact : +917552660802" , R.drawable.bhopal_express));
        Place.add(new PlaceName("Manohar" , "Address : 6 Hamidia Road, Ghora Nakkas, Peer Gate Area, Bhopal, Madhya Pradesh, 462001, India"+"\n"+"Contact : +917554012000", R.drawable.manohar));
        Place.add(new PlaceName("Da Pizzeria" , "Address : Zone-II, Maharana Pratap Nagar, Bhopal, Madhya Pradesh"+"\n"+"Contact : +917554003330 " , R.drawable.da_pizzeria));
        Place.add(new PlaceName("Under The Mango Tree" , "Address : 157, Shymala Hills, Bhopal, Madhya Pradesh"+"\n"+"Contact : +917552661100", R.drawable.under_the_mango_tree));
        Place.add(new PlaceName("Sankalp" , "Address : DB City Mall, Zone-I, Maharana Pratap Nagar, Bhopal, Madhya Pradesh, 462011, India"+"\n"+"Contact : +917556644177" , R.drawable.sankalp));

        ListView places = (ListView) findViewById(R.id.placesList);

        PlacesAdapter adapter = new PlacesAdapter(this , Place ,R.color.Restaurants);

        places.setAdapter(adapter);
    }
}