package com.yl.interprete;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author candk
 * @Description
 * @date 5/4/21 - 2:17 PM
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expr) {

        Stack<Expression> stack = new Stack<Expression>();
        char[] charArray = expr.toCharArray();

        Expression left = null;
        Expression right = null;

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+' -> {
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                }
                case '-' -> {
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                }
                default -> stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpret(var);
    }
}
