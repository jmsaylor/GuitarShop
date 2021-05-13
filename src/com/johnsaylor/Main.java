package com.johnsaylor;

import com.johnsaylor.types.Brand;
import com.johnsaylor.types.Model;

public class Main {

    public static void main(String[] args) {
        Guitar guitar = new AcousticGuitar.Builder(AcousticGuitar.Style.JUGGERNAUT)
                .brand(Brand.OTHER)
                .year(1984).build();

        Guitar electric = new ElectricGuitar.Builder().brand(Brand.GIBSON).model(Model.SG).build();

        guitar.setDescription("Well worn in");

        System.out.println(guitar);
        System.out.println(electric);
    }
}
