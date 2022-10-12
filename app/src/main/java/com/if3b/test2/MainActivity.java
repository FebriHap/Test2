package com.if3b.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.if3b.test2.R;

public class MainActivity extends AppCompatActivity {
    Button btntekan;
    EditText etnama;
    TextView tvnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Uji Coba");

        btntekan =findViewById(R.id.btntekan);
        etnama = findViewById(R.id.etnama);
        tvnama = findViewById(R.id.tvnama);

        btntekan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etnama.getText().toString();
                String hasil = tvnama.getText().toString();

                if (nama.trim().equals("")){
                    etnama.setError("Harus Diisi");
                    return;
                }


            }
        });
    }
}