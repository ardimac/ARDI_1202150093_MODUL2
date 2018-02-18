package com.example.airys.ardi_1202150093_modul2.MENU;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.airys.ardi_1202150093_modul2.R;

import java.util.ArrayList;

/**
 * Created by airys on 17/02/18.
 */

public class ReyclerAdapter extends RecyclerView.Adapter<ReyclerViewHolder>{

    Context context;
    ArrayList<Menu>menu;

    public ReyclerAdapter(Context context, ArrayList<Menu>menu) {
        this.context = context;
        this.menu = menu;
    }

    @Override
    public ReyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ReyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ReyclerViewHolder holder, int position) {
        final String name = menu.get(position).getName();
        final String harga = menu.get(position).getHarga();
        final int image = menu.get(position).getImage();

        holder.tv1.setText(name);
        holder.tv2.setText(harga);
        holder.imageView.setImageResource(image);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailActivity(name,harga,image);
                Toast.makeText(context, name, Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return menu.size();
    }

    private void openDetailActivity(String name,String harga, int image){
        Intent i = new Intent(context, DetailMenu.class);
        i.putExtra("nama",name);
        i.putExtra("harga",harga);
        i.putExtra("gambar", image);
        context.startActivity(i);
    }
}
