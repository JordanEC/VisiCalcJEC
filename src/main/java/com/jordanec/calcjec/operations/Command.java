package com.jordanec.calcjec.operations;

import com.jordanec.calcjec.VisiCalcJECException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jordan on 10/11/16.
 */
public class Command extends Expression{

    private String c;
    private Expression exp;
    private Identifier id;

    public Command(String c){
        this.c = c;
    }

    public Command(String c, Expression exp){
        this.c = c;
        this.exp = exp;
    }

    public Command(String c, Identifier id){
        this.c = c;
        this.id = id;
    }

    public String getC() {
        return c;
    }

    public Object eval(Environment e) throws VisiCalcJECException{
        Object val = null;
        //Tarea1
        if (c.toLowerCase().startsWith("hel"))
            return help();
        if (c.toLowerCase().startsWith("ver"))
            return vers();
        if (c.toLowerCase().startsWith("lim"))
            return limp();
        if (c.toLowerCase().startsWith("ter"))
            return term();
        //Tarea2
        if (c.toLowerCase().startsWith("def"))
            val = exp.eval(e);
        if (c.toLowerCase().startsWith("lis"))
            return list(e);
        //Tarea3
        if (c.toLowerCase().startsWith("cal"))
            val = exp.eval(e);
        //Tarea4
        if (c.toLowerCase().startsWith("bor"))
            return borr(e);
        if (c.toLowerCase().startsWith("gra"))
            return grab(e);
        return val;
    }

    private String help(){
        return "\nComandos disponibles:" +
               "\nhelp: mostrar ayuda." +
               "\nvers: mostrar versión del programa." +
               "\nlimp: limpiar la pantalla." +
               "\nterm: finalizar la aplicación." +
               "\ndefi: definir una variable." +
               "\nlist: listar variables definidas." +
               "\ncalc: calcula el resultado de una expresión aritmética." +
               "\n -Operaciones soportadas:" +
               "\n  + (Suma)           Ejemplos: 10+20  5.4+75" +
               "\n  - (Resta)          Ejemplos: 10-20  75.4-4.1" +
               "\n  * (Multiplicación) Ejemplos: 4*20  7.4*7.5" +
               "\n  / (División)       Ejemplos: 10/20  75.5/2" +
               "\n  ^ (Potencia)      Ejemplos: 5^8  4.5^5" +
               "\n  # (Raíz cuadrada) Ejemplos: #20  #7" +
               "\n () (Paréntesis)    Ejemplos: 7*(5+5)  10/(5-1)" +
               "\nborr: borra una variable previamente definida." +
               "\ngrab: guarda el último valor calculado en una variable." +
               "\nvali: calcula el resultado de una expresión lógica." +
               "\n -Operaciones soportadas:" +
               "\n  < (Menor que)         Ejemplos: 5<50?  4.5*4<16?" +
               "\n  > (Mayor que)         Ejemplos: 5>50?  4.5*4>16?" +
               "\n <= (Menor o igual que) Ejemplos: 5<=50?  4.5<=4.6?" +
               "\n >= (Mayor o igual que) Ejemplos: 5>=50?  4.5*4>=16?" +
               "\n <> (Distinto que)      Ejemplos: 5<>5?  5.5<>5.6?" +
               "\n == (Igual que)         Ejemplos: 5==5?  4.5*4==16?\n";
    }

    private String vers(){
        return "\n*********************************************" +
               "\n*      Universidad Estatal a Distancia      *" +
               "\n*  Escuela de Ciencias Exactas y Naturales  *" +
               "\n*      Cátedra Tecnología de Sistemas       *" +
               "\n*            Compiladores (3307)            *" +
               "\n*            CalcJEC Versión 1              *" +
               "\n*                  Proyecto                 *" +
               "\n*          Jordan Espinoza Calderón         *" +
               "\n*          Tercer Cuatrimestre 2016         *" +
               "\n*********************************************\n";
    }

    private String limp(){
        return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    }

    private Boolean term(){
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        while (true) {
            try {
                System.out.println("¿Desea finalizar el programa? (s/n)");
                String resp = in.readLine();
                if (resp.equalsIgnoreCase("s"))
                    return true;
                else if (resp.equalsIgnoreCase("n"))
                    return false;
                throw new VisiCalcJECException(VisiCalcJECException.opcInvError101);
            } catch (IOException e) {
                e.printStackTrace();
            }
            catch (VisiCalcJECException e2){
                System.out.println(e2.error);
            }

        }
    }

    private String list(Environment e){
        e.print();
        return "\n";
    }

    private String borr(Environment e) throws VisiCalcJECException {
        if (e.remove(id))
            return "Variable " +id+" borrada.\n";
        else
            throw new VisiCalcJECException(VisiCalcJECException.varNotDefinedError103);
    }

    private String grab(Environment e) throws VisiCalcJECException {
        if (e.getLastValue() == null)
            throw new VisiCalcJECException(VisiCalcJECException.lastResultNotFound106);

        Object o = e.check(id.toString());

        if (o != null && o.getClass() != e.getLastValue().getClass())
            throw new VisiCalcJECException(VisiCalcJECException.varTypeError107);

        Assignment a = new Assignment(id.toString(), new Literal(e.getLastValue()));
        a.eval(e);
        return "";
    }
}
