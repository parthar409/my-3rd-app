package com.partha.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button sButton,gButton;
    Button toast;
    Button nextPage;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.image);
        sButton=findViewById(R.id.sButton);
        gButton=findViewById(R.id.gButton);
        toast=findViewById(R.id.toast);
        nextPage=findViewById(R.id.nextPage);







        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setVisibility(View.VISIBLE);
            }
        });

        gButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setVisibility(View.GONE);
            }
        });


        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"hi i am not a Joydip",Toast.LENGTH_LONG).show();
            }
        });




        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next =new Intent(MainActivity.this, MainActivity2.class);
                startActivity(next);
            }
        });




    }
}