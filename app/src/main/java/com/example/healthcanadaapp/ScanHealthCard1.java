package com.example.healthcanadaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ScanHealthCard1 extends AppCompatActivity {

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_health_card1);

        title =findViewById(R.id.Camerapage_title);
        title.setText("GovCanada");
    }
}