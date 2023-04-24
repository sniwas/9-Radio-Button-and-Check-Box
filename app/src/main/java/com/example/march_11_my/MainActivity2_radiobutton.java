package com.example.march_11_my;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2_radiobutton extends AppCompatActivity {
    Button submit2;
    RadioGroup radioGroup;
    RadioButton gender;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // next2=findViewById(R.id.button5);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_radiobutton);
        submit2=findViewById(R.id.button4);
        radioGroup=findViewById(R.id.radioGroup);
        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedid=radioGroup.getCheckedRadioButtonId();
                Toast.makeText(MainActivity2_radiobutton.this, ""+selectedid+"", Toast.LENGTH_SHORT).show();
                gender=(RadioButton) findViewById(selectedid);
                if(selectedid==-1)
                {
                    Toast.makeText(getApplicationContext(), "Select anyone gender", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), gender.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
       /* next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "next selected", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}