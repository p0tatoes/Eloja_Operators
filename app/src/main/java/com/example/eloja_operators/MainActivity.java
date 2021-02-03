package com.example.eloja_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView answer = findViewById(R.id.txtAnswer);

        int birthDay = 13;
        int birthMonth = 1;
        int birthYear = 2005;

        int currentDay = 3;
        int currentMonth = 2;
        int currentYear = 2021;

        int ageYear, ageMonth, ageDay;

        if (birthMonth > currentMonth) {
            currentMonth += 12;
            currentYear -= 1;
        }
        else if (birthDay > currentDay) {
            currentDay += 31;
            currentMonth -= 1;
        }

        ageYear = currentYear - birthYear;
        ageMonth = currentMonth - birthMonth;
        ageDay = currentDay - birthDay;

        if (ageMonth == 0 && ageDay == 0) {
            answer.setText("I am "+ ageYear+ " years old!");
        }
        else if (ageMonth == 0) {
            answer.setText("I am "+ ageYear+ " years, and "+ ageDay+ " days old!");
        }
        else if (ageDay == 0) {
            answer.setText("I am "+ ageYear+ " years, and "+ ageMonth+ " months old!");
        }
        else {
            answer.setText("I am "+ ageYear+ " years, "+ ageMonth+ " months, and "+ ageDay+ " days old!");
        }
    }
}