package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/10/16.
 */
public class Division extends Expression{
    Expression left;
    Expression right;

    public Division(Expression l, Expression r) {
        left = l;
        right = r;
    }

    public Object eval(Environment e) throws VisiCalcJECException {
        Object leftVal = left.eval(e);
        Object rightVal = right.eval(e);
        int leftInt, rightInt;
        float leftFloat, rightFloat;
        float result;
        try {
            if (leftVal instanceof Integer && rightVal instanceof Integer) {
                leftInt = (Integer) leftVal;
                rightInt = (Integer) rightVal;
                result = (float)leftInt / rightInt;
                if (Float.isInfinite(result))
                    throw new VisiCalcJECException(VisiCalcJECException.divisionByZeroError104);
                if (result % 1 == 0)
                    return Math.round(result);
                else
                    return result;
            } else {
                if (leftVal instanceof Integer && rightVal instanceof Float) {
                    leftInt = (Integer) leftVal;
                    rightFloat = (Float) rightVal;
                    result = (float)leftInt / rightFloat;
                    if (Float.isInfinite(result))
                        throw new VisiCalcJECException(VisiCalcJECException.divisionByZeroError104);
                    if (result % 1 == 0)
                        return Math.round(result);
                    else
                        return result;
                } else if (leftVal instanceof Float && rightVal instanceof Integer) {
                    leftFloat = (Float) leftVal;
                    rightInt = (Integer) rightVal;
                    result = leftFloat / rightInt;
                    if (Float.isInfinite(result))
                        throw new VisiCalcJECException(VisiCalcJECException.divisionByZeroError104);
                    if (result % 1 == 0)
                        return Math.round(result);
                    else
                        return result;
                } else if (leftVal instanceof Float && rightVal instanceof Float) {
                    leftFloat = (Float) leftVal;
                    rightFloat = (Float) rightVal;
                    result = leftFloat / rightFloat;
                    if (Float.isInfinite(result))
                        throw new VisiCalcJECException(VisiCalcJECException.divisionByZeroError104);
                    if (result % 1 == 0)
                        return Math.round(result);
                    else
                        return result;
                }
            }
        }catch (ArithmeticException er){
            if (er.getMessage().equals("/ by zero"))
                throw new VisiCalcJECException(VisiCalcJECException.divisionByZeroError104);
            return "";
        }
        throw new VisiCalcJECException(VisiCalcJECException.syntaxError100);
    }
}
