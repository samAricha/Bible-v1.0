package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.gen);
        btn2=findViewById(R.id.exodus);
        btn3=findViewById(R.id.lev);
        btn4=findViewById(R.id.num);
        btn5=findViewById(R.id.deut);
        btn6=findViewById(R.id.joshua);
        btn7=findViewById(R.id.judges);
        btn8=findViewById(R.id.ruth);
        btn9=findViewById(R.id.samuel1);
        btn10=findViewById(R.id.samuel2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Genesis.class);
                startActivity(i);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2=new Intent(MainActivity.this,Exodus.class);
                startActivity(i2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3=new Intent(MainActivity.this,Leviticus.class);
                startActivity(i3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4=new Intent(MainActivity.this,Numbers.class);
                startActivity(i4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5=new Intent(MainActivity.this,Deutronomy.class);
                startActivity(i5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i6=new Intent(MainActivity.this,Joshua.class);
                startActivity(i6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i7=new Intent(MainActivity.this,Judges.class);
                startActivity(i7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i8=new Intent(MainActivity.this,Ruth.class);
                startActivity(i8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i9 = new Intent(MainActivity.this, Samuel_1.class);
                startActivity(i9);
            }
        });

                btn10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i10 = new Intent(MainActivity.this, Samuel_2.class);
                        startActivity(i10);


                    }
                });

            }
        }
