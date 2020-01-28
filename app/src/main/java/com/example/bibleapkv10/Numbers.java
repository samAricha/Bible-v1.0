package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Numbers extends AppCompatActivity {

    PDFView Numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        Numbers=findViewById(R.id.pdfNumbers);
        Numbers.fromAsset("num.pdf").load();
    }
}
