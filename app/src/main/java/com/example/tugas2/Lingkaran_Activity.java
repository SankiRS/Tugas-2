package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        Button bJari = findViewById(R.id.b_pJari);
        EditText etJari = findViewById(R.id.et_nJari);
        TextView tvLuas = findViewById(R.id.tv_luas);
        TextView tvKeliling = findViewById(R.id.tv_keliling);

        bJari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ambil nilai jari
                int nJari = Integer.parseInt(etJari.getText().toString());

                //hitung luas
                double luas = 3.14 * nJari * nJari;
                double keliling = 2 * 3.14 * nJari;

                // tampilkan hasil
                String hasilLuas = getString(R.string.teks_luas,luas);
                tvLuas.setText(hasilLuas);
                String hasilKeliling = getString(R.string.teks_keliling,keliling);
                tvKeliling.setText(hasilKeliling);
            }
        });
    }
}