package com.example.varsityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class OptionsActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        listView = findViewById(R.id.options);

        String[] options = {"PAS", "Past Papers", "Time Tables", "Groups"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(arrayAdapter);


        Intent display = new Intent(this, DisplayScreen.class);
        Intent intentToSubjects = new Intent(this,pastPapers.class);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String option = ((TextView)view).getText().toString();
                if(option.equals(options[0])){
                    display.putExtra("PAS", "PASV5.pdf");
                    startActivity(display);
                }else if(option.equals(options[1])){
                    startActivity(intentToSubjects);
                }else if(option.equals(options[2])){
                    display.putExtra("TimeTable", "timeTable.pdf");
                    startActivity(display);
                }
            }
        });

    }
}