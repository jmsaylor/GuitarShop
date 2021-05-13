package com.johnsaylor;

public class ElectricGuitar extends Guitar {

    public static class Builder extends Guitar.Builder<Builder> {


        @Override
        Guitar build() {
            return new ElectricGuitar(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private ElectricGuitar(Builder builder) {
        super(builder);
        hasPickup = true;
    }

}
