package com.company.base;

import order.base.IAddress;

/**
 * Classe que define os detalhes do destino da encomenda
 */
public class Destination {
    IAddress address;
    String name;

    public Destination(IAddress address, String name) {
        this.address = address;
        this.name = name;
    }
}
