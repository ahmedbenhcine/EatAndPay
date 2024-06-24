package com.hoksama.entities;

public class Item {
    int IdItem;
    String name;
    float price;
    Category category;

    public Item(int idItem, String name, float price, Category category) {
        IdItem = idItem;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getIdItem() {
        return IdItem;
    }

    public void setIdItem(int idItem) {
        IdItem = idItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "IdItem=" + IdItem +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category.getName() +
                '}';
    }
}
