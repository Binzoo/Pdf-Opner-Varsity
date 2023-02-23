package com.example.varsityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class pastPapers extends AppCompatActivity {

    private ListView subjects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_papers);

        subjects = findViewById(R.id.subjects);
        String [] subject = {"Programming 1B: PROG","Network Engineering: NWEG ","IT Professional Practice: ITPP",
                "Principle of Security: PRSE"};

        Intent intent = new Intent(this, testAndExam.class);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subject);
        subjects.setAdapter(arrayAdapter);

        subjects.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(((TextView)view).getText().toString().equals(subject[0])){
                    startActivity(intent);
                }else if(((TextView)view).getText().toString().equals(subject[1])){
                    startActivity(intent);
                }else if(((TextView)view).getText().toString().equals(subject[2])){
                    startActivity(intent);
                }else if(((TextView)view).getText().toString().equals(subject[3])){
                    startActivity(intent);
                }
            }
        });
    }
}