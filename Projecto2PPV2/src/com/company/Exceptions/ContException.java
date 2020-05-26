package com.company.Exceptions;

import order.exceptions.ContainerException;

public class ContException extends ContainerException {
    public ContException() {
    }

    public ContException(String msg) {
        super(msg);
    }
}
