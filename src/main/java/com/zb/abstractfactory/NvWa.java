package com.zb.abstractfactory;

import com.zb.abstractfactory.human.Human;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();

        Human maleWhite = maleFactory.createWhite();
        maleWhite.getColor();
        maleWhite.getSex();
        maleWhite.talk();

        Human femalWhite = femaleFactory.createWhite();
        femalWhite.getColor();
        femalWhite.getSex();
        femalWhite.talk();
    }


}
