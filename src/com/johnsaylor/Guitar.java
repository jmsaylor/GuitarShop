package com.johnsaylor;

enum Brand {FENDER, GIBSON, YAMAHA, OTHER}
enum Model {STRATOCASTER, SG, LES_PAUL, OTHER}
enum StringCount {SIX, TWELVE}
enum BodyType {HOLLOW, SOLID}

public class Guitar {
    private Brand brand;
    private Model model;
    private Integer year;
    private StringCount strings;
    private boolean hasPickup;
    private Integer price;
    public String description;

    public StringCount getStrings() {
        return strings;
    }

    public Model getModel() {
        return model;
    }

    public Brand getBrand() {
        return brand;
    }

    public Integer getYear() {
        return year;
    }

    public boolean isHasPickup() {
        return hasPickup;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "brand=" + brand +
                ", year=" + year +
                ", strings=" + strings +
                ", hasPickup=" + hasPickup +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }



    public Guitar(GuitarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.strings = builder.strings;
        this.hasPickup = builder.hasPickup;
        this.price = builder.price;
        this.description = builder.description;

    }



    public static class GuitarBuilder{
        private Brand brand;
        private Model model;
        private Integer year;
        private StringCount strings;
        private boolean hasPickup;
        private Integer price;
        public String description;

        public GuitarBuilder(Brand brand, Model model) {
            this.brand = brand;
            this.model = model;
        }

        public GuitarBuilder year(Integer year) {
            this.year = year;
            return this;
        }

        public GuitarBuilder string(StringCount strings) {
            this.strings =strings;
            return this;
        }

        public GuitarBuilder hasPickup(boolean hasPickup) {
            this.hasPickup = hasPickup;
            return this;
        }

        public GuitarBuilder price(Integer price) {
            this.price = price;
            return this;
        }

        public Guitar build() {
            Guitar guitar = new Guitar(this);
            //TODO: validate guitar object
            return guitar;
        }
    }
}
