package com.example.march_11_my;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity2_checkbox extends AppCompatActivity {
    CheckBox c1,c2,c3,c4;
    Button submit,b3;
    int next;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_checkbox);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        submit=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        next=0;
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value=0;
                next++;
                StringBuilder result=new StringBuilder();
                result.append("Selected Item :");
                if(c1.isChecked())
                {
                    result.append("1 checked");
                    value++;
                }
                if(c3.isChecked())
                {
                    result.append("3 checked");
                    value++;
                }
                if(c4.isChecked())
                {
                    result.append("4 checked");
                    value++;
                }
                result.append("Final :"+value);
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();

            }
        });
       b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   // if(next!=0) {
                        Intent intent = new Intent(MainActivity2_checkbox.this, MainActivity2_radiobutton.class);
                        startActivity(intent);
                  //  }
              /* else {
                    submit.setError("First submit the answer");
                }*/
            }
        });
    }
}