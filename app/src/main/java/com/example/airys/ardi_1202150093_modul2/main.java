package com.example.airys.ardi_1202150093_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class main extends AppCompatActivity {

    RadioButton rb1, rb2;
    RadioGroup rbgroup;
    Button but_pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = (RadioButton) findViewById(R.id.rb_1);
        rb2 = (RadioButton) findViewById(R.id.rb_2);
        rbgroup = (RadioGroup) findViewById(R.id.rb_group);
        but_pesan = (Button) findViewById(R.id.b_pesan);

    }

    public void pesan(View view) {
        int id = rbgroup.getCheckedRadioButtonId();
        if ( id == rb1.getId()){
            Intent i = new Intent(main.this,DineIn.class);
            startActivity(i);
            Toast.makeText(this, "Dine in", Toast.LENGTH_LONG).show();
        }else if (id == rb2.getId()){
            Intent i = new Intent(main.this,TakeAway.class);
            startActivity(i);
            Toast.makeText(this, "Take Away", Toast.LENGTH_LONG).show();
        }
    }
}
