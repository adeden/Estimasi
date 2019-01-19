package com.example.user.estimasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LaporanActivity extends AppCompatActivity {

    ListView lvLaporan;
    String[] listArray={"1. 19-9-18 | Ahmad","2. 20-9-18 | Deden","3. 25-9-18 | Mahmud","4. 28-9-18 | Andre","5. 30-9-18 | Jajat",};
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);

        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listArray);
        lvLaporan =(ListView) findViewById(R.id.lvLaporan);
        if (lvLaporan != null) {
            lvLaporan.setAdapter(adapter);
        }
        lvLaporan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(LaporanActivity.this,DetailLaporanActivity.class));
            }
        });
    }
}
