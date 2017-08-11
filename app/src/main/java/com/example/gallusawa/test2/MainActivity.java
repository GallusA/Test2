package com.example.gallusawa.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String FIRST_FRAGMENT_TAG = ;
    private static final String YELLOW_FRAGMENT_TAG = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Create an application which has two fragments.
Fragment 1: Create a UI to add a “car” object to a list of car objects. The UI should at at least 3 fields (Model, Type, Year).
Fragment 2: Should have a list view/recyclerView to show the list of car objects.

-Both of the fragments should be visible at all times
-Adding a fragment to the list would update the list and show the item in the fragment 2
-Cant use Eventbus*/

        private static final String FIRST_FRAGMENT_TAG = "FirstFragment";
        private static final String SECOND_FRAGMENT_TAG = "SecondFragment";

        TextView carModel, carType,carYear;
        ListView listView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            carModel = (TextView) findViewById(R.id.textView1);
            carType = (TextView) findViewById(R.id.textView2);
            carYear = (TextView) findViewById(R.id.textView3);


        }

    public void addFragments(View view) {

        switch (view.getId()) {

            case R.id.btnButton1:

                FirstFragment redFragment = new FirstFragment();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.btnButton1, FirstFragment, FIRST_FRAGMENT_TAG)
                        .addToBackStack(FIRST_FRAGMENT_TAG)
                        .commit();

                break;

            case R.id.btnButon2:
                SecondFragment yellowFragment = SecondFragment.newInstance("John", "Doe");
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.btnButon2, yellowFragment, YELLOW_FRAGMENT_TAG)
                        .addToBackStack(YELLOW_FRAGMENT_TAG)
                        .commit();
                break;
            
        }

    }






}