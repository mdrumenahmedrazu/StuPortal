package com.stuportal.stuportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
    }
    public void btnJob(View view) {
        Intent intent =new Intent(this, Jobs.class);
        startActivity(intent);
    }
    public void btnSci(View view) {
        Intent intent =new Intent(this, Science.class);
        startActivity(intent);
    }
    public void btnNews(View view) {
        Intent intent =new Intent(this, News.class);
        startActivity(intent);
    }
    public void btnStu(View view) {
        Intent intent =new Intent(this, Student.class);
        startActivity(intent);
    }
    public void btnCam(View view) {
        Intent intent =new Intent(this, Campus.class);
        startActivity(intent);
    }
    public void btnRev(View view) {
        Intent intent =new Intent(this, Review.class);
        startActivity(intent);
    }

}
