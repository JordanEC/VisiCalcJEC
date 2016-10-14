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
            VisiCalcJEC.eval(env, "vers");
            do{
                System.out.println("Ingrese una instrucción o 'help' para mostrar la ayuda:");
            }while(!VisiCalcJEC.eval(env, buffer.readLine()));

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
        String help = "help";
        String hel = "hel";
        String HELP = "HELP";
        String expresiones[] = {
                //pow1, pow2, pow3, pow4,
                //sqr1, sqr2,
                //assi1, assi2, assi3,
                //bool1, bool2, bool3, bool4,
                //defi1, defi2, defi3,
                //ver_defi1, ver_defi2, ver_defi3
                //help, hel, HELP
        };
        Environment env = new Environment();
        try {
            for (String expresion:expresiones) {
                parser p = new parser(new LexerAnalyser(new StringReader(expresion)));
                Symbol s = p.parse();
                Expression exp = (Expression) s.value;
                System.out.println("\nResult = " + exp.eval(env));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}