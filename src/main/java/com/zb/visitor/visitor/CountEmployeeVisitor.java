package com.zb.visitor.visitor;

import com.zb.visitor.employee.CommonEmployee;
import com.zb.visitor.employee.Manager;

/**
 * Created by v_zhangbing on 2017/8/22.
 */
public class CountEmployeeVisitor implements Visitor {
    private int employeeCount;
    private int managerCount;

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.employeeCount++;
    }

    @Override
    public void visit(Manager manager) {
        this.managerCount++;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public int getManagerCount() {
        return managerCount;
    }

    public int getTotalCount() {
        return this.employeeCount + this.managerCount;
    }
}
