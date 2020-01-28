package com.example.bibleapkv10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Genesis extends AppCompatActivity {

    PDFView Genesis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genesis);

        Genesis=findViewById(R.id.pdfGenesis);
        Genesis.fromAsset("gen.pdf").load();

    }
}
