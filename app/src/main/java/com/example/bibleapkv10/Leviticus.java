package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Leviticus extends AppCompatActivity {

    PDFView Leviticus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leviticus);

        Leviticus=findViewById(R.id.pdfLeviticus);
        Leviticus.fromAsset("lev.pdf").load();
    }
}
