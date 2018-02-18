package com.example.airys.ardi_1202150093_modul2.MENU;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.airys.ardi_1202150093_modul2.R;

/**
 * Created by airys on 17/02/18.
 */

public class ReyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView tv1, tv2;
    ImageView imageView;
    ItemClickListener itemClickListener;

    public ReyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);
        //menampilkan text dari widget CardView pada id daftar_judul
        tv2= (TextView) itemView.findViewById(R.id.daftar_deskripsi);
        //menampilkan text deskripsi dari widget CardView pada id daftar_deskripsi
        imageView= (ImageView) itemView.findViewById(R.id.daftar_icon);
        //menampilkan gambar atau icon pada widget Cardview pada id daftar_icon


        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
}
