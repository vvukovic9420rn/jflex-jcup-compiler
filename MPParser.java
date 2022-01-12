
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Wed Jan 12 19:19:43 CET 2022
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import SymbolTable.*;

/** CUP v0.10k generated parser.
  * @version Wed Jan 12 19:19:43 CET 2022
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\045\000\002\003\005\000\002\002\004\000\002\004" +
    "\006\000\002\005\004\000\002\005\003\000\002\010\005" +
    "\000\002\012\005\000\002\012\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\006\004\000\002" +
    "\006\003\000\002\007\011\000\002\007\011\000\002\007" +
    "\004\000\002\007\007\000\002\007\007\000\002\007\003" +
    "\000\002\022\003\000\002\022\003\000\002\022\003\000" +
    "\002\013\005\000\002\014\005\000\002\014\003\000\002" +
    "\016\003\000\002\016\003\000\002\017\005\000\002\017" +
    "\003\000\002\020\003\000\002\020\003\000\002\020\003" +
    "\000\002\021\003\000\002\021\003\000\002\021\005\000" +
    "\002\015\005\000\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\111\000\004\004\005\001\002\000\004\002\113\001" +
    "\002\000\004\032\006\001\002\000\004\005\010\001\002" +
    "\000\004\002\001\001\002\000\010\007\016\010\015\011" +
    "\014\001\002\000\022\005\010\007\016\010\015\011\014" +
    "\012\027\016\025\017\034\032\033\001\002\000\004\032" +
    "\017\001\002\000\022\005\ufffd\007\ufffd\010\ufffd\011\ufffd" +
    "\012\ufffd\016\ufffd\017\ufffd\032\ufffd\001\002\000\004\032" +
    "\ufff7\001\002\000\004\032\ufff8\001\002\000\004\032\ufff9" +
    "\001\002\000\010\026\ufffa\030\ufffa\031\ufffa\001\002\000" +
    "\006\030\022\031\021\001\002\000\004\032\023\001\002" +
    "\000\022\005\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc\016" +
    "\ufffc\017\ufffc\032\ufffc\001\002\000\010\026\ufffb\030\ufffb" +
    "\031\ufffb\001\002\000\004\030\112\001\002\000\004\025" +
    "\106\001\002\000\016\005\uffef\006\uffef\012\uffef\016\uffef" +
    "\017\uffef\032\uffef\001\002\000\004\032\033\001\002\000" +
    "\016\005\010\006\072\012\027\016\025\017\034\032\033" +
    "\001\002\000\022\005\ufffe\007\ufffe\010\ufffe\011\ufffe\012" +
    "\ufffe\016\ufffe\017\ufffe\032\ufffe\001\002\000\016\005\ufff5" +
    "\006\ufff5\012\ufff5\016\ufff5\017\ufff5\032\ufff5\001\002\000" +
    "\004\027\067\001\002\000\004\025\035\001\002\000\014" +
    "\025\043\032\044\033\047\034\042\035\041\001\002\000" +
    "\006\026\064\031\063\001\002\000\030\013\uffe0\014\uffe0" +
    "\015\uffe0\020\uffe0\021\uffe0\022\uffe0\023\uffe0\024\uffe0\026" +
    "\uffe0\030\uffe0\031\uffe0\001\002\000\012\020\060\021\061" +
    "\026\uffdd\031\uffdd\001\002\000\042\005\uffed\012\uffed\013" +
    "\uffed\014\uffed\015\uffed\016\uffed\017\uffed\020\uffed\021\uffed" +
    "\022\uffed\023\uffed\024\uffed\026\uffed\030\uffed\031\uffed\032" +
    "\uffed\001\002\000\042\005\uffec\012\uffec\013\uffec\014\uffec" +
    "\015\uffec\016\uffec\017\uffec\020\uffec\021\uffec\022\uffec\023" +
    "\uffec\024\uffec\026\uffec\030\uffec\031\uffec\032\uffec\001\002" +
    "\000\014\025\043\032\044\033\047\034\042\035\041\001" +
    "\002\000\030\013\uffe1\014\uffe1\015\uffe1\020\uffe1\021\uffe1" +
    "\022\uffe1\023\uffe1\024\uffe1\026\uffe1\030\uffe1\031\uffe1\001" +
    "\002\000\030\013\uffe9\014\uffe9\015\uffe9\020\uffe9\021\uffe9" +
    "\022\051\023\053\024\050\026\uffe9\030\uffe9\031\uffe9\001" +
    "\002\000\030\013\uffe5\014\uffe5\015\uffe5\020\uffe5\021\uffe5" +
    "\022\uffe5\023\uffe5\024\uffe5\026\uffe5\030\uffe5\031\uffe5\001" +
    "\002\000\042\005\uffee\012\uffee\013\uffee\014\uffee\015\uffee" +
    "\016\uffee\017\uffee\020\uffee\021\uffee\022\uffee\023\uffee\024" +
    "\uffee\026\uffee\030\uffee\031\uffee\032\uffee\001\002\000\014" +
    "\025\uffe2\032\uffe2\033\uffe2\034\uffe2\035\uffe2\001\002\000" +
    "\014\025\uffe4\032\uffe4\033\uffe4\034\uffe4\035\uffe4\001\002" +
    "\000\014\025\043\032\044\033\047\034\042\035\041\001" +
    "\002\000\014\025\uffe3\032\uffe3\033\uffe3\034\uffe3\035\uffe3" +
    "\001\002\000\030\013\uffe6\014\uffe6\015\uffe6\020\uffe6\021" +
    "\uffe6\022\uffe6\023\uffe6\024\uffe6\026\uffe6\030\uffe6\031\uffe6" +
    "\001\002\000\010\020\060\021\061\026\056\001\002\000" +
    "\030\013\uffdf\014\uffdf\015\uffdf\020\uffdf\021\uffdf\022\uffdf" +
    "\023\uffdf\024\uffdf\026\uffdf\030\uffdf\031\uffdf\001\002\000" +
    "\014\025\043\032\044\033\047\034\042\035\041\001\002" +
    "\000\014\025\uffe8\032\uffe8\033\uffe8\034\uffe8\035\uffe8\001" +
    "\002\000\014\025\uffe7\032\uffe7\033\uffe7\034\uffe7\035\uffe7" +
    "\001\002\000\030\013\uffea\014\uffea\015\uffea\020\uffea\021" +
    "\uffea\022\051\023\053\024\050\026\uffea\030\uffea\031\uffea" +
    "\001\002\000\014\025\043\032\044\033\047\034\042\035" +
    "\041\001\002\000\004\030\065\001\002\000\016\005\ufff0" +
    "\006\ufff0\012\ufff0\016\ufff0\017\ufff0\032\ufff0\001\002\000" +
    "\012\020\060\021\061\026\uffde\031\uffde\001\002\000\014" +
    "\025\043\032\044\033\047\034\042\035\041\001\002\000" +
    "\014\013\uffeb\015\uffeb\020\060\021\061\030\uffeb\001\002" +
    "\000\016\005\ufff6\006\ufff6\012\ufff6\016\ufff6\017\ufff6\032" +
    "\ufff6\001\002\000\020\002\uffff\005\uffff\006\uffff\012\uffff" +
    "\016\uffff\017\uffff\032\uffff\001\002\000\006\013\074\015" +
    "\075\001\002\000\014\025\043\032\044\033\047\034\042" +
    "\035\041\001\002\000\014\025\043\032\044\033\047\034" +
    "\042\035\041\001\002\000\010\014\077\020\060\021\061" +
    "\001\002\000\010\033\047\034\042\035\041\001\002\000" +
    "\014\005\010\012\027\016\025\017\034\032\033\001\002" +
    "\000\016\005\ufff3\006\ufff3\012\ufff3\016\ufff3\017\ufff3\032" +
    "\ufff3\001\002\000\010\014\103\020\060\021\061\001\002" +
    "\000\010\033\047\034\042\035\041\001\002\000\014\005" +
    "\010\012\027\016\025\017\034\032\033\001\002\000\016" +
    "\005\ufff4\006\ufff4\012\ufff4\016\ufff4\017\ufff4\032\ufff4\001" +
    "\002\000\004\032\017\001\002\000\006\026\110\031\021" +
    "\001\002\000\004\030\111\001\002\000\016\005\ufff1\006" +
    "\ufff1\012\ufff1\016\ufff1\017\ufff1\032\ufff1\001\002\000\016" +
    "\005\ufff2\006\ufff2\012\ufff2\016\ufff2\017\ufff2\032\ufff2\001" +
    "\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\111\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\006\001\001\000\002\001\001" +
    "\000\010\005\010\010\012\011\011\001\001\000\016\004" +
    "\025\006\027\007\031\010\030\011\011\013\023\001\001" +
    "\000\004\012\017\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\013\072\001\001\000\010\004\025\007" +
    "\070\013\023\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\014\037\015" +
    "\035\017\044\021\045\022\036\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\016\056\001\001\000\002\001" +
    "\001\000\002\001\001\000\012\014\054\017\044\021\045" +
    "\022\036\001\001\000\002\001\001\000\004\020\051\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\021\053\022\036\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\016\056\001\001" +
    "\000\002\001\001\000\010\017\061\021\045\022\036\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\020\051" +
    "\001\001\000\012\014\065\017\044\021\045\022\036\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\016\056" +
    "\001\001\000\012\014\067\017\044\021\045\022\036\001" +
    "\001\000\004\016\056\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\014\101\017\044\021" +
    "\045\022\036\001\001\000\012\014\075\017\044\021\045" +
    "\022\036\001\001\000\004\016\056\001\001\000\004\022" +
    "\077\001\001\000\010\004\025\007\100\013\023\001\001" +
    "\000\002\001\001\000\004\016\056\001\001\000\004\022" +
    "\103\001\001\000\010\004\025\007\104\013\023\001\001" +
    "\000\002\001\001\000\004\012\106\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParser$actions(this);
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
    return action_obj.CUP$MPParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

	symbolTable = new SymbolTable();

    }


 
   SymbolTable symbolTable;
   

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MPParser$actions {
  private final MPParser parser;

  /** Constructor */
  CUP$MPParser$actions(MPParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MPParser$do_action(
    int                        CUP$MPParser$act_num,
    java_cup.runtime.lr_parser CUP$MPParser$parser,
    java.util.Stack            CUP$MPParser$stack,
    int                        CUP$MPParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParser$result;

      /* select the action based on the action number */
      switch (CUP$MPParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // ExpressionList ::= Expression 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ExpressionList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // ExpressionList ::= ExpressionList COMMA Expression 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ExpressionList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Factor ::= LEFTPAR Expression RIGHTPAR 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Factor ::= Const 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Factor ::= ID 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // MulOperator ::= MOD 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*MulOperator*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // MulOperator ::= DIV 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*MulOperator*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // MulOperator ::= MUL 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*MulOperator*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // Term ::= Factor 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Term ::= Term MulOperator Factor 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // AddOperator ::= MINUS 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*AddOperator*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // AddOperator ::= PLUS 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*AddOperator*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Expression ::= Term 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Expression ::= Expression AddOperator Term 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Assignment ::= ID ASSIGN Expression 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*Assignment*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Const ::= CHARCONST 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Const*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Const ::= REALCONST 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Const*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Const ::= INTCONST 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Const*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Statement ::= Block 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Statement ::= WRITE LEFTPAR ExpressionList RIGHTPAR SEMI 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= READ LEFTPAR NameList RIGHTPAR SEMI 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= Assignment SEMI 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statement ::= FOR Assignment DOWNTO Expression BY Const Statement 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Statement ::= FOR Assignment TO Expression BY Const Statement 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // StatementList ::= Statement 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Type ::= REAL 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Type ::= CHAR 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= INT 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= ID 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= NameList COMMA ID 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VarDecl ::= Type NameList SEMI 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VarSection ::= VarDecl 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*VarSection*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // VarSection ::= VarSection VarDecl 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*VarSection*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= BEGIN VarSection StatementList END 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= PROGRAM ID Block 
            {
              Object RESULT = null;

              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
