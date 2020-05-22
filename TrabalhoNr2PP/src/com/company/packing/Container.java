package com.company.packing;

import order.exceptions.ContainerException;
import order.exceptions.PositionException;
import order.packing.*;

import java.util.Arrays;

public class Container implements IContainer {

    //contador de posicao atual
    transient int counter= 0;
    //Array Size nao passa para json por ser transient
    transient final int SIZE = 5;
    //
     int volume;
     String reference;
     int depth;
     Color color;
     int length;
     int height;
     Color colorEdge;
     Item[] items;

    public Container(int volume, String reference, int depth, Color color, int length, int height, Color colorEdge, IItem[] items) {
        this.volume = volume;
        this.reference = reference;
        this.depth = depth;
        this.color = color;
        this.length = length;
        this.height = height;
        this.colorEdge = colorEdge;
        this.items = new  Item[SIZE];
    }

    @Override
    public boolean addItem(IItem iItem, IPosition iPosition, Color color) throws ContainerException {
        boolean test = true;
        if (counter == 0){

            items[counter] = (Item) iItem;

            counter++;
        }else if(counter < SIZE && counter != 0 ){
            items[counter] = (Item) iItem;
            counter++;
        }else {
            test= false;
            System.out.println("Posicao Invalida");
        }
        return test;
    }

    @Override
    public boolean removeItem(IItem iItem) throws ContainerException {
        int rmIndex =0;
        boolean test = false;

        /**
         *  Verificar se existe o elemento e guardar a posicao
         */
        for (int i=0; i<counter;i++){
            System.out.println(items[i].getReference());
            System.out.println(iItem.getReference());
            if(items[i].getReference().equals(iItem.getReference())){
             rmIndex = i;
             test =true;
            }
        }

        int j;

        /**
         * mover os elementos seguintes para a posicao anterior
         */
        for (j = rmIndex; j < items.length - 1 && items[j] != null; j++) {
            items[j] = items[j + 1];
        }
        items[j] = null;

        for (j = 0; j < items.length - 1 && items[j] != null; j++) {
            System.out.println(items[j]);
        }

        return test;
    }

    @Override
    public void validate() throws ContainerException, PositionException {

    }

    @Override
    public void close() throws ContainerException, PositionException {

    }

    @Override
    public IItem getItem(String s) {
        IItem tmp = null;
        for (int i=0; i<items.length;i++){
            if(items[i].getReference().equals(s)){
                tmp = items[i];
            }
        }
        return tmp;
    }

    @Override
    public int getOccupiedVolume() {
        int tmp = 0;
        for (int i=0; i<items.length;i++){
            tmp =+ items[i].getVolume();
        }
        return tmp;
    }

    @Override
    public IItemPacked[] getPackedItems() {
        return new IItemPacked[0];
    }

    @Override
    public String getReference() {
        return null;
    }

    @Override
    public int getNumberOfItems() {
        return counter;
    }

    @Override
    public int getRemainingVolume() {
        return 0;
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public int getDepth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getLenght() {
        return 0;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Container{" +
                "SIZE=" + SIZE +
                ", volume=" + volume +
                ", reference='" + reference + '\'' +
                ", depth=" + depth +
                ", color=" + color +
                ", length=" + length +
                ", colorEdge=" + colorEdge +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
