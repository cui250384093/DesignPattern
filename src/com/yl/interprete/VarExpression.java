package com.yl.interprete;

import java.util.HashMap;

/**
 * @author candk
 * @Description 变量解释器
 * @date 5/4/21 - 8:41 AM
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     *
     * @param var
     * @return 根据变量名称，返回对应的值
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
