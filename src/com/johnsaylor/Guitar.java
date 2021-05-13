package com.johnsaylor;

import com.johnsaylor.types.Brand;
import com.johnsaylor.types.Model;
import com.johnsaylor.types.StringCount;

public abstract class Guitar {
    protected Brand brand;
    protected Model model;
    protected Integer year;
    protected StringCount strings;
    protected Boolean hasPickup;
    protected Integer price;
    public String description;

    public StringCount getStrings() {
        return strings;
    }

    public Model getModel() { return model; }

    public Brand getBrand() {
        return brand;
    }

    public Integer getYear() {
        return year;
    }

    public Boolean isHasPickup() {
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
                ", model=" + model +
                ", year=" + year +
                ", strings=" + strings +
                ", hasPickup=" + hasPickup +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    Guitar(Builder<?> builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.strings = builder.strings == null ? StringCount.SIX : builder.strings;
        this.hasPickup = builder.hasPickup;
        this.price = builder.price;
        this.description = builder.description;
    }

    abstract static class Builder<T extends Builder<T>>{
        private Brand brand;
        private Model model;
        private Integer year;
        private StringCount strings;
        private boolean hasPickup;
        private Integer price;
        public String description;

        abstract Guitar build();
        protected abstract T self();

        public T brand(Brand brand) {
            this.brand = brand;
            return self();
        }

        public T model(Model model){
            this.model = model;
            return self();
        }

        public T year(Integer year) {
            this.year = year;
            return self();
        }

        public T string(StringCount strings) {
            this.strings =strings;
            return self();
        }

        public T hasPickup(boolean hasPickup) {
            this.hasPickup = hasPickup;
            return self();
        }

        public T price(Integer price) {
            this.price = price;
            return self();
        }

        public T description(String description) {
            this.description = description;
            return self();
        }
    }
}
