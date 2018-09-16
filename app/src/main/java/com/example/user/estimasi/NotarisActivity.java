package com.example.user.estimasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NotarisActivity extends AppCompatActivity {
    ListView lvNotaris;
    String[] listArray={"1. Jakarta","2. Bogor","3. Depok","4. Tangerang","5. Bekasi",};
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notaris);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Info Notaris");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listArray);
        lvNotaris =(ListView) findViewById(R.id.lvNotaris);
        if (lvNotaris != null) {
            lvNotaris.setAdapter(adapter);
        }
        lvNotaris.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(NotarisActivity.this,DetailNotarisActivity.class));
                DetailNotarisActivity.posisi = position;
            }
        });
    }
    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
