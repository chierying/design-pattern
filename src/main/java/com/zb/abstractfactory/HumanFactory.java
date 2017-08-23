package com.zb.abstractfactory;

import com.zb.abstractfactory.human.Human;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public interface HumanFactory {
    Human createWhite();

    Human createYellow();

    Human createBlack();
}
