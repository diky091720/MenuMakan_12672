package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    ImageView mainImageView;
    TextView harga,deskripsi,pengertian;

    String data1,data2,data3;
    int myImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mainImageView = findViewById(R.id.mainimageview);
        harga= findViewById(R.id.harga);
        deskripsi = findViewById(R.id.deskripsi);
        pengertian = findViewById(R.id.pengertian);

        getData();
        setData();

    }

    private void getData(){
        if(getIntent().hasExtra("myImage")&& getIntent().hasExtra("data1")&&
        getIntent().hasExtra("data2")&& getIntent().hasExtra("data3")){

            data1=getIntent().getStringExtra("data1");
            data2=getIntent().getStringExtra("data2");
            data3=getIntent().getStringExtra("data3");
            myImage=getIntent().getIntExtra("myImage",1);

        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        harga.setText(data1);
        deskripsi.setText(data2);
        pengertian.setText(data3);
        mainImageView.setImageResource(myImage);

    }
}