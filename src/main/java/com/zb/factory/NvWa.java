package com.zb.factory;

import com.zb.factory.human.BlackHuman;
import com.zb.factory.human.Human;
import com.zb.factory.human.WhiteHuman;
import com.zb.factory.human.YellowHuman;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class NvWa {

    public static void main(String[] args) {

        AbstractHumanFactory humanFactory = new HumanFactory();
        Human white = humanFactory.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();

        Human yellow = humanFactory.createHuman(YellowHuman.class);
        yellow.talk();
        yellow.getColor();

        Human black = humanFactory.createHuman(BlackHuman.class);
        black.getColor();
        black.talk();

    }


}
