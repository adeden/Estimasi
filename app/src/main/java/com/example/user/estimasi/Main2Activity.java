package com.example.user.estimasi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    ImageButton imageNotaris , imageHitung;
    ImageButton imageRaywhite , imageLaporan;
    ImageButton imageProperti , imageSosialisasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageNotaris = (ImageButton)findViewById(R.id.notaris);
        imageRaywhite = (ImageButton)findViewById(R.id.raywhite);
        imageProperti = (ImageButton)findViewById(R.id.properti);
        imageHitung = (ImageButton)findViewById(R.id.hitung);
        imageLaporan = (ImageButton)findViewById(R.id.laporan);
        imageSosialisasi = (ImageButton)findViewById(R.id.sosio);


        imageHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,HitungActivity.class));
            }
        });


        imageNotaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,NotarisActivity.class));
            }
        });
        imageRaywhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.raywhitemetropolitanbekasi.com"));
                startActivity(intent);
            }
        });
        imageProperti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.raywhite.co.id/news/155807pajak-pajak-di-dunia-properti"));
                startActivity(intent);
            }
        });
        imageLaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,LaporanActivity.class));
            }
        });
        imageSosialisasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,SosialisasiActivity.class));
            }
        });
    }
}
