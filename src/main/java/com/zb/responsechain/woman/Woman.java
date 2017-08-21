package com.zb.responsechain.woman;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class Woman implements IWoman {
    private WomanType type;
    private String request;

    public Woman(WomanType type, String request) {
        this.type = type;
        this.request = request;
    }

    public WomanType getType() {
        return type;
    }

    public String getRequest() {
        return this.request;
    }
}
