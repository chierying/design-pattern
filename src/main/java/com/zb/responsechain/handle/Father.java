package com.zb.responsechain.handle;

import com.zb.responsechain.woman.IWoman;
import com.zb.responsechain.woman.WomanType;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
@Slf4j
public class Father extends Handler {
    public Father(WomanType typeToHandle) {
        super(typeToHandle);
    }

    public void response(IWoman woman) {
        log.info("女儿的请求是:{},父亲同意了!", woman.getRequest());
    }
}
