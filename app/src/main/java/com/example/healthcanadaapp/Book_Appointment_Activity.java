package com.example.healthcanadaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Book_Appointment_Activity extends AppCompatActivity {

    RecyclerView clinic_view;
    ArrayList<Clinic> clinics;
    protected void onCreate(Bundle savedInstanceState, ViewGroup container) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointment2);
        clinics = create_clinics();




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