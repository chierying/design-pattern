package com.zb.responsechain.handle;

import com.zb.responsechain.woman.IWoman;
import com.zb.responsechain.woman.WomanType;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
@Slf4j
public abstract class Handler {
    private Handler next;
    private WomanType typeToHandle;

    public Handler(WomanType typeToHandle) {
        this.typeToHandle = typeToHandle;
    }

    public void handleRequest(IWoman woman) {
        if (woman.getType() == typeToHandle) {
            response(woman);
        } else {
            if (next != null) {
                // 交给下一个处理
                next.handleRequest(woman);
            } else {
                log.info("没有能处理的了, 默认拒绝!");
            }
        }
    }

    public abstract void response(IWoman woman);

    public void setNext(Handler next) {
        this.next = next;
    }
}
