package com.zb.interpreter;

import java.util.Map;

/**
 * 变量解释器
 * Created by v_zhangbing on 2017/8/23.
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(key);
    }
}
