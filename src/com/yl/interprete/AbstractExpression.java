package com.yl.interprete;

/**
 * @author candk
 * @Description 抽象表达式，声明一个抽象的解释操作，这个方法为抽象语法树中所有的节点所共享
 * @date 5/4/21 - 8:30 AM
 */
public abstract class AbstractExpression {

    public abstract void interpret();
}
