package com.example.lamp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.lamp.R;

public class MainActivity extends AppCompatActivity {

    private RadioButton buttonWhiteOn;
    private RadioButton buttonYellowOff;
    private RadioButton buttonBlueOff;
    private RadioButton buttonPurpleOff;
    private RadioButton buttonRedOff;
    private RadioGroup radioGroup;
    private ImageButton buttonOn;

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
        radioGroup = findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_button_white:
                        fonColor = 0;
                        break;
                    case R.id.radio_button_yellow:
                        fonColor = 1;
                        break;
                    case R.id.radio_button_blue:
                        fonColor = 2;
                        break;
                    case R.id.radio_button_purple:
                        fonColor = 3;
                        break;
                    case R.id.radio_button_red:
                        fonColor = 4;
                        break;
                }
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