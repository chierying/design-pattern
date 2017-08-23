package com.zb.interpreter;

import java.util.Map;

/**
 * Created by v_zhangbing on 2017/8/23.
 */
public abstract class Expression {
    // 解析公式和数值, 其中var<参数, 数值>
    public abstract int interpreter(Map<String, Integer> var);
}
