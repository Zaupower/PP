package com.company.Packing;

import order.packing.Color;
import order.packing.IItem;
import order.packing.IItemPacked;
import order.packing.IPosition;

public class PackedItem implements IItemPacked {
    String reference;
    int depth;
    Color color;
    int x;
    int length;
    int y;
    String description;
    int z;
    Color colorEdge;
    int height;
    transient IItem iItem;
    transient IPosition position;

    public PackedItem(Color color, IItem iItem, IPosition position) {
        this.reference = iItem.getReference();
        this.depth = iItem.getDepth();
        this.color = color;
        this.x = position.getX();
        this.length = iItem.getLenght();
        this.y = position.getY();
        this.description = iItem.getDescription();
        this.z = position.getZ();
        this.colorEdge = color;
        this.height = iItem.getHeight();

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
