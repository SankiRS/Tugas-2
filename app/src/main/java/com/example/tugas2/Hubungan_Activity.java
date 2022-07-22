package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hubungan_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungan);

        Button bCek = findViewById(R.id.b_cek);
        EditText gNilai1 = findViewById(R.id.g_nilai1);
        EditText gNilai2 = findViewById(R.id.g_nilai2);
        TextView gHasil = findViewById(R.id.g_hasil);

        bCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ambil nilai
                int nNilai1 = Integer.parseInt(gNilai1.getText().toString());
                int nNilai2 = Integer.parseInt(gNilai2.getText().toString());

                // cek Perbandingan
                if (nNilai1 == nNilai2){
                    String hasilSama = getString(R.string.teks_sama,nNilai1,nNilai2);
                    gHasil.setText(hasilSama);
                }
                else if (nNilai1 >= nNilai2){
                    String hasilBesar = getString(R.string.teks_besar,nNilai1,nNilai2);
                    gHasil.setText(hasilBesar);
                }
                else if (nNilai1 <= nNilai2){
                    String hasilKecil = getString(R.string.teks_kecil,nNilai1,nNilai2);
                    gHasil.setText(hasilKecil);
                }
            }
        });
    }
}