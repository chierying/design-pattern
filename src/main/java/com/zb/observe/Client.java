package com.zb.observe;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class Client {

    public static void main(String[] args) {
        HanFeiziImpl hanFeiZi = new HanFeiziImpl();

        LiSi liSi = new LiSi();
        LiuSi liuSi = new LiuSi();

        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(liuSi);

        hanFeiZi.haveBreakfest();
        hanFeiZi.haveFun();

    }

}
