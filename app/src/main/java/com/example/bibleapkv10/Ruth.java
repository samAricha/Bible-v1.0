package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Ruth extends AppCompatActivity {

    PDFView Ruth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruth);

        Ruth=findViewById(R.id.pdfRuth);
        Ruth.fromAsset("Ruth.pdf").load();
    }
}
