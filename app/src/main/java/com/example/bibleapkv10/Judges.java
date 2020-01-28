package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Judges extends AppCompatActivity {

    PDFView Judges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judges);

        Judges=findViewById(R.id.pdfJudges);
        Judges.fromAsset("Judges.pdf").load();
    }
}
