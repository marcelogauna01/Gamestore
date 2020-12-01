package com.example.game_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class ecolhaconsole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecolhaconsole);



    }
public void irplay (View view){
    Intent intent1 = new Intent(getApplicationContext(),playJogos.class);
    startActivity(intent1);
    }
public void irxbox (View view){
        Intent intent2 = new Intent(getApplicationContext(),xboxJogos.class);
        startActivity(intent2);
    }
 public void irnintendo (View view){
        Intent intent3 = new Intent(getApplicationContext(),nintendoJogos.class);
        startActivity(intent3);
    }
}