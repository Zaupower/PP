package com.company.Exceptions;

import order.exceptions.OrderException;

public class OrdeException extends OrderException {
    public OrdeException() {
    }

    public OrdeException(String msg) {
        super(msg);
    }
}

