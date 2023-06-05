package com.example.shreetube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newsize extends AppCompatActivity {

    Button B111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsize);

        B111=findViewById(R.id.button4);


        B111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Newsize.this, New_Process_2.class);
                startActivity(intent);
            }
        });


    }
}