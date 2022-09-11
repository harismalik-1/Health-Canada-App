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

        Clinic B = new Clinic();

        B.setClinicname("Medcan Clinic");
        B.setCapacity(25);
        B.setLocation("150 York Street Suite 1500, M5H 3S5, Toronto");
        B.setTime("7:00-19:00");

        Clinic C = new Clinic();
        C.setClinicname("Protean Clinic");
        C.setCapacity(25);
        C.setLocation("150 King St W Suite 230, Toronto, ON M5H 3T9");
        C.setTime("9:00-17:00");

        ArrayList<Clinic> clinics = new ArrayList<>();
        clinics.add(A);
        clinics.add(B);
        clinics.add(C);

        return clinics;

    }

}



