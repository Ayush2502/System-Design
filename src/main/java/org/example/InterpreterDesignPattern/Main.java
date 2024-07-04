package org.example.InterpreterDesignPattern;

public class Main {
    public static void main(String args[]){

        Context context = new Context();
        context.put("a",2);
        context.put("b",4);
        context.put("c",6);
        context.put("d",2);

        AbstractExpression expression = new SumNonTerminalExpression(new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"),new NumberTerminalExpression("b"))
        ,new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"),new NumberTerminalExpression("d")));
        System.out.println(expression.interpret(context));

    }
}
