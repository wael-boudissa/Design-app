package com.example.design_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerviewD;
    RecyclerView recyclerViewF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerviewD = findViewById(R.id.recycleview_items);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerviewD.setLayoutManager(linearLayoutManager);//! for setting the recycle view verticly
        recyclerviewD.setHasFixedSize(true);

        List<String> listitem = new ArrayList<>();
        listitem.add("item1");
        listitem.add("item1");
        listitem.add("item1");
        listitem.add("item1");
        listitem.add("item5");
        recyclerviewD.setAdapter(new AdapterDirectories(listitem));

       recyclerViewF = findViewById(R.id.recycleview_files);
       LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
       linearLayoutManager1.setOrientation(RecyclerView.VERTICAL);
       recyclerViewF.setLayoutManager(linearLayoutManager1);
        List<String> listitem2 = new ArrayList<>();
        listitem.add("item1");
        listitem.add("item1");
        listitem.add("item1");
        listitem.add("item1");
        listitem.add("item5");
       recyclerViewF.setAdapter(new AdapterFiles(listitem2));





    }
}