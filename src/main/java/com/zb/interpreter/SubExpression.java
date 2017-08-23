package com.zb.interpreter;

import java.util.Map;

/**
 * 减法解释器
 * Created by v_zhangbing on 2017/8/23.
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 左右2个表达式相减
     */
    @Override
    public int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }
}
