package com.company;

import com.company.base.Customer;
import com.company.base.Destination;
import com.company.packing.Container;
import order.base.OrderStatus;

public class Order {
    int orderId;
    Destination destination;
    Container[] containers;
    OrderStatus status;
    Customer customer;

    public Order(int orderId, Destination destination, Container[] containers, OrderStatus status, Customer customer) {
        this.orderId = orderId;
        this.destination = destination;
        this.containers = containers;
        this.status = status;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Container[] getContainers() {
        return containers;
    }

    public void setContainers(Container[] containers) {
        this.containers = containers;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
