package com.stuportal.stuportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bcsportal extends AppCompatActivity {
    TextView textTitle, textSubTitle, textLogo, textItemOne,
            textItemTwo, textItemThree, textItemFour, textItemFive, textItemSix, textBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcsportal);

    }
    public void btnSyl(View view) {
        Intent intent =new Intent(this, Syllabus.class);
        startActivity(intent);
    }
    public void btnCad(View view) {
        Intent intent =new Intent(this, Cadrelist.class);
        startActivity(intent);
    }
    public void btnMot(View view) {
        Intent intent =new Intent(this, Bcsmotivation.class);
        startActivity(intent);
    }

    public void btnHome(View view) {
        Intent intent =new Intent(this, Tab.class);
        startActivity(intent);
    }
}
