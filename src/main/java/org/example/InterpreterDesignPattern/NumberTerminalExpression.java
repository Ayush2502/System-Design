package org.example.InterpreterDesignPattern;

// is-a relationship with Interface
public class NumberTerminalExpression implements AbstractExpression{

    String numVal;

    NumberTerminalExpression(String numVal){
        this.numVal = numVal;
    }
    @Override
    public int interpret(Context context) {
        return context.get(numVal);
    }
}
