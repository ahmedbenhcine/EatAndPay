package com.hoksama.entities;

public class Category {
    int IdCat;
    String name;

    public Category(int idCat, String name) {
        IdCat = idCat;
        this.name = name;
    }

    public int getIdCat() {
        return IdCat;
    }

    public void setIdCat(int idCat) {
        IdCat = idCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "IdCat=" + IdCat +
                ", name='" + name + '\'' +
                '}';
    }
}
