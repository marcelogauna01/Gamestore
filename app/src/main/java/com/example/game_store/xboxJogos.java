package com.example.game_store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class xboxJogos extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public xboxJogos() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xbox_jogos);
        mrecyclerView = (RecyclerView) findViewById(R.id.my_recyclerview);

    }
}