package com.santidev.devicedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textOrientation, textResolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOrientation = (TextView) findViewById(R.id.textOrientation);
        textResolution = (TextView) findViewById(R.id.textResolution);
    }

    public void detectDevice(View view){
        Display display = getWindowManager().getDefaultDisplay();
        textOrientation.setText("Orientacion: " + display.getRotation());

        //Surface.ROTATION_0 = 0
        //Surface.ROTATION_90 = 1
        //Surface.ROTATION_180 = 2
        //Surface.ROTATION_270 = 3

        Point xy = new Point();
        display.getSize(xy);
        textResolution.setText("x = " + xy.x + " y = " + xy.y);
    }
}