package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerListNumeros;
    private static final int Lista_Numeros = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerListNumeros = findViewById(R.id.rvNumeros);
        mRecyclerListNumeros.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        LinearLayoutManager LinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerListNumeros.setLayoutManager(LinearLayoutManager);

        RecyclerAdapter mAdapter = new RecyclerAdapter(Lista_Numeros);
        mRecyclerListNumeros.setAdapter(mAdapter);
    }



}