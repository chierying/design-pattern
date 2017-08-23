package com.zb.interpreter;

import java.util.Map;

/**
 * 加法解释器
 * Created by v_zhangbing on 2017/8/23.
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 把左右2个表达式的结果加起来
    @Override
    public int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}
