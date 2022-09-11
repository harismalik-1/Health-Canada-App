package com.example.healthcanadaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Book_Appointment_Activity extends AppCompatActivity {

    private RecyclerView clinic_view;
    ArrayList<Clinic> clinics;

    private RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ta", "onCreate: ");
        setContentView(R.layout.activity_book_appointment);

        clinics = create_clinics();


        this.clinic_view = (RecyclerView) findViewById(R.id.clinic_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        this.clinic_view.setLayoutManager(mLayoutManager);

        adapter = new ClinicAdapter(clinics);
        this.clinic_view.setAdapter(adapter);


    }

    public ArrayList<Clinic> create_clinics(){
        Clinic A = new Clinic();
        A.setClinicname("Canadian Travel Clinics - Downtown Toronto");
        A.setCapacity(25);
        A.setLocation("250 University Ave Suite 210, Toronto, ON M5H 3E5");
        A.setTime("8:30-14:30");

        ArrayList<Clinic> clinics = new ArrayList<>();
        clinics.add(A);

        return clinics;

    }

}



