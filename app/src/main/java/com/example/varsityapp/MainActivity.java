package com.example.varsityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLOutput;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText studentNumber;
    private Button loginBtn;

    private final String [] grp1 = {"","ST10021906", "ST10022447", "ST10030193", "ST10030735", "ST10031932", "ST10031991", "ST10032885", "ST10032904", "ST10033283",
            "ST10033321", "ST10034968", "ST10039749", "ST10040834", "ST10048211", "ST10049126", "ST10050374", "ST10058327", "ST10062860", "ST10066790",
            "ST10067040", "ST10069986", "ST10071160", "ST10088007", "ST10088764", "ST10090003", "ST10090150", "ST10090272", "ST10090477", "ST10090560",
            "ST10090667", "ST10090867", "ST10090874", "ST10091130", "ST10109482", "ST10120690", "ST10121064", "ST10122510", "ST10138310", "ST10143427",
            "ST10145060", "ST10153780", "ST10156147", "ST10157363", "ST10181140", "ST10185611", "ST10186589", "ST10186731", "ST10197387", "ST10212348",
            "ST10212360", "ST10216500", "ST10219567", "ST10220952", "ST10223484"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentNumber = findViewById(R.id.studentNumber);
        loginBtn = findViewById(R.id.login);

        Intent intent = new Intent(this, OptionsActivity.class);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(checkStudentNumber()){
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this, "Your Student Number does not exist.", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }

    public boolean checkStudentNumber(){
        String stuNo = studentNumber.getText().toString();
        for (int i = 0; i < grp1.length; i++) {
            if(grp1[i].equals(stuNo.toUpperCase())){
                return true;
            }
        }
        return false;
    }
}