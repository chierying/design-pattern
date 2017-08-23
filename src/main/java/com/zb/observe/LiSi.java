package com.zb.observe;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class LiSi implements Observer {

    public void update(String context) {
        System.out.println("向秦始皇汇报: 发现 LiSi is" + context);
    }
}
