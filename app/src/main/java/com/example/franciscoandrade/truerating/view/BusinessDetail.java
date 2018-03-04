package com.example.franciscoandrade.truerating.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.franciscoandrade.truerating.R;

/**
 * Created by melg on 3/3/18.
 */

public class BusinessDetail extends AppCompatActivity{

    private TextView businessName;
    private TextView addressLine;
    private TextView critical;
    private TextView violationPoints;
    private TextView violationCodes;
    private TextView violationDescription;
    private TextView letterGrade;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        businessName = findViewById(R.id.restaurant_name);
        addressLine = findViewById(R.id.restaurant_address);
        critical = findViewById(R.id.critical_flag);
        violationPoints = findViewById(R.id.score);
        violationCodes= findViewById(R.id.violation_code);
        violationDescription = findViewById(R.id.violation_des);
        letterGrade = findViewById(R.id.letter_grade);

    }

}
