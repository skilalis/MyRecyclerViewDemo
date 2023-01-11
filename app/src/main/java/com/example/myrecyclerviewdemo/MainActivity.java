package com.example.myrecyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int[] images = {
      R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,R.drawable.bahrain,
            R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,R.drawable.india,
            R.drawable.japan,R.drawable.nepal,R.drawable.pakistan,R.drawable.nepal
    };
    MyAdapter myAdapter;

    String [] title, desc;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);

        title = getResources().getStringArray(R.array.country_names);
        desc = getResources().getStringArray(R.array.country_desc);

        myAdapter = new MyAdapter(this,title,desc,images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}