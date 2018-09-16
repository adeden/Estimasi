package com.example.user.estimasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HitungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Hiutung");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
