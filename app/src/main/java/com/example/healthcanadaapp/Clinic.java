package com.example.healthcanadaapp;

import java.util.List;

public class Clinic {
    String clinicname;
    String location;
    int capacity;
    String time;
    List<Appointment> appointments;
    String extrainfo1;
    String extrainfo2;
    String extrainfo3;

    public Clinic(){}

    public Clinic(String clinicname, String location, int capacity, String time, List<Appointment> appointments, String extrainfo1, String extrainfo2, String extrainfo3) {
        this.clinicname = clinicname;
        this.location = location;
        this.capacity = capacity;
        this.time = time;
        this.appointments = appointments;
        this.extrainfo1 = extrainfo1;
        this.extrainfo2 = extrainfo2;
        this.extrainfo3 = extrainfo3;
    }

    public String getClinicname() {
        return clinicname;
    }

    public void setClinicname(String clinicname) {
        this.clinicname = clinicname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public String getExtrainfo1() {
        return extrainfo1;
    }

    public void setExtrainfo1(String extrainfo1) {
        this.extrainfo1 = extrainfo1;
    }

    public String getExtrainfo2() {
        return extrainfo2;
    }

    public void setExtrainfo2(String extrainfo2) {
        this.extrainfo2 = extrainfo2;
    }

    public String getExtrainfo3() {
        return extrainfo3;
    }

    public void setExtrainfo3(String extrainfo3) {
        this.extrainfo3 = extrainfo3;
    }
}
