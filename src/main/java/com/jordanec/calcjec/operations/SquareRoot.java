package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/10/16.
 */
public class SquareRoot extends Expression{
    Expression right;

    public SquareRoot(Expression r) {
        right = r;
    }

    public Object eval(Environment e) throws VisiCalcJECException {
        Object rightVal = right.eval(e);
        int rightInt;
        float rightFloat;
        double result;

        if (rightVal instanceof Integer) {
            rightInt =(Integer) rightVal;
            result = Math.sqrt(rightInt);
            if (Double.isInfinite(result) || Double.isNaN(result))
                throw new VisiCalcJECException(VisiCalcJECException.mathError105);
            if (result % 1 == 0)
                return Math.round((float)result);
            else
                return (float)result;
        }
        else {
            if (rightVal instanceof Float) {
                rightFloat = (Float) rightVal;
                result = Math.sqrt(rightFloat);
                if (Double.isInfinite(result) || Double.isNaN(result))
                    throw new VisiCalcJECException(VisiCalcJECException.mathError105);
                if (result % 1 == 0)
                    return Math.round((float)result);
                else
                    return (float)result;
            }
        }
        throw new VisiCalcJECException(VisiCalcJECException.syntaxError100);
    }

}
