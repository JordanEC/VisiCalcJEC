package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/10/16.
 */
public class Assignment extends Expression {
    private String left;
    private Expression right;

    public Assignment(String s, Expression e) {
        left = s;
        right = e;
    }

    public Object eval(Environment e) throws VisiCalcJECException {
        Object val;
        if (right.eval(e) == null)
            if(right.toString().equals("true") || right.toString().equals("false"))
                val = Boolean.parseBoolean(right.toString());
            else
                val = right.eval(e);
        else
            val = right.eval(e);
        e.set(left, val);
        return val;
    }
}
