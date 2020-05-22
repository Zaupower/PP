package com.company.base;

import com.company.base.Address;
import order.base.IAddress;
import order.base.ICustomer;

public class Customer implements ICustomer {
    int costumerId;
    String name ;
    Address address ;
    Address billingAddress;

    public Customer(int costumerId, String name, Address address, Address billingAddress) {
        this.costumerId = costumerId;
        this.name = name;
        this.address = address;
        this.billingAddress = billingAddress;
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

    @Override
    public String toString() {
        return "Customer{" +
                "costumerId=" + costumerId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", billingAddress=" + billingAddress +
                '}';
    }
}
