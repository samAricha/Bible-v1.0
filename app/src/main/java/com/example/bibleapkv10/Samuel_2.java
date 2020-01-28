package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Samuel_2 extends AppCompatActivity {

    PDFView Samuel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samuel_2);

        Samuel2=findViewById(R.id.pdfSamuel2);
        Samuel2.fromAsset("2_Samuel.pdf").load();
    }
}
