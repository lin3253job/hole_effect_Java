package com.vegen.open.holecardview;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.vegen.open.holecardview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        activityMainBinding = ActivityMainBinding.inflate(LayoutInflater.from(this));

        int backgroundColor = ContextCompat.getColor(this, android.R.color.white);
        int controlColor = ContextCompat.getColor(this, android.R.color.black);

        setContentView(activityMainBinding.getRoot());

        activityMainBinding.holeCardView.setPadding(0, 0, 0, 0);

        new Neumorphism(this)
                .setViews(activityMainBinding.holeCardView)
//                .clipChildren(activityMainBinding.holeCardView)
                .sharpEdges(true)
                .parentColor(backgroundColor)
                .controlColor(controlColor)
                .build();


    }
}
