package com.stuportal.stuportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Jobs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
    }
    public void btnGvt(View view) {
        Intent intent =new Intent(this, Govtjob.class);
        startActivity(intent);
    }
    public void btnPvt(View view) {
        Intent intent =new Intent(this, Private.class);
        startActivity(intent);
    }
    public void btnRes(View view) {
        Intent intent =new Intent(this, Result.class);
        startActivity(intent);
    }


}
