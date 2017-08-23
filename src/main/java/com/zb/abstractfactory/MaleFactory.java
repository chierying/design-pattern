package com.zb.abstractfactory;

import com.zb.abstractfactory.human.Human;
import com.zb.abstractfactory.human.MaleBlackHuman;
import com.zb.abstractfactory.human.MaleWhiteHuman;
import com.zb.abstractfactory.human.MaleYellowHuman;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class MaleFactory implements HumanFactory {

    public Human createWhite() {
        return new MaleWhiteHuman();
    }

    public Human createYellow() {
        return new MaleYellowHuman();
    }

    public Human createBlack() {
        return new MaleBlackHuman();
    }
}
