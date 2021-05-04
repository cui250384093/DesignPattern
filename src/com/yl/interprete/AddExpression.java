package com.yl.interprete;

import java.util.HashMap;

/**
 * @author candk
 * @Description 加法解释器，
 * @date 5/4/21 - 8:42 AM
 */
public class AddExpression extends SymbolExpression {


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.left.interpret(var) + super.right.interpret(var);
    }
}
