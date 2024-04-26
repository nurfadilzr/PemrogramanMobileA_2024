package com.example.doadanzikir.doa;

import android.content.Intent;
import android.os.Bundle;

import com.example.doadanzikir.MainActivity;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

//import com.example.doadanzikir.databinding.ActivityKumpulanDoaBinding;

import com.example.doadanzikir.R;

public class KumpulanDoaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumpulan_doa);

        Button btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView doa_akhirat = findViewById(R.id.doa_akhirat);
        TextView doa_ortu = findViewById(R.id.doa_keduaortu);
        TextView doa_sebelum_makan = findViewById(R.id.doa_sblmmakan);
        TextView doa_sesudah_makan = findViewById(R.id.doa_stlhmkn);
        TextView doa_bangun_tidur = findViewById(R.id.doa_bgntdr);
        TextView doa_masuk_wc = findViewById(R.id.doa_mskwc);
        TextView doa_keluar_wc = findViewById(R.id.doa_outwc);
        TextView doa_turun_hujan = findViewById(R.id.doa_trnhjn);
        TextView doa_lailatul = findViewById(R.id.doa_lail);
        TextView doa_masuk_masjid = findViewById(R.id.doa_mskmasjid);

        doa_akhirat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KumpulanDoaActivity.this, DuniaAkhiratActivity.class);
                startActivity(intent);
            }
        });

        doa_ortu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, DoaOrtuActivity.class);
                startActivity(intent);
            }
        });

        doa_sebelum_makan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, DoaMakanActivity.class);
                startActivity(intent);
            }
        });

        doa_sesudah_makan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, SesudahMakanActivity.class);
                startActivity(intent);
            }
        });

        doa_bangun_tidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, BangunTidurActivity.class);
                startActivity(intent);
            }
        });

        doa_masuk_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, MasukWCActivity.class);
                startActivity(intent);
            }
        });

        doa_keluar_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, KeluarWCActivity.class);
                startActivity(intent);
            }
        });

        doa_turun_hujan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, TurunHujanActivity.class);
                startActivity(intent);
            }
        });

        doa_lailatul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, LailatulQadrActivity.class);
                startActivity(intent);
            }
        });

        doa_masuk_masjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk memindahkan pengguna ke halaman DoaAkhiratActivity
                Intent intent = new Intent(KumpulanDoaActivity.this, MasukMasjidActivity.class);
                startActivity(intent);
            }
        });
    }
}
