package com.yl.interprete;

import java.util.HashMap;

/**
 * @author candk
 * @Description 通过HashMap获取变量的值
 * @date 5/4/21 - 8:41 AM
 */
public abstract class Expression {

    public abstract int interpret(HashMap<String, Integer> var);
}
