package com.example.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView i1;
    ImageView i2;
    Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = findViewById(R.id.imageView1);
        i2 = findViewById(R.id.imageView2);

        button01 = findViewById(R.id.button1);
    }

    public void onButton1(View v){
        i1.setImageResource(R.drawable.tomandjerry);
        i2.setImageResource(0);
    }

    public void onButton2(View v){
        i2.setImageResource(R.drawable.tomandjerry);
        i1.setImageResource(0);
    }

}