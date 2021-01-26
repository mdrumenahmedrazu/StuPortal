package com.stuportal.stuportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nationaluni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nationaluni);
    }
    public void btnHonsresult(View view) {
        Intent intent =new Intent(this, Nures.class);
        startActivity(intent);
    }
    public void btnMastersre(View view) {
        Intent intent =new Intent(this, Mastersresult.class);
        startActivity(intent);
    }
    public void btnNuadmission(View view) {
        Intent intent =new Intent(this, Nuadmission.class);
        startActivity(intent);
    }
    public void btnExamregis(View view) {
        Intent intent =new Intent(this, Examregistartion.class);
        startActivity(intent);
    }
    public void btnNunews(View view) {
        Intent intent =new Intent(this, Nunews.class);
        startActivity(intent);
    }
    public void btnHome(View view) {
        Intent intent =new Intent(this, Tab.class);
        startActivity(intent);
    }
}
