package com.example.lamp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.lamp.R;

public class MainActivity extends AppCompatActivity {

    private ImageView buttonWhiteOn;
    private ImageView buttonYellowOff;
    private ImageView buttonBlueOff;
    private ImageView buttonPurpleOff;
    private ImageView buttonRedOff;
    private ImageView buttonOn;

    private int fonColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWhiteOn = findViewById(R.id.button_white_on);
        buttonYellowOff = findViewById(R.id.button_yellow_off);
        buttonBlueOff = findViewById(R.id.button_blue_off);
        buttonPurpleOff = findViewById(R.id.button_purple_off);
        buttonRedOff = findViewById(R.id.button_red_off);
        buttonOn = findViewById(R.id.button_on);


        buttonWhiteOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fonColor = 1;
                buttonWhiteOn.setImageResource(R.drawable.button_white_on);
                buttonYellowOff.setImageResource(R.drawable.button_yellow_off);
                buttonBlueOff.setImageResource(R.drawable.button_blue_off);
                buttonPurpleOff.setImageResource(R.drawable.button_purple_off);
                buttonRedOff.setImageResource(R.drawable.button_red_off);
            }
        });

        buttonYellowOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fonColor = 2;
                buttonYellowOff.setImageResource(R.drawable.button_yellow_on);
                buttonWhiteOn.setImageResource(R.drawable.button_white_off);
                buttonBlueOff.setImageResource(R.drawable.button_blue_off);
                buttonPurpleOff.setImageResource(R.drawable.button_purple_off);
                buttonRedOff.setImageResource(R.drawable.button_red_off);
            }
        });

        buttonBlueOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fonColor = 3;
                buttonBlueOff.setImageResource(R.drawable.button_blue_on);
                buttonYellowOff.setImageResource(R.drawable.button_yellow_off);
                buttonPurpleOff.setImageResource(R.drawable.button_purple_off);
                buttonRedOff.setImageResource(R.drawable.button_red_off);
                buttonWhiteOn.setImageResource(R.drawable.button_white_off);
            }
        });

        buttonPurpleOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fonColor = 4;
                buttonPurpleOff.setImageResource(R.drawable.button_purple_on);
                buttonBlueOff.setImageResource(R.drawable.button_blue_off);
                buttonYellowOff.setImageResource(R.drawable.button_yellow_off);
                buttonRedOff.setImageResource(R.drawable.button_red_off);
                buttonWhiteOn.setImageResource(R.drawable.button_white_off);
            }
        });

        buttonRedOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fonColor = 5;
                buttonRedOff.setImageResource(R.drawable.button_red_on);
                buttonPurpleOff.setImageResource(R.drawable.button_purple_off);
                buttonBlueOff.setImageResource(R.drawable.button_blue_off);
                buttonYellowOff.setImageResource(R.drawable.button_yellow_off);
                buttonWhiteOn.setImageResource(R.drawable.button_white_off);
            }
        });

        buttonOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lamp.class);
                intent.putExtra("fonColor", fonColor);
                startActivity(intent);
            }
        });
    }
}