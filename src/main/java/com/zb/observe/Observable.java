package com.zb.observe;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String context);
}
