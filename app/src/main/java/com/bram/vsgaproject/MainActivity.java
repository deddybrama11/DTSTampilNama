package com.bram.vsgaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNama, txtAlamat;
    Button btnSubmit, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNama = findViewById(R.id.et_nama);
        txtAlamat = findViewById(R.id.et_alamat);
        btnSubmit = findViewById(R.id.btn_simpan);
        btnClear = findViewById(R.id.btn_reset);
        setTitle("Aplikasi menampilkan nama");

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resett(view);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNama.getText().toString().equals("")){
                    txtNama.setError("Nama belum terisi !");
                }else if (txtAlamat.getText().toString().equals("")){
                    txtAlamat.setError("Alamat belum terisi !");
                }else{
                    Intent i = new Intent(MainActivity.this, TampilActivity.class);
                    i.putExtra("nama", txtNama.getText().toString());
                    i.putExtra("alamat",txtAlamat.getText().toString());
                    startActivity(i);
                }
            }
        });

    }

    public void resett(View view) {
        txtNama.setText("");
        txtAlamat.setText("");
    }
}