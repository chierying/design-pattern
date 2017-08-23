package com.zb.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * 解释器封装类
 * Created by v_zhangbing on 2017/8/23.
 */
public class Caculator {
    // 定义表达式
    private Expression expression;

    public Caculator(String expStr) {
        // 安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为字符数组
        char[] chars = expStr.toCharArray();
        Expression left = null;
        VarExpression right = null;

        // stack: [SubExp]
        // a+b-c
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+': // 加法
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;

                case '-': // 减法
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;

                default: // 公式中的变量
                    stack.push(new VarExpression(String.valueOf(chars[i])));

            }
        }
        // 抛出运算结果
        this.expression = stack.pop();
    }

    /**
     * 开始运算
     */
    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
