package com.company.Exceptions;

import order.exceptions.PositionException;

public class PosException extends PositionException {
    public PosException(String m) {
        super(m);
    }
}
