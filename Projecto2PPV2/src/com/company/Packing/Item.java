package com.company.Packing;

import order.packing.IItem;

public class Item implements IItem {

    private String reference;
    private String description;
    private int depth;
    private int height;
    private int lenght;

    public Item(String reference, String description, int depth, int height, int length) {
        this.reference = reference;
        this.description = description;
        this.depth = depth;
        this.height = height;
        this.lenght = length;
    }


    @Override
    public String getReference() {
        return this.reference;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String s) {

        this.description = s;
    }


    @Override
    public int getDepth() {
        return this.depth;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getLenght() {
        return this.lenght;
    }

    @Override
    public int getVolume() {
        int tmp = this.depth * this.height * this.lenght;
        return tmp;
    }

    /**
     * Metodo toString retorna os valores presentes no objecto
     *
     * @return
     */
    @Override
    public String toString() {
        return "Item{" +
                "reference='" + reference + '\'' +
                ", description='" + description + '\'' +
                ", depth=" + depth +
                ", height=" + height +
                ", lenght=" + lenght +
                '}';
    }
}
