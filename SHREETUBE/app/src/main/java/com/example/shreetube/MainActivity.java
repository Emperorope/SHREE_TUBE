package com.example.shreetube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText E1, E2;
    Button B1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        E1=findViewById(R.id.editTextTextEmailAddress);
        E2=findViewById(R.id.editTextTextPassword2);
        B1=findViewById(R.id.button);

        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E1.setText("");
            }
        });

        E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E2.setText("");
            }
        });


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String S1 = "123";
                String S2 = "123";
                String S3 = E1.getText().toString();
                String S4 = E2.getText().toString();

                if (S1.equals(S3) && S2.equals(S4)) {
                    Toast.makeText(MainActivity.this, "LOGIN successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, TrackingPage.class);
                    startActivity(intent);

                }
            }
        });


    }
}