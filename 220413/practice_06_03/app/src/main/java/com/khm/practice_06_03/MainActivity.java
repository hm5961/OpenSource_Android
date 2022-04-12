package com.khm.practice_06_03;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TabHost;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.icon_android);

        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabDog = tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabDog.setContent(R.id.tabDog);
        tabHost.addTab(tabDog);

        TabHost.TabSpec tabCat = tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabCat.setContent(R.id.tabCat);
        tabHost.addTab(tabCat);

        TabHost.TabSpec tabRabbit = tabHost.newTabSpec("Rabbit").setIndicator("토끼");
        tabRabbit.setContent(R.id.tabRabbit);
        tabHost.addTab(tabRabbit);

        TabHost.TabSpec tabHorse = tabHost.newTabSpec("Horse").setIndicator("말");
        tabHorse.setContent(R.id.tabHorse);
        tabHost.addTab(tabHorse);

        tabHost.setCurrentTab(0);
    }
}