package com.zb.responsechain.handle;

import com.zb.responsechain.woman.IWoman;
import com.zb.responsechain.woman.WomanType;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
@Slf4j
public class Son extends Handler {
    public Son(WomanType typeToHandle) {
        super(typeToHandle);
    }

    public void response(IWoman woman) {
        log.info("母亲的请求是:{},儿子同意了!", woman.getRequest());
    }
}
