package com.example.varsityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class testAndExam extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_and_exam);

        listView = findViewById(R.id.testAndExams);
        String [] examAndTest = {"Test", "Exam"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, examAndTest);
        listView.setAdapter(arrayAdapter);



    }
}