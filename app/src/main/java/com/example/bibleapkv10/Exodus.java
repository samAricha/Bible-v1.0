package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Exodus extends AppCompatActivity {

    PDFView Exodus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exodus);

        Exodus=findViewById(R.id.pdfExodus);
        Exodus.fromAsset("exo.pdf").load();
    }
}
