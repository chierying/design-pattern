package com.zb.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class HanFeiziImpl implements HanFeiZi, Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);

    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(final String context) {
        this.observers.forEach(o -> o.update(context));
    }

    public void haveBreakfest() {
        System.out.println("Lisi having breakfest.");
        notifyObservers("breakfeast.");

    }

    public void haveFun() {
        System.out.println("LiSi is having fun.");
        notifyObservers("have fun.");
    }
}
