package com.yl.interprete;

import java.util.HashMap;

/**
 * @author candk
 * @Description 抽象运算符解释器，每个运算符都只和自己左右两个数字有关系
 * 但左右两个数字有可能是一个解析的结果，无论何种类型，都是Expression的实现类
 * @date 5/4/21 - 8:41 AM
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 因为SymbolExpression是让其子类来实现，因此interpreter是一个默认实现。
     * @param var
     * @return
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return 0;
    }
}
