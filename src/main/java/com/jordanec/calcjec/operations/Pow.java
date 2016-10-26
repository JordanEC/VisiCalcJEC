package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/10/16.
 */
public class Pow extends Expression{
    Expression left;
    Expression right;

    public Pow(Expression l, Expression r) {
        left = l;
        right = r;
    }

    public Object eval(Environment e) throws VisiCalcJECException {
        Object leftVal = left.eval(e);
        Object rightVal = right.eval(e);
        int leftInt, rightInt;
        float leftFloat, rightFloat;
        double result;

        if (leftVal instanceof Integer && rightVal instanceof Integer) {
            leftInt = (Integer) leftVal;
            rightInt =(Integer) rightVal;
            result = Math.pow(leftInt, rightInt);
            if (Double.isInfinite(result))
                throw new VisiCalcJECException(VisiCalcJECException.mathError105);
            if (result % 1 == 0)
                return Math.round((float)result);
            else
                return result;
        }
        else {
            if (leftVal instanceof Integer && rightVal instanceof Float) {
                leftInt = (Integer) leftVal;
                rightFloat = (Float) rightVal;
                result = Math.pow(leftInt, rightFloat);
                if (Double.isInfinite(result))
                    throw new VisiCalcJECException(VisiCalcJECException.mathError105);
                if (result % 1 == 0)
                    return Math.round((float)result);
                else
                    return (float)result;
            } else
            if (leftVal instanceof Float && rightVal instanceof Integer) {
                leftFloat = (Float) leftVal;
                rightInt = (Integer) rightVal;
                result = Math.pow(leftFloat, rightInt);
                if (Double.isInfinite(result))
                    throw new VisiCalcJECException(VisiCalcJECException.mathError105);
                if (result % 1 == 0)
                    return Math.round((float)result);
                else
                    return (float)result;
            }
            else
            if (leftVal instanceof Float && rightVal instanceof Float) {
                leftFloat = (Float) leftVal;
                rightFloat = (Float) rightVal;
                result = Math.pow(leftFloat, rightFloat);
                if (Double.isInfinite(result))
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