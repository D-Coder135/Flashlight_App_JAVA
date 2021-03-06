package com.example.flashlight_app_java;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

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
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                try {
                    String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(cameraIdForFlashlight, true);
                } catch (CameraAccessException exception) {
                    System.out.println(exception);
                }
            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                try {
                    String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(cameraIdForFlashlight, false);
                } catch (CameraAccessException exception) {
                    System.out.println(exception);
                }
            }
        });
    }
}