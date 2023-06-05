package com.example.shreetube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TrackingPage extends AppCompatActivity {

    Button B11, B22;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking_page);

        B11=findViewById(R.id.button2);
        B22=findViewById(R.id.button3);


        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TrackingPage.this, Pipesize.class);
                startActivity(intent);
            }
        });

        B22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TrackingPage.this, Newsize.class);
                startActivity(intent);
            }
        });

    }
}