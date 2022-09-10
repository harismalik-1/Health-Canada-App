package com.example.healthcanadaapp;

import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

public class GettingStarted extends AppCompatActivity {

    ViewPager viewPager2;
    LinearLayout dots;
    SliderAdapter sliderAdapter;
    TextView[] dotss;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getting_started_1);


        viewPager2 = findViewById(R.id.viewPager22);
        dots = findViewById(R.id.dots);

        sliderAdapter = new SliderAdapter(this);

        viewPager2.setAdapter( sliderAdapter);
        addDots(0);
        viewPager2.addOnPageChangeListener(changeListener);
    }
    private void addDots(int position){
        dotss = new TextView[3];
        dots.removeAllViews();
        for (int i = 0;i<dotss.length;i++){
            dotss[i] = new TextView(this);
            dotss[i].setText(Html.fromHtml("&#8226"));
            dotss[i].setTextSize(60);

            dots.addView(dotss[i]);
        }
        if(dotss.length>0){
            dotss[position].setTextColor(getResources().getColor(R.color.black));
        }
    }
    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
