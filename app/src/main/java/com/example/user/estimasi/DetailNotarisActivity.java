package com.example.user.estimasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailNotarisActivity extends AppCompatActivity {

    int[] listNotaris1 = {R.drawable.jkt1, R.drawable.jkt2, R.drawable.jkt3, R.drawable.jkt4, R.drawable.jkt5};
    int[] listNotaris2 = {R.drawable.bgr1, R.drawable.bgr2, R.drawable.bgr3, R.drawable.bgr4, R.drawable.bgr5};
    int[] listNotaris3 = {R.drawable.dpk1, R.drawable.dpk2, R.drawable.dpk3, R.drawable.dpk4, R.drawable.dpk5};
    int[] listNotaris4 = {R.drawable.tgr1, R.drawable.tgr2, R.drawable.tgr3, R.drawable.tgr4, R.drawable.tgr5};
    int[] listNotaris5 = {R.drawable.bks1, R.drawable.bks2, R.drawable.bks3, R.drawable.bks4, R.drawable.bks5};
    public static int posisi = 0;
    ImageView notaris1, notaris2, notaris3, notaris4, notaris5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_notaris);
        notaris1 = (ImageView) findViewById(R.id.jkt_1);
        notaris2 = (ImageView) findViewById(R.id.jkt_2);
        notaris3 = (ImageView) findViewById((R.id.jkt_3));
        notaris4 = (ImageView) findViewById(R.id.jkt_4);
        notaris5 = (ImageView) findViewById(R.id.jkt_5);
        show_soal();
    }

    private void show_soal() {
        if (posisi == 0) {
            notaris1.setImageDrawable(getResources().getDrawable(listNotaris1[0]));
            notaris2.setImageDrawable(getResources().getDrawable(listNotaris1[1]));
            notaris3.setImageDrawable(getResources().getDrawable(listNotaris1[2]));
            notaris4.setImageDrawable(getResources().getDrawable(listNotaris1[3]));
            notaris5.setImageDrawable(getResources().getDrawable(listNotaris1[4]));
        } else if (posisi == 1) {
            notaris1.setImageDrawable(getResources().getDrawable(listNotaris2[0]));
            notaris2.setImageDrawable(getResources().getDrawable(listNotaris2[1]));
            notaris3.setImageDrawable(getResources().getDrawable(listNotaris2[2]));
            notaris4.setImageDrawable(getResources().getDrawable(listNotaris2[3]));
            notaris5.setImageDrawable(getResources().getDrawable(listNotaris2[4]));

        } else if (posisi == 2) {
            notaris1.setImageDrawable(getResources().getDrawable(listNotaris3[0]));
            notaris2.setImageDrawable(getResources().getDrawable(listNotaris3[1]));
            notaris3.setImageDrawable(getResources().getDrawable(listNotaris3[2]));
            notaris4.setImageDrawable(getResources().getDrawable(listNotaris3[3]));
            notaris4.setImageDrawable(getResources().getDrawable(listNotaris3[4]));

        } else if (posisi == 3) {
            notaris1.setImageDrawable(getResources().getDrawable(listNotaris4[0]));
            notaris2.setImageDrawable(getResources().getDrawable(listNotaris4[1]));
            notaris3.setImageDrawable(getResources().getDrawable(listNotaris4[2]));
            notaris4.setImageDrawable(getResources().getDrawable(listNotaris4[3]));
            notaris5.setImageDrawable(getResources().getDrawable(listNotaris4[4]));

        } else if (posisi == 4) {

            notaris1.setImageDrawable(getResources().getDrawable(listNotaris5[0]));
            notaris2.setImageDrawable(getResources().getDrawable(listNotaris5[1]));
            notaris3.setImageDrawable(getResources().getDrawable(listNotaris5[2]));
            notaris4.setImageDrawable(getResources().getDrawable(listNotaris5[3]));
            notaris5.setImageDrawable(getResources().getDrawable(listNotaris5[4]));

        }
    }
}
