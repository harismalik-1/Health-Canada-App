package com.example.healthcanadaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    ArrayList<Clinic> venlist;
    public venclickListener vlistenr;

    public void Myadapter(Context context, ArrayList<Clinic> venlist, venclickListener vlistener) {
        this.context = context;
        this.venlist = venlist;
        this.vlistenr = vlistener;
    }
    public interface venclickListener{
        void selectedvenue(Clinic v);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.clinics_card,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Clinic clinic = venlist.get(position);
        holder.clinicname.setText("h");
        holder.location.setText("h");
        holder.time.setText("h");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vlistenr.selectedvenue(clinic);
            }
        });

    }

    @Override
    public int getItemCount() {
        return venlist.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView clinicname, location, date, time, starttime;

        public MyViewHolder (@NonNull View itemView){
            super(itemView);
            clinicname = itemView.findViewById(R.id.clinicname);
            location = itemView.findViewById(R.id.locationf);
            time = itemView.findViewById(R.id.time);

        }
    }
}