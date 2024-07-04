package org.example.InterpreterDesignPattern;

public class MultiplyNonTerminalExpression implements AbstractExpression{
    AbstractExpression leftexpression;
    AbstractExpression rightexpression;

    public MultiplyNonTerminalExpression(AbstractExpression leftexpression, AbstractExpression rightexpression) {

        this.leftexpression = leftexpression;
        this.rightexpression = rightexpression;
    }

    @Override
    public int interpret(Context context) {
        return leftexpression.interpret(context)* rightexpression.interpret(context);
    }

}
