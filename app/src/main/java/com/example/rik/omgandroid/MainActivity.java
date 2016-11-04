/**
 * Mr. Potatohead
 *
 * App studio
 * Rik van Toorn, 11279184
 *
 *This app lets you put on different things on a potato so in the end you get a Mr. potato head.
 *
 */


package com.example.rik.omgandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // initialize all variables which holds the views
    ImageView hat;
    ImageView eyebrows;
    ImageView eyes;
    ImageView ears;
    ImageView glasses;
    ImageView arms;
    ImageView shoes;
    ImageView nose;
    ImageView mouth;
    ImageView mustache;
    CheckBox check_hat;
    CheckBox check_eyebrows;
    CheckBox check_eyes;
    CheckBox check_ears;
    CheckBox check_glasses;
    CheckBox check_arms;
    CheckBox check_shoes;
    CheckBox check_nose;
    CheckBox check_mouth;
    CheckBox check_mustache;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // put the right elements in the views
        hat = (ImageView) findViewById(R.id.hat);
        check_hat = (CheckBox) findViewById(R.id.check_hat);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        check_eyebrows = (CheckBox) findViewById(R.id.check_eyebrows);
        eyes = (ImageView) findViewById(R.id.eyes);
        check_eyes = (CheckBox) findViewById(R.id.check_eyes);
        ears = (ImageView) findViewById(R.id.ears);
        check_ears = (CheckBox) findViewById(R.id.check_ears);
        glasses = (ImageView) findViewById(R.id.glasses);
        check_glasses = (CheckBox) findViewById(R.id.check_glasses);
        arms = (ImageView) findViewById(R.id.arms);
        check_arms = (CheckBox) findViewById(R.id.check_arms);
        shoes = (ImageView) findViewById(R.id.shoes);
        check_shoes = (CheckBox) findViewById(R.id.check_shoes);
        nose = (ImageView) findViewById(R.id.nose);
        check_nose = (CheckBox) findViewById(R.id.check_nose);
        mouth = (ImageView) findViewById(R.id.mouth);
        check_mouth = (CheckBox) findViewById(R.id.check_mouth);
        mustache = (ImageView) findViewById(R.id.mustache);
        check_mustache = (CheckBox) findViewById(R.id.check_mustache);


        // when a checkbox is clicked. change the vibility (for every part)
        // Could't get it into a function so every part has its own.
        check_hat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_eyebrows.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_eyes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_ears.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_arms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_glasses.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_shoes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_nose.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_mouth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        check_mustache.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

}
