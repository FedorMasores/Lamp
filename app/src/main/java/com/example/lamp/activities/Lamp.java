package com.example.lamp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;

import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;

import com.example.lamp.R;
import com.example.lamp.dialog.MyDialog;


public class Lamp extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private ImageView imageViewButtonOff;
    private int fonColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamp);

        imageViewButtonOff = findViewById(R.id.imageViewButtonOff);
        constraintLayout = findViewById(R.id.fonView);

        Bundle bundle = getIntent().getExtras();
        fonColor = bundle.getInt("fonColor");

        switch (fonColor) {
            case 0:
                constraintLayout.setBackgroundResource(R.drawable.fon_white);
                break;
            case 1:
                constraintLayout.setBackgroundResource(R.drawable.fon_yellow);
                break;
            case 2:
                constraintLayout.setBackgroundResource(R.drawable.fon_blue);
                break;
            case 3:
                constraintLayout.setBackgroundResource(R.drawable.fon_purple);
                break;
            case 4:
                constraintLayout.setBackgroundResource(R.drawable.fon_red);
                break;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (Settings.System.canWrite(this)) {
                Settings.System.putInt(this.getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, 100);
            } else {
                FragmentManager manager = getSupportFragmentManager();
                MyDialog myDialogFragment = new MyDialog();
                myDialogFragment.show(manager, "myDialog");
            }
        }


        imageViewButtonOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}