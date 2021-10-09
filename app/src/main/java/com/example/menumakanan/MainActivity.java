package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[],s3[];
    int images[] = {R.drawable.nasicampur,R.drawable.nasibali,R.drawable.miegoreng,
            R.drawable.nasigila,R.drawable.miedokdok,R.drawable.omelte};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Makanan);
        s2 = getResources().getStringArray(R.array.Harga);
        s3 = getResources().getStringArray(R.array.pengertian);
        MyAdapter myAdapter= new MyAdapter(this,s1,s2,s3,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}