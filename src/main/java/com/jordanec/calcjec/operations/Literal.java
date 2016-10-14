package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/10/16.
 */
public class Literal extends Expression {
    private Object val;

    public Literal(Object i) {
        val = i;
    }

    public Object eval(Environment e) throws VisiCalcJECException {
        return val;
    }
}