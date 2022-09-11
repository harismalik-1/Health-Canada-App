package com.example.healthcanadaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClinicAdapter extends RecyclerView.Adapter<ClinicAdapter.ViewHolder>{
    private ArrayList<Clinic> clinics;
    public ClinicAdapter(ArrayList<Clinic> clinics) {
        this.clinics = clinics;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.clinics_card, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Clinic clinic = clinics.get(position);

        holder.name.setText(clinic.clinicname);
        holder.description.setText(clinic.location);

    }

    @Override
    public int getItemCount() {
        if (clinics != null) {
            return clinics.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView name;
        public final TextView description;


        public ViewHolder(View view) {
            super(view);
            this.view = view;
            name = view.findViewById(R.id.clinicname);
            description = view.findViewById(R.id.locationf);

        }
    }
}










