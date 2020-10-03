package com.example.asmduanmau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dangnhap extends AppCompatActivity {
    Button btndangnhap;
    TextView tvchuyendangki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        btndangnhap = findViewById(R.id.btndangnhap);
        tvchuyendangki = findViewById(R.id.tvchuyendangki);
        tvchuyendangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dangnhap.this,dangki.class);
                startActivity(intent);
            }
        });
    }
}