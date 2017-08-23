package com.zb.factory;

import com.zb.factory.human.Human;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman(Class c);
}
