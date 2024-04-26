package com.example.doadanzikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.doadanzikir.doa.KumpulanDoaActivity;

public class MainActivity extends AppCompatActivity {
    Button button_doa, button_zikir_pagi, button_zikir_petang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_doa = findViewById(R.id.buttondoa);
        button_zikir_pagi= findViewById(R.id.buttonzikirpagi);
        button_zikir_petang= findViewById(R.id.buttonzikirpetang);

        button_doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KumpulanDoaActivity.class);
                startActivity(intent);
            }
        });
        button_zikir_pagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DzikirPagiActivity.class);
                startActivity(intent);
            }
        });
        button_zikir_petang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DzikirPetangActivity.class);
                startActivity(intent);
            }
        });
    }
}