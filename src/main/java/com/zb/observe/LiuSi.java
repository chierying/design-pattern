package com.zb.observe;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class LiuSi implements Observer {
    public void update(String context) {
        System.out.println("向刘备汇报: 发现LiSi is" + context);
    }
}
