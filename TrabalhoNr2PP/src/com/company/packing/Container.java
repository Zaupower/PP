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
    //Boolean para verificar se o Container esta aberto
    transient boolean close = false;
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
        Item itemT = (Item) iItem;
        itemT.setPosition(iPosition);
        iItem.getVolume();
            if(itemT.getVolume()< getOccupiedVolume()) {
                for (int i = 0; i < items.length; i++) {
                    if (items[i] == null) {
                        items[i] = (Item) iItem;

                        ++counter;
                        return true;
                    }
                }
        }
        return false;
    }


    @Override
    public boolean removeItem(IItem iItem) throws ContainerException {
        int rmIndex =0;
        boolean test = false;

        /**
         *  Verificar se existe o elemento e guardar a posicao
         */
        for (int i=0; i<counter && items[i] != null; i++){
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

        this.close = true;
    }

    @Override
    public IItem getItem(String s) {
        IItem tmp = null;
        for (int j = 0; j < items.length - 1 && items[j] != null; j++){
            if(items[j].getReference().equals(s)){
                tmp = items[j];
            }
        }
        return tmp;
    }

    @Override
    public int getOccupiedVolume() {
        int tmp = 0;
        for (int i=0; i<items.length && items[i] != null; i++){
            tmp =+ items[i].getVolume();
        }
        return tmp;
    }

    @Override
    public IItemPacked[] getPackedItems() {
        return new IItemPacked[0];
    }

    /**
     * Retorna a referencia do Container
     * @return
     */
    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public int getNumberOfItems() {
        return counter;
    }

    /**
     * Retorna a difenrca de volume total e volume total ocupado
     * @return
     */
    @Override
    public int getRemainingVolume() {
        return volume - getOccupiedVolume();
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
