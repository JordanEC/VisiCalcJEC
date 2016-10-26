package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/10/16.
 */
public class Identifier extends Expression{
    private String id;

    public Identifier(String s) {
        id = s;
    }

    public Object eval(Environment e) throws VisiCalcJECException{
        return e.lookup(id);
    }

    @Override
    public String toString() {
        return id;
    }
}
