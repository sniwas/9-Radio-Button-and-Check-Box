package com.example.march_11_my;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstname;
    EditText lastname;
    Button displayvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname=findViewById(R.id.edittext1);
        lastname=findViewById(R.id.edittext2);
        displayvalue=findViewById(R.id.button);
        displayvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = firstname.getText().toString();
                String value2 = lastname.getText().toString();
                if (TextUtils.isEmpty(value1) || TextUtils.isEmpty(value2)) {
                    if(TextUtils.isEmpty(value1)) {
                        firstname.setError("Please enter your first name");
                    }
                    if(TextUtils.isEmpty(value2)) {
                        lastname.setError("Enter the password");
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Welcome"+value1, Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,MainActivity2_checkbox.class);
                    startActivity(intent);
                }

            }
        });
    }
}