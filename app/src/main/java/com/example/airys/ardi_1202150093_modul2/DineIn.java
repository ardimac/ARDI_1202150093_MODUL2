package com.example.airys.ardi_1202150093_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.airys.ardi_1202150093_modul2.MENU.ReyclerView;

public class DineIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
    }

    public void pesan(View view) {
        Intent i = new Intent(DineIn.this,ReyclerView.class);
        startActivity(i);
    }
}
