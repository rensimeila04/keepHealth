package com.smktelkom.www.keephealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnhimbauan = findViewById(R.id.Himbauan);
        btnhimbauan.setOnClickListener(this);

        Button btncuci = findViewById(R.id.cuci);
        btncuci.setOnClickListener(this);

        Button btnmask = findViewById(R.id.masker);
        btnmask.setOnClickListener(this);

        Button btnpola = findViewById(R.id.hidup);
        btnpola.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Himbauan:
                Intent moveIntent = new Intent(MainActivity.this, Himbauan.class);
                startActivity(moveIntent);
                break;
            case R.id.cuci:
                Intent movecuci = new Intent(MainActivity.this, cucitangan.class);
                startActivity(movecuci);
                break;
            case R.id.masker:
                Intent movemasker = new Intent(MainActivity.this, masker.class);
                startActivity(movemasker);
                break;
            case  R.id.hidup:
                Intent movehidup = new Intent(MainActivity.this, polahidup.class);
                startActivity(movehidup);
                break;
        }
    }
}