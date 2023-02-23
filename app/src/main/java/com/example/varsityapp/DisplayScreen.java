package com.example.varsityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DisplayScreen extends AppCompatActivity {

    private PDFView pas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


//        if(getIntent().getStringExtra("PAS").equals("PASV5.pdf")){
//            String nameFile =  getIntent().getStringExtra("PAS");
//            System.out.println(getIntent().getStringExtra("PAS"));
//            pas = findViewById(R.id.pdfView);
//            pas.fromAsset(nameFile).load();
//        }else
        if(getIntent().getStringExtra("TimeTable").equals("timeTable.pdf")){
            String nameFile =  getIntent().getStringExtra("TimeTable");
            System.out.println(nameFile);
            pas = findViewById(R.id.pdfView);
            pas.fromAsset(nameFile).load();
        }



    }
}