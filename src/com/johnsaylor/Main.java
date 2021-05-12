package com.johnsaylor;

public class Main {

    public static void main(String[] args) {
	    Guitar guitar = new Guitar.GuitarBuilder(Brand.GIBSON, Model.SG).year(1999).description("nick on the front").build();
        System.out.println(guitar);
    }
}
