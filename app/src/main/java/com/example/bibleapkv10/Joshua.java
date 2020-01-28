package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Joshua extends AppCompatActivity {

    PDFView Joshua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joshua);

        Joshua=findViewById(R.id.pdfJoshua);
        Joshua.fromAsset("Joshua.pdf").load();
    }
}
