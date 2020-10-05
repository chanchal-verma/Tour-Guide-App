package com.chanchal.sindhubhawanshaadi.tourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;



public class PlacesAdapter extends ArrayAdapter<PlaceName> {

    private int ImageId;

    public PlacesAdapter(Activity Context , ArrayList<PlaceName> Place ,int ImageId)
    {
        super(Context , 0 , Place );
        this.ImageId = ImageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent ) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item ,parent ,false );
        }
        PlaceName currentPlace = getItem(position);

        TextView PlaceName = (TextView) listItemView.findViewById(R.id.PlaceName);
        PlaceName.setText(currentPlace.getPlaceName());

        TextView PlaceDesc = (TextView) listItemView.findViewById(R.id.PlaceDesc);
        PlaceDesc.setText(currentPlace.getPlaceDesc());

        ImageView Image = (ImageView) listItemView.findViewById(R.id.Image);
        if(currentPlace.hasImage())
        {
            Image.setImageResource(currentPlace.getImageId());
            Image.setVisibility(View.VISIBLE);
        }
        else
        {
            Image.setVisibility(View.GONE);
        }

        View Content = (View) listItemView.findViewById(R.id.Content);
        int bgColor = ContextCompat.getColor(getContext(),ImageId);
        Content.setBackgroundColor(bgColor);

        return listItemView;
    }
}
