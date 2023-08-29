package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetArrayList;
    Context context;

    public CustomAdapter(@NonNull ArrayList<Planet> planetArrayList, Context context) {
        super(context, R.layout.list_layout, planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

    public class MyViewHolder{
        TextView planetName, noOfMoons;
        ImageView planetImg;

        public View getView(int position, View convertView, ViewGroup Parent, ViewGroup parent){
            Planet planet = getItem(position);
            MyViewHolder myViewHolder;
            final View result;

            if(convertView == null) {
                myViewHolder = new MyViewHolder();
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(R.layout.list_layout, parent, false);

                myViewHolder.planetName = (TextView) convertView.findViewById(R.id.planetName);
                myViewHolder.noOfMoons = (TextView) convertView.findViewById(R.id.noOfMoons);
                myViewHolder.planetImg = (ImageView) convertView.findViewById(R.id.planetImg);

                result = convertView;

                convertView.setTag(myViewHolder);
            }else{
                myViewHolder = (MyViewHolder) convertView.getTag();
                result  = convertView;

                myViewHolder.planetName.setText(planet.getPlanetName());
                myViewHolder.noOfMoons.setText(planet.getNoOfMoons());
                myViewHolder.planetImg.setImageResource(planet.getPlanetImg());
            }
            return result;
        }
    }
}
