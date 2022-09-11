package com.example.healthcanadaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        book = findViewById(R.id.book_appointment_but);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("ta", "onCrkkkeate: ");

                startActivity(new Intent(getApplicationContext(),Book_Appointment_Activity.class));
            }
        });
    }
}