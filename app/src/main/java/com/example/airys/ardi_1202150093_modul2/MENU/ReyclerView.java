package com.example.airys.ardi_1202150093_modul2.MENU;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.airys.ardi_1202150093_modul2.R;

public class ReyclerView extends AppCompatActivity {

    RecyclerView reyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reycler_view);

        reyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        ReyclerAdapter adapter=new ReyclerAdapter(this,ListMenu.getMenu());
        reyclerView.setAdapter(adapter);
        reyclerView.setHasFixedSize(true);
        reyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
