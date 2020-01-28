package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Samuel_1 extends AppCompatActivity {

    PDFView Samuel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samuel_1);

        Samuel1=findViewById(R.id.pdfSamuel1);
        Samuel1.fromAsset("1_Samuel.pdf").load();
    }
}
