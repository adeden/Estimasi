package com.example.user.estimasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class KonfirmasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Hitung");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
