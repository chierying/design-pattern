package com.zb.responsechain.woman;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public enum WomanType {
    Young(0),
    Married(1),
    Old(2);

    private int code;

    WomanType(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return Integer.toString(code);
    }
}
