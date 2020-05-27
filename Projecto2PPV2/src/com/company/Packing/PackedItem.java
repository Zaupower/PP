package com.company.Packing;

import order.packing.Color;
import order.packing.IItem;
import order.packing.IItemPacked;
import order.packing.IPosition;

public class PackedItem implements IItemPacked {
    private String reference;
    private int depth;
    private Color color;
    private int x;
    private int length;
    private int y;
    private String description;
    private int z;
    private Color colorEdge;
    private int height;
    private transient IItem iItem;
    private transient IPosition position;

    public PackedItem() {
    }

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
        this.x = position.getX();
        this.y = position.getY();
        this.z = position.getZ();
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
