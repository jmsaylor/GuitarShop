package com.johnsaylor;

import com.johnsaylor.types.Brand;
import com.johnsaylor.types.Model;

public class AcousticGuitar extends Guitar{
    enum Style {JUGGERNAUT, STANDARD, SHORT}
    private final Style style;

    public static class Builder extends Guitar.Builder<Builder>{
        private final Style style;

        public Builder(Style style) {
            this.style = style;
        }


        @Override
        public AcousticGuitar build(){
            return new AcousticGuitar(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

    private AcousticGuitar(Builder builder) {
        super(builder);
        this.style = builder.style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "AcousticGuitar{" +
                "style=" + style +
                ", brand=" + brand +
                ", model=" + model +
                ", year=" + year +
                ", strings=" + strings +
                ", hasPickup=" + hasPickup +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
