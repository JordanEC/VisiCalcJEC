package com.jordanec.calcjec;

import com.jordanec.calcjec.operations.Command;
import com.jordanec.calcjec.operations.Environment;
import com.jordanec.calcjec.operations.Expression;
import com.jordanec.calcjec.operations.Literal;
import java_cup.runtime.Symbol;
import java.io.StringReader;

public class VisiCalcJEC {
    public static boolean eval(Environment env, String in, boolean forceExit){
        boolean exit = false;
            try {
                parser p = new parser(new LexerAnalyser(new StringReader(in)));
                Symbol s = p.parse();
                Expression exp = (Expression) s.value;
                Object val = null;
                if (exp != null)
                    val = exp.eval(env);
                if (val instanceof Boolean && exp instanceof Command && ((Command) exp).getC().toLowerCase().startsWith("ter")) {
                    if ((Boolean) val)
                        exit = true;
                } else {
                    System.out.println(val);
                    if (val instanceof Integer || val instanceof Float || val instanceof Boolean)
                        env.setLastValue(new Literal(val));
                }
            } catch (VisiCalcJECException e) {
                System.out.println(e.error);
            } catch (NullPointerException e) {
                System.out.print("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        return forceExit | exit;
    }
}