package com.newnew.fikra;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    LinearLayout opt1;
    LinearLayout opt2;
    LinearLayout opt3;
    LinearLayout opt4;
    LinearLayout opt5;
    LinearLayout opt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);



        opt1 = (LinearLayout)findViewById(R.id.opt1);


        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(MainActivity.this, opt1.class);
                startActivity(intent);
            }
        });




        opt2 = (LinearLayout)findViewById(R.id.opt2);


        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(MainActivity.this, opt2.class);
                startActivity(intent);
            }
        });



        opt3 = (LinearLayout)findViewById(R.id.opt3);


        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(MainActivity.this, opt3.class);
                startActivity(intent);
            }
        });

        opt4 = (LinearLayout)findViewById(R.id.opt4);


        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(MainActivity.this, opt4.class);
                startActivity(intent);
            }
        });


        opt5 = (LinearLayout)findViewById(R.id.opt5);


        opt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(MainActivity.this, opt5.class);
                startActivity(intent);
            }
        });


        opt6 = (LinearLayout)findViewById(R.id.opt6);


        opt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(MainActivity.this, opt6.class);
                startActivity(intent);
            }
        });


    }

}