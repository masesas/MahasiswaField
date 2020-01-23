package com.juaracoding.mahasiswafield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InputData extends AppCompatActivity {

    private TextView etNikI, etNamaI, etAlamatI;
    private Button btnAdd, btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_data);

        etNikI = findViewById(R.id.etNikI);
        etNamaI = findViewById(R.id.txtNamaD);
        etAlamatI = findViewById(R.id.etAlamatI);

        btnAdd = findViewById(R.id.btnAdd);
        btnUpdate = findViewById(R.id.btnEdit);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
