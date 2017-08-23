package com.zb.abstractfactory;

import com.zb.abstractfactory.human.FemaleBlackHuman;
import com.zb.abstractfactory.human.FemaleWhiteHuman;
import com.zb.abstractfactory.human.FemaleYellowHuman;
import com.zb.abstractfactory.human.Human;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
@Slf4j
public class FemaleFactory implements HumanFactory {

    public Human createWhite() {
        return new FemaleWhiteHuman();
    }

    public Human createYellow() {
        return new FemaleYellowHuman();
    }

    public Human createBlack() {
        return new FemaleBlackHuman();
    }
}
