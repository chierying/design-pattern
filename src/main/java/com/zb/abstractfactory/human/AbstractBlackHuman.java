package com.zb.abstractfactory.human;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
@Slf4j
public abstract class AbstractBlackHuman implements Human {
    public void getColor() {
        log.info("黑人的皮肤是黑色的.");
    }

    public void talk() {
        log.info("黑人说话,一般人听不懂.");
    }
}
