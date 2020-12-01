package com.example.game_store;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class playJogos extends AppCompatActivity {
ListView lst;
    String[] gamename={"PES","FIFA","MMA"};
    String[] descricao={"This is PES","This is FIFA","This is MMA"};
    Integer[] imgid={R.drawable.play2,R.drawable.logobk,R.drawable.xboxsemcor};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        lst= (ListView) findViewById(R.id.listview);
        listviewcustom listviewcustom=new listviewcustom(this,gamename,descricao,imgid);
        lst.setAdapter(listviewcustom);
    }
}