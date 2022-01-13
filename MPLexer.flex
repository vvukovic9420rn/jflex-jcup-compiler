// import section
import java_cup.runtime.*;

%%
// declaration section
%class MPLexer

%cup

%line
%column

%eofval{
	return new Symbol( sym.EOF );
%eofval}

%{
   public int getLine()
   {
      return yyline;
   }
%}


//states
%state COMMENT
//macros
letter = [a-zA-Z]
digit = [0-9]
sys16 = [0-9A-F]
sys8 = [0-7]

%%
// rules section
\*\*			{ yybegin( COMMENT ); }
<COMMENT>\*\*	{ yybegin( YYINITIAL ); }
<COMMENT>.		{ ; }

[\t\r\n ]		{ ; }

//operators
\+				{ return new Symbol(sym.PLUS); }
-               { return new Symbol(sym.MINUS); }
\*				{ return new Symbol(sym.MUL); }
\/              { return new Symbol(sym.DIV); }
"mod"           { return new Symbol(sym.MOD); }

//separators
;				{ return new Symbol(sym.SEMI);}
,				{ return new Symbol(sym.COMMA);}
=				{ return new Symbol(sym.ASSIGN);}
\(				{ return new Symbol(sym.LEFTPAR);}
\)				{ return new Symbol(sym.RIGHTPAR);}

//keywords
"program"		{ return new Symbol( sym.PROGRAM );}
"begin"			{ return new Symbol( sym.BEGIN );}
"end"			{ return new Symbol( sym.END );}

"int"           { return new Symbol(sym.INT); }
"char"			{ return new Symbol(sym.CHAR);}
"real"          { return new Symbol(sym.REAL); }

"for"           { return new Symbol(sym.FOR); }
"to"            { return new Symbol(sym.TO); }
"downto"        { return new Symbol(sym.DOWNTO); }
"by"            { return new Symbol(sym.BY); }
"read"          {return new Symbol(sym.READ); }
"write"         {return new Symbol(sym.WRITE); }



//id-s
{letter}({letter}|{digit})*	  { return new Symbol( sym.ID, yyline, yytext() ); }

//constants
\'[^]\'			{ return new Symbol(sym.CHARCONST, new Character(yytext().charAt(1))); }

{digit}+		{ return new Symbol(sym.INTCONST, new Integer(yytext())); }
0x{sys16}+      { return new Symbol(sym.INTCONST, new Integer(yytext())); }
0{sys8}+        { return new Symbol(sym.INTCONST, new Integer(yytext())); }

{digit}+\.{digit}+(E[+\-]{digit}+)?      { return new Symbol(sym.REALCONST, new Double(yytext())); }
\.{digit}+(E[+\-]{digit}+)?              { return new Symbol(sym.REALCONST, new Double(yytext())); }

//error symbol
.		{ System.out.println( "ERROR: " + yytext() ); }

