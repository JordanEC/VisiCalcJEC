package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

/**
 * Created by jordan on 10/26/16.
 */
public class Relational extends Expression{
    private Expression left, right;
    private String operation;

    public Relational(Expression l, Expression r, String o) {
        left = l;
        right = r;
        operation = o;
    }

    @Override
    public Object eval(Environment e) throws VisiCalcJECException {
        Object leftVal = left.eval(e);
        Object rightVal = right.eval(e);

        int leftInt, rightInt;
        float leftFloat, rightFloat;

        if (leftVal instanceof Integer && rightVal instanceof Integer) {
            leftInt = (Integer) leftVal;
            rightInt =(Integer) rightVal;
            return selectOperation(leftInt, rightInt);
        }
        else {
            if (leftVal instanceof Integer && rightVal instanceof Float) {
                leftInt = (Integer) leftVal;
                rightFloat = (Float) rightVal;
                return selectOperation(leftInt, rightFloat);
            } else
            if (leftVal instanceof Float && rightVal instanceof Integer) {
                leftFloat = (Float) leftVal;
                rightInt = (Integer) rightVal;
                return selectOperation(leftFloat, rightInt);
            }
            else
            if (leftVal instanceof Float && rightVal instanceof Float) {
                leftFloat = (Float) leftVal;
                rightFloat = (Float) rightVal;
                return selectOperation(leftFloat, rightFloat);
            }
        }
        throw new VisiCalcJECException(VisiCalcJECException.syntaxError100);
    }

    private Object selectOperation(float leftFloat, float rightFloat){
        if (operation.equals("<"))
            return leftFloat < rightFloat;
        if (operation.equals(">"))
            return leftFloat > rightFloat;
        if (operation.equals("<="))
            return leftFloat <= rightFloat;
        if (operation.equals(">="))
            return leftFloat >= rightFloat;
        if (operation.equals("<>"))
            return leftFloat != rightFloat;
        if (operation.equals("=="))
            return leftFloat == rightFloat;
        return null;
    }

}
