package com.zb.visitor.visitor;

import com.zb.visitor.employee.CommonEmployee;
import com.zb.visitor.employee.Manager;

/**
 * Created by v_zhangbing on 2017/8/22.
 */
public interface Visitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
