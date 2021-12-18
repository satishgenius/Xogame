package com.gaming.Xogame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class splashscreen extends AppCompatActivity {
    TextView xogame;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        xogame = findViewById(R.id.xogame);
        lottieAnimationView = findViewById(R.id.lottie);


        //xogame.animate().translationY(-1400).setDuration(2700).setStartDelay(0);
        new  Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,MainActivity.class);
                startActivity(intent);
            }
        },5000);
    }
}