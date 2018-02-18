package com.example.airys.ardi_1202150093_modul2.MENU;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.airys.ardi_1202150093_modul2.R;

public class DetailMenu extends AppCompatActivity {

    TextView menu, harga;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        menu = (TextView) findViewById(R.id.id_detailmenu);
        harga = (TextView) findViewById(R.id.id_detailharga);
        image = (ImageView) findViewById(R.id.id_detailimage);

        Intent i = this.getIntent();
        String menu2 = i.getExtras().getString("nama");
        String harga2 = i.getExtras().getString("harga");
        int gambar = i.getExtras().getInt("gambar");

        menu.setText(menu2);
        harga.setText(harga2);
        image.setImageResource(gambar);
    }
}
