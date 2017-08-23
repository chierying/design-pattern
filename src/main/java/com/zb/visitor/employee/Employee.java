package com.zb.visitor.employee;

import com.zb.visitor.visitor.Visitor;

/**
 * Created by v_zhangbing on 2017/8/22.
 */
public interface Employee {
    String getName();

    int getAge();

    int getSalary();

    void accept(Visitor visitor);
}
