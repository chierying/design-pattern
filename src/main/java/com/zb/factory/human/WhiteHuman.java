package com.zb.factory.human;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
@Slf4j
public class WhiteHuman implements Human {
    public void getColor() {
        log.info("白人的皮肤是白色的.");
    }

    public void talk() {
        log.info("白人说话一般是单字节.");
    }
}
