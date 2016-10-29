package com.jordanec.calcjec;

import com.jordanec.calcjec.operations.*;
import java_cup.runtime.*;
import java.io.*;

public class Main {
    public static void main(String args[]){
        //createLexicAnalyser();
        //example();
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);
        Environment env = new Environment();
        try {
            VisiCalcJEC.eval(env, "vers", false);
            do{
                System.out.println("Ingrese una instrucción o 'help' para mostrar la ayuda:");
            }while(!VisiCalcJEC.eval(env, buffer.readLine(), false));

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }

    private static void createLexicAnalyser(){
        String[] lexic = {"lexic.flex"};
        try {
            jflex.Main.main(lexic);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.exit(0);
    }

    private static void example(){
        String pow1 = "5^2";
        String pow2 = "5.2^2";
        String pow3 = "5^2.3";
        String pow4 = "5.3^2.4";
        String sqr1 = "#10";
        String sqr2 = "#10.5";
        String assi1 = "var1=50";
        String assi2 = "var1";
        String assi3 = "var2";
        String bool1 = "true";
        String bool2 = "false";
        String bool3 = "var3=true";
        String bool4 = "var3";
        String defi1 = "abc=5";
        String defi2 = "defi hij=10";
        String defi3 = "xyz=15 defi";
        String ver_defi1 = "abc";
        String ver_defi2 = "hij";
        String ver_defi3 = "xyz";
        String calc1 = "calc 5+20";
        String calc2 = "8/5 calc";
        String calc3 = "75*5";
        String calc4 = "7^2";
        String calc5 = "#60.54";
        String calc6 = "4*8+(7-2.2)/4";
        String calc7 = "75*2+#5 - 5^5";
        String calc8 = "75/0";

        String expresiones[] = {
                pow1, pow2, pow3, pow4,
                sqr1, sqr2,
                assi1, assi2, assi3,
                bool1, bool2, bool3, bool4,
                defi1, defi2, defi3,
                ver_defi1, ver_defi2, ver_defi3,
                calc1, calc2, calc3, calc4, calc5, calc6, calc7, calc8
        };
        Environment env = new Environment();
        VisiCalcJEC.eval(env, "vers", false);
        for (String exp : expresiones) {
            System.out.println("----------------------\n"+exp);
            VisiCalcJEC.eval(env, exp, false);
        }
        VisiCalcJEC.eval(env, "limp", true);
        System.exit(0);
    }
}