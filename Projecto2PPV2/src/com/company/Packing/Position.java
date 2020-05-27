package com.company.Packing;

import com.company.Exceptions.PosException;
import order.exceptions.PositionException;
import order.packing.IPosition;

public class Position implements IPosition {

    private int x;
    private int y;
    private int z;

    public Position() {
    }

    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getZ() {
        return this.z;
    }

    @Override
    public void setX(int i) throws PosException {
        if (i < 0) {
            throw new PosException("O Valor deve ser SUPERIOR a 0");
        } else {
            this.x = i;
        }


    }

    @Override
    public void setY(int i) throws PosException {
        if (i < 0) {
            throw new PosException("O Valor deve ser SUPERIOR a 0");
        } else {
            this.y = i;
        }
    }

    @Override
    public void setZ(int i) throws PosException {
        if (i < 0) {
            throw new PosException("O Valor deve ser SUPERIOR a 0");
        } else {
            this.z = i;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                "} " + super.toString();
    }
}
