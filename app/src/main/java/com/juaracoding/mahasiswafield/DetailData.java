package com.juaracoding.mahasiswafield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailData extends AppCompatActivity {

    TextView txtNikD, txtNamaD, txtAlamatD, txtTanggalD;
    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_data);

        txtNikD = findViewById(R.id.txtNikD);
        txtNamaD = findViewById(R.id.txtNamaD);
        txtAlamatD = findViewById(R.id.txtAlamatL);
        txtTanggalD = findViewById(R.id.txtAlamatL);

        btnEdit = findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
