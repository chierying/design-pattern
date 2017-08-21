package com.zb.responsechain;

import com.zb.responsechain.handle.Father;
import com.zb.responsechain.handle.Handler;
import com.zb.responsechain.handle.Husband;
import com.zb.responsechain.handle.Son;
import com.zb.responsechain.woman.IWoman;
import com.zb.responsechain.woman.Woman;
import com.zb.responsechain.woman.WomanType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        List<IWoman> women = new ArrayList<IWoman>();
        for (int i = 0; i < 10; i++) {
            Woman woman = new Woman(WomanType.values()[random.nextInt(2)], "我要去旅游!");
            women.add(woman);
        }

        Handler father = new Father(WomanType.Young);
        Handler husband = new Husband(WomanType.Married);
        Handler son = new Son(WomanType.Old);

        father.setNext(husband);
        husband.setNext(son);

        for (IWoman woman : women) {
            father.handleRequest(woman);
        }
    }
}
