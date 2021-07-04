package com.example.flashlight_app_java;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button on, off;
    CameraManager cameraManager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on = findViewById(R.id.button);
        off = findViewById(R.id.button2);
        cameraManager = (CameraManager)getSystemService(CAMERA_SERVICE);

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                } catch (CameraAccessException exception) {
                }
            }
        });
    }
}