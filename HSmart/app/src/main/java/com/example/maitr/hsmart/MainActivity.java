package com.example.maitr.hsmart;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

public class MainActivity extends AppCompatActivity {


    /**
     * Creates the activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button favButton = findViewById(R.id.favButton);
        favButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View _view) {
                Intent i = new Intent(getApplicationContext(), FavoritesActivity.class);
                startActivity(i);
            }
        });

        Button cuisineButton = findViewById(R.id.cuisineButton);
        cuisineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View _view) {
                Intent i = new Intent(getApplicationContext(), CuisinesActivity.class);
                startActivity(i);
            }
        });


        // Button to get to dishButton
        Button dishButton = findViewById(R.id.dishButton);
        dishButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View _view) {
                    Intent i = new Intent(getApplicationContext(), mapArcGISActivity.class);
                    startActivity(i);
                }
        });

    }






}
