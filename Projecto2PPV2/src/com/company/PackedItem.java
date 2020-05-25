package com.company;

import order.packing.Color;
import order.packing.IItem;
import order.packing.IItemPacked;
import order.packing.IPosition;

public class PackedItem implements IItemPacked {
    Color color;
    IItem iItem;
    IPosition position;

    public PackedItem(Color color, IItem iItem, IPosition position) {
        this.color = color;
        this.iItem = iItem;
        this.position = position;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public IItem getItem() {
        return this.iItem;
    }

    @Override
    public IPosition getPosition() {
        return this.position;
    }

    @Override
    public void setColor(Color color) {

        this.color = color;
    }

    @Override
    public void setPosition(IPosition iPosition) {

        this.position = iPosition;
    }

    @Override
    public String toString() {
        return "PackedItem{" +
                "color=" + color +
                ", iItem=" + iItem +
                ", position=" + position +
                '}';
    }
}
