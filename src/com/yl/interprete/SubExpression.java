package com.yl.interprete;

import java.util.HashMap;

/**
 * @author candk
 * @Description
 * @date 5/4/21 - 8:42 AM
 */
public class SubExpression extends SymbolExpression {


    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.left.interpret(var) - super.right.interpret(var);
    }
}
