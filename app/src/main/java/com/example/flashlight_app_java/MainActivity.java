package com.example.flashlight_app_java;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button on, off;
    CameraManager cameraManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on = findViewById(R.id.button);
        off = findViewById(R.id.button2);
    }
}