package com.company.packing;

import order.exceptions.PositionException;
import order.packing.Color;
import order.packing.IItem;
import order.packing.IPosition;

public class Item implements IItem {

    String reference;
    String description;
    int depth;
    int height;
    int length;
    int volume;
    Color color;
    IPosition position;
    Color colorEdge;

    public Item(String reference, String description, int depth, int height, int length, Color color, Color colorEdge) {
        this.reference = reference;
        this.description = description;
        this.depth = depth;
        this.height = height;
        this.length = length;
        this.color = color;
        this.colorEdge = colorEdge;
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
        return this.length;
    }

    @Override
    public int getVolume() {
        int tmp = this.height * this.length * this.depth;

        return tmp;
    }
    public void setPosition(IPosition position){
        this.position = position;
    }

    @Override
    public String toString() {
        return "Item{" +
                "reference='" + reference + '\'' +
                ", depth=" + depth +
                ", color=" + color +
                ", length=" + length +
                ", description='" + description + '\'' +
                ", colorEdge=" + colorEdge +
                ", heigth=" + height +
                ", volume=" + volume +
                '}';
    }


}
