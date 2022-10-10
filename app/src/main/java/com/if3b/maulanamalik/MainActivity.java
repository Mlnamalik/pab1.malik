package com.if3b.maulanamalik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_button;
    TextView tvtext;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_button = findViewById(R.id.btn_button);
        tvtext= findViewById(R.id.tv_text);
        etNama = findViewById(R.id.et_nama);

        btn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = etNama.getText().toString();

                if (Nama.trim().equals("")) {
                    etNama.setError("Tidak Boleh Kosong");
                }
                else {
                    tvtext.setText(Nama);
                }
            }
        });
    }
}