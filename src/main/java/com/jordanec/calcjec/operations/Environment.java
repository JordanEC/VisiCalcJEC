package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;

import java.util.*;

/**
 * Created by jordan on 10/10/16.
 */
public class Environment {
    private HashMap<String,Object> map;

    public Environment() {
        map = new HashMap<String, Object>();
    }

    public Object lookup(String var) throws VisiCalcJECException {
        Object obj = map.get(var);
        if (obj == null)
            throw new VisiCalcJECException(VisiCalcJECException.varNotDefinedError103);
        return obj;
    }


    public void set(String var, Object val) {
        map.put(var, val);
    }

    public void print() {
        String format = "\n%-20s %-20s %-20s";
        System.out.printf(format, "Variable", "Tipo", "Valor");
        List<String> keys = new ArrayList(map.keySet());
        Collections.sort(keys);
        for (Object k: keys) {
            Object entry = map.get(k);
            System.out.printf(format, k,
                    getTypeName(entry.getClass().getName()),
                    entry);
        }
    }

    public String getTypeName(String s){
        String ENTERO = "java.lang.Integer";
        String REAL = "java.lang.Float";
        String LOGICO = "java.lang.Boolean";

        if (s.equals(ENTERO))
            return "Entero";
        if (s.equals(REAL))
            return "Real";
        if (s.equals(LOGICO))
            return "Lógico";
        return null;
    }

}
