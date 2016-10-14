package com.jordanec.calcjec;


import java.util.HashMap;
import java.util.Map;

public class VisiCalcJECException extends Exception {
    public static int syntaxError100 = 100;
    public static int opcInvError101 = 101;
    public static int lexicError102 = 102;
    public static int varNotDefinedError103 = 103;
    public static int divisionByZeroError104 = 104;
    public static int mathError105 = 105;
    //...
    public String error;
    Map<Integer,String> errores = new HashMap<Integer, String>()
    {{
        put(syntaxError100, String.format("ERROR %d: Error de sintaxis.", syntaxError100));
        put(opcInvError101, String.format("ERROR %d: Opción inválida.", opcInvError101));
        put(lexicError102, String.format("ERROR %d: Error léxico, ingresó caracteres inválidos.", lexicError102));
        put(varNotDefinedError103, String.format("ERROR %d: Variable no definida.", varNotDefinedError103));
        put(divisionByZeroError104, String.format("ERROR %d: División por cero.", divisionByZeroError104));
        put(mathError105, String.format("ERROR %d: Error matemático.", mathError105));
        //...
    }};

    public String getErrorMessage(int error){
        return errores.get(error);
    }

    public VisiCalcJECException(int cod) {
        super("");
        error = errores.get(cod);
    }
}
