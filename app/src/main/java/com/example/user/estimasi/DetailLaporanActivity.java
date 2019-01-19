package com.example.user.estimasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailLaporanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_laporan);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setTitle("Laporan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
