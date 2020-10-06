package com.bram.vsgaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TampilActivity extends AppCompatActivity {
    TextView txt_nama, txt_alamat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        setTitle("Aplikasi menampilkan nama");

        txt_alamat = findViewById(R.id.txt_alamat);
        txt_nama = findViewById(R.id.txt_tampil);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String alamat = intent.getStringExtra("alamat");

        txt_nama.setText(nama);
        txt_alamat.setText("dari "+alamat);




    }
}