package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/10/16.
 */
public abstract class Expression<T> {
    public abstract T eval(Environment e) throws VisiCalcJECException;
}