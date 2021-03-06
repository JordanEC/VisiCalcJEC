package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/10/16.
 */
public class Sum extends Expression {
    Expression left;
    Expression right;

    public Sum(Expression l, Expression r) {
        left = l;
        right = r;
    }

    public Object eval(Environment e) throws VisiCalcJECException {
        Object leftVal = left.eval(e);
        Object rightVal = right.eval(e);
        int leftInt, rightInt;
        float leftFloat, rightFloat;

        if (leftVal instanceof Integer && rightVal instanceof Integer) {
            leftInt = (Integer) leftVal;
            rightInt =(Integer) rightVal;
            return leftInt + rightInt;
        }
        else {
            if (leftVal instanceof Integer && rightVal instanceof Float) {
                leftInt = (Integer) leftVal;
                rightFloat = (Float) rightVal;
                return leftInt + rightFloat;
            } else
            if (leftVal instanceof Float && rightVal instanceof Integer) {
                leftFloat = (Float) leftVal;
                rightInt = (Integer) rightVal;
                return leftFloat + rightInt;
            }
            else
            if (leftVal instanceof Float && rightVal instanceof Float) {
                leftFloat = (Float) leftVal;
                rightFloat = (Float) rightVal;
                return leftFloat + rightFloat;
            }
        }
        throw new VisiCalcJECException(VisiCalcJECException.syntaxError100);
    }
}
