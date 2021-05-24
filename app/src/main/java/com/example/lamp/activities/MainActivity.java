package com.example.lamp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.example.lamp.R;

public class MainActivity extends AppCompatActivity {

    private RadioButton buttonWhiteOn;
    private RadioButton buttonYellowOff;
    private RadioButton buttonBlueOff;
    private RadioButton buttonPurpleOff;
    private RadioButton buttonRedOff;
    private ImageView buttonOn;

    private int fonColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWhiteOn = findViewById(R.id.radio_button_white);
        buttonYellowOff = findViewById(R.id.radio_button_yellow);
        buttonBlueOff = findViewById(R.id.radio_button_blue);
        buttonPurpleOff = findViewById(R.id.radio_button_purple);
        buttonRedOff = findViewById(R.id.radio_button_red);
        buttonOn = findViewById(R.id.button_on);


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