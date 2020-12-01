package com.example.game_store;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Handler;
import android.view.WindowManager;
import android.os.Bundle;
public class splashActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate( savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
            }
        },5000);
    }

}
