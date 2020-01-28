package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Deutronomy extends AppCompatActivity {

    PDFView Deut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutronomy);


        Deut=findViewById(R.id.pdfDeutronomy);
        Deut.fromAsset("deu.pdf").load();
    }
}
