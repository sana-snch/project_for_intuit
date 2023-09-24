package com.example.margin;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.margin.GradeFragment;
import com.example.margin.NewsFragment;
import com.example.margin.ProfileFragment;
import com.example.margin.R;
import com.example.margin.SheduleFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.io.*;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.bottom_margin);
    }
    SheduleFragment sheduleFragment = new SheduleFragment();
    NewsFragment newsFragment = new NewsFragment();
    GradeFragment gradeFragment = new GradeFragment();
    ProfileFragment profileFragment = new ProfileFragment();


    @Override
    public boolean
    onNavigationItemSelected(@NonNull MenuItem item)
    {

//        switch (item.getItemId()) {
//            case R.id.bottom_margin:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.flFragment, sheduleFragment)
//                        .commit();
//                return true;
//
//            case R.id.bottom_news:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.flFragment, newsFragment)
//                        .commit();
//                return true;
//
//            case R.id.bottom_grade:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.flFragment, gradeFragment)
//                        .commit();
//                return true;
//            case R.id.bottom_profile:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.flFragment, profileFragment)
//                        .commit();
//                return true;
//        }
        int itemId = item.getItemId();
        if (itemId == R.id.bottom_margin) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, sheduleFragment)
                    .commit();
        } else if (itemId == R.id.bottom_news) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, newsFragment)
                    .commit();
        } else if (itemId == R.id.bottom_grade) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, gradeFragment)
                    .commit();
        } else if (itemId == R.id.bottom_profile) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, profileFragment)
                    .commit();
        }

        return false;
    }
}