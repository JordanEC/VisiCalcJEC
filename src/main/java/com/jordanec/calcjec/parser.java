
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Oct 26 08:55:45 CST 2016
//----------------------------------------------------

package com.jordanec.calcjec;

import java_cup.runtime.*;
import com.jordanec.calcjec.operations.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Oct 26 08:55:45 CST 2016
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\004\000\002\002" +
    "\005\000\002\002\005\000\002\002\005\000\002\002\005" +
    "\000\002\002\004\000\002\002\005\000\002\002\004\000" +
    "\002\002\005\000\002\002\005\000\002\002\003\000\002" +
    "\002\003\000\002\002\003\000\002\002\003\000\002\002" +
    "\003\000\002\002\003\000\002\002\003\000\002\002\003" +
    "\000\002\002\006\000\002\002\006\000\002\002\003\000" +
    "\002\002\004\000\002\002\004\000\002\002\004\000\002" +
    "\002\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\042\004\004\005\012\011\016\013\015\015" +
    "\007\016\024\017\011\020\010\021\013\022\020\023\005" +
    "\024\017\025\014\026\006\027\023\032\021\001\002\000" +
    "\042\004\004\005\012\011\016\013\015\015\007\016\024" +
    "\017\011\020\010\021\013\022\020\023\005\024\017\025" +
    "\014\026\006\027\023\032\021\001\002\000\024\002\uffef" +
    "\004\uffef\005\uffef\006\uffef\007\uffef\010\uffef\014\uffef\024" +
    "\uffef\026\uffef\001\002\000\042\004\004\005\012\011\016" +
    "\013\015\015\007\016\024\017\011\020\010\021\013\022" +
    "\020\023\005\024\017\025\014\026\006\027\023\032\021" +
    "\001\002\000\024\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007" +
    "\ufff5\010\ufff5\014\ufff5\024\ufff5\026\ufff5\001\002\000\024" +
    "\002\ufff2\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\014" +
    "\ufff2\024\ufff2\026\ufff2\001\002\000\024\002\ufff3\004\ufff3" +
    "\005\ufff3\006\ufff3\007\ufff3\010\ufff3\014\ufff3\024\ufff3\026" +
    "\ufff3\001\002\000\042\004\004\005\012\011\016\013\015" +
    "\015\007\016\024\017\011\020\010\021\013\022\020\023" +
    "\005\024\017\025\014\026\006\027\023\032\021\001\002" +
    "\000\024\002\ufff1\004\ufff1\005\ufff1\006\ufff1\007\ufff1\010" +
    "\ufff1\014\ufff1\024\ufff1\026\ufff1\001\002\000\024\002\uffec" +
    "\004\uffec\005\uffec\006\uffec\007\uffec\010\uffec\014\uffec\024" +
    "\uffec\026\uffec\001\002\000\042\004\004\005\012\011\016" +
    "\013\015\015\007\016\024\017\011\020\010\021\013\022" +
    "\020\023\005\024\017\025\014\026\006\027\023\032\021" +
    "\001\002\000\042\004\004\005\012\011\016\013\015\015" +
    "\007\016\024\017\011\020\010\021\013\022\020\023\005" +
    "\024\017\025\014\026\006\027\023\032\021\001\002\000" +
    "\004\032\046\001\002\000\024\002\ufff0\004\ufff0\005\ufff0" +
    "\006\ufff0\007\ufff0\010\ufff0\014\ufff0\024\ufff0\026\ufff0\001" +
    "\002\000\030\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007\ufff6" +
    "\010\ufff6\012\043\014\ufff6\024\ufff6\026\ufff6\027\042\001" +
    "\002\000\020\002\034\004\027\005\026\006\031\007\032" +
    "\010\030\026\033\001\002\000\004\032\025\001\002\000" +
    "\024\002\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4" +
    "\014\ufff4\024\ufff4\026\ufff4\001\002\000\024\002\uffe9\004" +
    "\uffe9\005\uffe9\006\uffe9\007\uffe9\010\uffe9\014\uffe9\024\uffe9" +
    "\026\uffe9\001\002\000\042\004\004\005\012\011\016\013" +
    "\015\015\007\016\024\017\011\020\010\021\013\022\020" +
    "\023\005\024\017\025\014\026\006\027\023\032\021\001" +
    "\002\000\042\004\004\005\012\011\016\013\015\015\007" +
    "\016\024\017\011\020\010\021\013\022\020\023\005\024" +
    "\017\025\014\026\006\027\023\032\021\001\002\000\042" +
    "\004\004\005\012\011\016\013\015\015\007\016\024\017" +
    "\011\020\010\021\013\022\020\023\005\024\017\025\014" +
    "\026\006\027\023\032\021\001\002\000\042\004\004\005" +
    "\012\011\016\013\015\015\007\016\024\017\011\020\010" +
    "\021\013\022\020\023\005\024\017\025\014\026\006\027" +
    "\023\032\021\001\002\000\042\004\004\005\012\011\016" +
    "\013\015\015\007\016\024\017\011\020\010\021\013\022" +
    "\020\023\005\024\017\025\014\026\006\027\023\032\021" +
    "\001\002\000\024\002\uffea\004\uffea\005\uffea\006\uffea\007" +
    "\uffea\010\uffea\014\uffea\024\uffea\026\uffea\001\002\000\004" +
    "\002\000\001\002\000\024\002\ufffe\004\ufffe\005\ufffe\006" +
    "\ufffe\007\ufffe\010\030\014\ufffe\024\ufffe\026\033\001\002" +
    "\000\024\002\ufffd\004\ufffd\005\ufffd\006\ufffd\007\ufffd\010" +
    "\030\014\ufffd\024\ufffd\026\033\001\002\000\024\002\uffff" +
    "\004\uffff\005\uffff\006\uffff\007\uffff\010\uffff\014\uffff\024" +
    "\uffff\026\033\001\002\000\024\002\ufffa\004\ufffa\005\ufffa" +
    "\006\031\007\032\010\030\014\ufffa\024\ufffa\026\033\001" +
    "\002\000\024\002\ufffc\004\ufffc\005\ufffc\006\031\007\032" +
    "\010\030\014\ufffc\024\ufffc\026\033\001\002\000\024\002" +
    "\uffe8\004\uffe8\005\uffe8\006\uffe8\007\uffe8\010\uffe8\014\uffe8" +
    "\024\uffe8\026\uffe8\001\002\000\042\004\004\005\012\011" +
    "\016\013\015\015\007\016\024\017\011\020\010\021\013" +
    "\022\020\023\005\024\017\025\014\026\006\027\023\032" +
    "\021\001\002\000\024\002\ufff7\004\ufff7\005\ufff7\006\ufff7" +
    "\007\ufff7\010\ufff7\014\ufff7\024\045\026\033\001\002\000" +
    "\024\002\uffed\004\uffed\005\uffed\006\uffed\007\uffed\010\uffed" +
    "\014\uffed\024\uffed\026\uffed\001\002\000\004\012\047\001" +
    "\002\000\042\004\004\005\012\011\016\013\015\015\007" +
    "\016\024\017\011\020\010\021\013\022\020\023\005\024" +
    "\017\025\014\026\006\027\023\032\021\001\002\000\024" +
    "\002\uffee\004\uffee\005\uffee\006\uffee\007\uffee\010\uffee\014" +
    "\uffee\024\uffee\026\033\001\002\000\024\002\001\004\001" +
    "\005\001\006\001\007\001\010\001\014\001\024\001\026" +
    "\033\001\002\000\020\004\027\005\026\006\031\007\032" +
    "\010\030\014\053\026\033\001\002\000\024\002\ufff8\004" +
    "\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8\014\ufff8\024\ufff8" +
    "\026\ufff8\001\002\000\024\002\ufffb\004\ufffb\005\ufffb\006" +
    "\031\007\032\010\030\014\ufffb\024\ufffb\026\033\001\002" +
    "\000\024\002\uffeb\004\uffeb\005\uffeb\006\uffeb\007\uffeb\010" +
    "\uffeb\014\uffeb\024\uffeb\026\uffeb\001\002\000\024\002\ufff9" +
    "\004\ufff9\005\ufff9\006\031\007\032\010\030\014\ufff9\024" +
    "\ufff9\026\033\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\004\002\021\001\001\000\004\002\055\001" +
    "\001\000\002\001\001\000\004\002\054\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\002" +
    "\053\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\002\051\001\001\000\004\002\050\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\002\040\001\001\000\004\002\037\001\001\000\004" +
    "\002\036\001\001\000\004\002\035\001\001\000\004\002" +
    "\034\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\002\043" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\002\047\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public parser (java.io.Reader input) {
        super(new LexerAnalyser(input));
    }

    public void report_error(String message, Object info) {
        if (message.equals("Syntax error"))
            System.out.println(new VisiCalcJECException(VisiCalcJECException.syntaxError100).error);
    }

    public void report_fatal_error(String message, Object info) {
        if (!message.equals("Couldn't repair and continue parse"))
            report_error(message, info);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expr ::= IDENTIFIER BORR 
            {
              Expression RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expr ::= BORR IDENTIFIER 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr ::= expr CALC 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c, e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= CALC expr 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c, e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= LIST 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= IDENTIFIER ASSIGN expr DEFI 
            {
              Expression RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c, new Assignment(s, e)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= DEFI IDENTIFIER ASSIGN expr 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c, new Assignment(s, e)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= TERM 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= LIMP 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= VERS 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= HELP 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Command(c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= BOOLEAN 
            {
              Expression RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean n = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Literal(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= FLOAT 
            {
              Expression RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Float n = (Float)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Literal(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= NUMBER 
            {
              Expression RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Literal(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= IDENTIFIER 
            {
              Expression RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Identifier(s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= IDENTIFIER ASSIGN expr 
            {
              Expression RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Assignment(s, e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= LEFT_PAREN expr RIGHT_PAREN 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= SUM expr 
            {
              Expression RESULT =null;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Sum(new Literal(0), e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr SUM expr 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Sum(e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= SUBTRACTION expr 
            {
              Expression RESULT =null;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Subtraction(new Literal(0), e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr SUBTRACTION expr 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Subtraction(e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr MULTIPLICATION expr 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Multiplication(e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr DIVISION expr 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Division(e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= expr POW expr 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Pow(e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expression start_val = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr ::= SQUARE_ROOT expr 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new SquareRoot(e1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

