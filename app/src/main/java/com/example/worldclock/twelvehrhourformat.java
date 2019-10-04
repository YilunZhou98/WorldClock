package com.example.worldclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import androidx.appcompat.app.AppCompatActivity;

public class twelvehrhourformat extends AppCompatActivity {

    Calendar current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getSydTime(View view){
        current = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("hh:mm:ss a");
        String strdate = mdformat.format(current.getTime());
        display(strdate);
    }

    public void getChinaTime(View view) {
        Calendar china = Calendar.getInstance();
        china.setTime(new Date());
        china.add(Calendar.HOUR_OF_DAY,-3);
        SimpleDateFormat mdformat2 = new SimpleDateFormat("hh:mm:ss a");
        String strdate2 = mdformat2.format(china.getTime());
        displayChina(strdate2);
    }

    public void getNYTime(View view) {
        Calendar ny = Calendar.getInstance();
        ny.setTime(new Date());
        ny.add(Calendar.HOUR_OF_DAY,-14);
        SimpleDateFormat mdformat3 = new SimpleDateFormat("hh:mm:ss a");
        String strdate3 = mdformat3.format(ny.getTime());
        displayNY(strdate3);
    }

    public void getTokyoTime(View view) {
        Calendar tokyo = Calendar.getInstance();
        tokyo.setTime(new Date());
        tokyo.add(Calendar.HOUR_OF_DAY,-1);
        SimpleDateFormat mdformat4 = new SimpleDateFormat("hh:mm:ss a");
        String strdate4 = mdformat4.format(tokyo.getTime());
        displayTokyo(strdate4);
    }

    public void getLondonTime(View view) {
        Calendar london = Calendar.getInstance();
        london.setTime(new Date());
        london.add(Calendar.HOUR_OF_DAY,-9);
        SimpleDateFormat mdformat5 = new SimpleDateFormat("hh:mm:ss a");
        String strdate5 = mdformat5.format(london.getTime());
        displayLondon(strdate5);
    }

    private void display(String num){
        TextView sydneytime = (TextView) findViewById(R.id.textView2);
        sydneytime.setText(num);
    }

    private void displayChina(String num){
        TextView chinatime = (TextView) findViewById(R.id.textView4);
        chinatime.setText(num);
    }

    private void displayNY(String num){
        TextView nytime = (TextView) findViewById(R.id.textView6);
        nytime.setText(num);
    }

    private void displayTokyo(String num){
        TextView tokyotime = (TextView) findViewById(R.id.textView8);
        tokyotime.setText(num);
    }

    private void displayLondon(String num){
        TextView londontime = (TextView) findViewById(R.id.textView10);
        londontime.setText(num);
    }

    public void changeformat (View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
}
