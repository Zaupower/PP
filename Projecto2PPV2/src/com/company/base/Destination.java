package com.company.base;

import order.base.IAddress;
import order.base.ICustomer;

public class Destination implements ICustomer {
    IAddress address;
    String name;

    public Destination(IAddress address, String name) {
        this.address = address;
        this.name = name;
    }

    @Override
    public IAddress getBillingAddress() {
        return null;
    }

    @Override
    public int getCustomerId() {
        return 0;
    }

    @Override
    public void setBillingAddress(IAddress iAddress) {

    }

    @Override
    public IAddress getAddress() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setAddress(IAddress iAddress) {

    }

    @Override
    public void setName(String s) {

    }
}
