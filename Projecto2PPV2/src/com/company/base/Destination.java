package com.company.base;

import order.base.IAddress;
import order.base.ICustomer;

/**
 * Classe que define os parametros do destinatario
 */
public class Destination implements ICustomer {
    private IAddress address;
    private String name;

    /**
     * Construtor de Destination
     * @param address
     * @param name
     */
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

    /**
     *
     * @return Address
     */
    @Override
    public IAddress getAddress() {
        return this.address;
    }

    /**
     *
     * @return Destination Name
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param iAddress
     */
    @Override
    public void setAddress(IAddress iAddress) {

        this.address = iAddress;
    }

    @Override
    public void setName(String s) {

        this.name = s;
    }
}
