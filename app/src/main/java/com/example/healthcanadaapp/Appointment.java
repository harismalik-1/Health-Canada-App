package com.example.healthcanadaapp;

public class Appointment {
    String clinic;
    int starthour;
    int startmin;
    boolean isAccessible;

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public int getStarthour() {
        return starthour;
    }

    public void setStarthour(int starthour) {
        this.starthour = starthour;
    }

    public int getStartmin() {
        return startmin;
    }

    public void setStartmin(int startmin) {
        this.startmin = startmin;
    }

    public boolean isAccessible() {
        return isAccessible;
    }

    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }

    public String getHealthno() {
        return healthno;
    }

    public void setHealthno(String healthno) {
        this.healthno = healthno;
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

    String healthno;
    String extrainfo1;
    String extrainfo2;
    String extrainfo3;
}
