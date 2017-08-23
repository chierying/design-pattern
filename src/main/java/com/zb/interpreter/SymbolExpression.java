package com.zb.interpreter;

/**
 * Created by v_zhangbing on 2017/8/23.
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    // 只关心自己两边的表达式的结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
