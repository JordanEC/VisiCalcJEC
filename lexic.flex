package com.jordanec.calcjec;
/**
* Created by jordan on 10/10/16.
*/
import java_cup.runtime.*;
import com.jordanec.calcjec.operations.*;

%%

%class LexerAnalyser
%unicode
%cup
%line
%column
%ignorecase


%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {

        return new Symbol(type, yyline, yycolumn, value);
    }

%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace    = {LineTerminator} | [ \t\f]
Digit          = [0-9]
Number         = {Digit} {Digit}*
Float          = [0-9]+\.[0-9]+
Letter         = [a-zA-Z]
Boolean        = true|false
Identifier     = {Letter} ({Letter}|{Digit})*
Relational     = <|>|<=|>=|<>|==

%%

<YYINITIAL> {
    /*Tarea 1*/
    "hel"           { return symbol(sym.HELP, yytext()); }
    "ver"           { return symbol(sym.VERS, yytext()); }
    "lim"           { return symbol(sym.LIMP, yytext()); }
    "ter"           { return symbol(sym.TERM, yytext()); }
    /*Tarea 2*/
    "def"           { return symbol(sym.DEFI, yytext()); }
    "lis"           { return symbol(sym.LIST, yytext()); }
    /*Tarea 3*/
    "cal"           { return symbol(sym.CALC, yytext()); }
    /*Tarea 4*/
    "bor"           { return symbol(sym.BORR, yytext()); }
    "gra"           { return symbol(sym.GRAB, yytext()); }
    /*Proy*/
    "val"           { return symbol(sym.VALI, yytext()); }
    /*-*/
    "help"          { return symbol(sym.HELP, yytext()); }
    "vers"          { return symbol(sym.VERS, yytext()); }
    "limp"          { return symbol(sym.LIMP, yytext()); }
    "term"          { return symbol(sym.TERM, yytext()); }
    "defi"          { return symbol(sym.DEFI, yytext()); }
    "list"          { return symbol(sym.LIST, yytext()); }
    "calc"          { return symbol(sym.CALC, yytext()); }
    "borr"          { return symbol(sym.BORR, yytext()); }
    "grab"          { return symbol(sym.GRAB, yytext()); }
    "vali"           { return symbol(sym.VALI, yytext()); }
    {Number}        { return symbol(sym.NUMBER, new Integer(Integer.parseInt(yytext()))); }
    {Float}         { return symbol(sym.FLOAT, new Float(Float.parseFloat(yytext()))); }
    {Boolean}       { return symbol(sym.BOOLEAN, new Boolean(Boolean.parseBoolean(yytext()))); }
    {Identifier}    { return symbol(sym.IDENTIFIER, yytext()); }
    "+"             { return symbol(sym.SUM); }
    "-"             { return symbol(sym.SUBTRACTION); }
    "*"             { return symbol(sym.MULTIPLICATION); }
    "/"             { return symbol(sym.DIVISION); }
    "^"             { return symbol(sym.POW); }
    "#"             { return symbol(sym.SQUARE_ROOT); }
    "("             { return symbol(sym.LEFT_PAREN); }
    ")"             { return symbol(sym.RIGHT_PAREN); }
    "="             { return symbol(sym.ASSIGN); }
    {Relational}    { return symbol(sym.RELATIONAL, yytext()); }
    "?"             { return symbol(sym.CONDITIONAL); }
    {WhiteSpace}    { }
}

[^]            { throw new VisiCalcJECException(VisiCalcJECException.lexicError102);}