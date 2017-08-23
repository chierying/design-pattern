package com.zb.abstractfactory.human;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
@Slf4j
public abstract class AbstractYellowHuman implements Human {
    public void getColor() {
        log.info("黄种人的皮肤是黄色的.");
    }

    public void talk() {
        log.info("黄种人说话一般是双字节.");
    }
}
