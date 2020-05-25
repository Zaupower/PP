package com.company.ShippingOrder;

import order.base.ICustomer;
import order.base.IPerson;
import order.base.OrderStatus;
import order.exceptions.ContainerException;
import order.exceptions.OrderException;
import order.exceptions.PositionException;
import order.packing.IContainer;
import shippingorder.IShippingOrder;

public class ShippingOrder implements IShippingOrder {
    @Override
    public boolean addContainer(IContainer iContainer) throws OrderException, ContainerException {
        return false;
    }

    @Override
    public boolean removeContainer(IContainer iContainer) throws OrderException, ContainerException {
        return false;
    }

    @Override
    public boolean existsContainer(IContainer iContainer) {
        return false;
    }

    @Override
    public int findContainer(String s) {
        return 0;
    }

    @Override
    public IPerson getDestination() {
        return null;
    }

    @Override
    public void setDestination(IPerson iPerson) {

    }

    @Override
    public ICustomer getCustomer() {
        return null;
    }

    @Override
    public OrderStatus getStatus() {
        return null;
    }

    @Override
    public void setStatus(OrderStatus orderStatus) throws OrderException, ContainerException, PositionException {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public IContainer[] getContainers() {
        return new IContainer[0];
    }

    @Override
    public void validate() throws ContainerException, PositionException {

    }

    @Override
    public String summary() {
        return null;
    }
}
