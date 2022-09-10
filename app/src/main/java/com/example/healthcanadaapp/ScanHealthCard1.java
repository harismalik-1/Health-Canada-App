package com.example.healthcanadaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ScanHealthCard1 extends AppCompatActivity {

    TextView title;
    Button scan;
    boolean b = false;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_health_card1);
//        bar = findViewById(R.id.progressBar);
//        bar.setVisibility(View.INVISIBLE);
        title =findViewById(R.id.Camerapage_title);
        title.setText("GovCanada");
//        if(b){
//            bar.setVisibility(View.VISIBLE);
//            startActivity(new Intent(this.getApplicationContext(),HomeScreen.class));
//        }
        scan = findViewById(R.id.scanCard);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);

            }
        });
    }
}