package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bLingkaran = findViewById(R.id.b_lingkaran);
        Button bHubungan = findViewById(R.id.b_hubungan);

        // pindah ke layar lingkaran
        bLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aLingkaran = new Intent(MainActivity.this,Lingkaran_Activity.class);
                startActivity(aLingkaran);
            }
        });

        // pindah ke layar hubungan
        bHubungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aHubungan = new Intent(MainActivity.this,Hubungan_Activity.class);
                startActivity(aHubungan);
            }
        });
    }
}