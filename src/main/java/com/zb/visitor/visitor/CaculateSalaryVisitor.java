package com.zb.visitor.visitor;

import com.zb.visitor.employee.CommonEmployee;
import com.zb.visitor.employee.Manager;

/**
 * Created by v_zhangbing on 2017/8/22.
 */
public class CaculateSalaryVisitor implements Visitor {
    private int employeeSalary = 0;
    private int managerSalary = 0;

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.employeeSalary += commonEmployee.getSalary();
    }

    @Override
    public void visit(Manager manager) {
        this.managerSalary += manager.getSalary();
    }

    public int getTotalSalary() {
        return this.employeeSalary + this.managerSalary;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getManagerSalary() {
        return managerSalary;
    }
}
