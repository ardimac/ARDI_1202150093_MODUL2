package com.example.airys.ardi_1202150093_modul2.MENU;

import com.example.airys.ardi_1202150093_modul2.R;

import java.util.ArrayList;
import com.example.airys.ardi_1202150093_modul2.R;

/**
 * Created by airys on 18/02/18.
 */

public class ListMenu {

    public static ArrayList<Menu> getMenu(){
        ArrayList<Menu>menu= new ArrayList<>();

        Menu makanan1 = null;

        makanan1 = new Menu();
        makanan1.setName("Bebek Goreng");
        makanan1.setHarga("Harga : RP 30.000");
        makanan1.setImage(R.drawable.bebekgoreng);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Nasi Goreng");
        makanan1.setHarga("Harga : RP 15.000");
        makanan1.setImage(R.drawable.nasigoreng);
        menu.add(makanan1);

        makanan1 = new Menu();
        makanan1.setName("Gurami Bakar");
        makanan1.setHarga("Harga : RP 45.000");
        makanan1.setImage(R.drawable.guramibakar);
        menu.add(makanan1);


        return menu;
    }
}
