package com.stuportal.stuportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Student extends AppCompatActivity {
    TextView textTitle, textSubTitle, textLogo, textItemOne,
            textItemTwo, textItemThree, textItemFour, textItemFive, textItemSix, textBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    public void btnNuni(View view) {
        Intent intent =new Intent(this, Nationaluni.class);
        startActivity(intent);
    }
    public void btnRess(View view) {
        Intent intent =new Intent(this, Sschsc.class);
        startActivity(intent);
    }
    public void btnUni(View view) {
        Intent intent =new Intent(this, Uniadmission.class);
        startActivity(intent);
    }
    public void btneinfo(View view) {
        Intent intent =new Intent(this, Eduinfo.class);
        startActivity(intent);
    }
    public void btnBcsp(View view) {
        Intent intent =new Intent(this, Bcsportal.class);
        startActivity(intent);
    }
    public void btnHome(View view) {
        Intent intent =new Intent(this, Tab.class);
        startActivity(intent);
    }
}
