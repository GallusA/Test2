package com.example.gallusawa.test2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gallusawa on 8/11/17.
 */

public class DetailsActivity extends AppCompatActivity {

    String carModel, carYear, carType;
    TextView textView, textView1, textView2, textView3;
    ArrayList<Car> z = new ArrayList<>();
    int animalId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailsActivity);


        Intent intent = getIntent();
        Car voiture = (Car) intent.getSerializableExtra("Animal");


        carModel = (TextView) findViewById(R.id.textView1);
        carType = (TextView) findViewById(R.id.textView2);
        carYear = (TextView) findViewById(R.id.textView3);
    }
}
