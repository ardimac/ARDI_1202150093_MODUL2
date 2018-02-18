package com.example.airys.ardi_1202150093_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.airys.ardi_1202150093_modul2.MENU.ReyclerView;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void pesan(View view) {
        Intent i = new Intent(TakeAway.this,ReyclerView.class);
        startActivity(i);
    }
}
