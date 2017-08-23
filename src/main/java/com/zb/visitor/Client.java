package com.zb.visitor;

import com.zb.visitor.employee.CommonEmployee;
import com.zb.visitor.employee.Employee;
import com.zb.visitor.employee.Manager;
import com.zb.visitor.visitor.CaculateSalaryVisitor;
import com.zb.visitor.visitor.CountEmployeeVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by v_zhangbing on 2017/8/22.
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        List<Employee> employees = new ArrayList<Employee>();

        for (int i = 0; i < 50; i++) {
            if (random.nextBoolean()) {
                Manager manager = new Manager();
                manager.setSalary(i);
                employees.add(manager);
            } else {
                CommonEmployee commonEmployee = new CommonEmployee();
                commonEmployee.setSalary(i);
                employees.add(commonEmployee);
            }
        }

        CaculateSalaryVisitor caculateSalaryVisitor = new CaculateSalaryVisitor();
        CountEmployeeVisitor countEmployeeVisitor = new CountEmployeeVisitor();
        employees.forEach(employee -> {
            employee.accept(caculateSalaryVisitor);
            employee.accept(countEmployeeVisitor);
        });
        System.out.println(caculateSalaryVisitor.getManagerSalary() + "-" + caculateSalaryVisitor.getEmployeeSalary() + "-" + caculateSalaryVisitor.getTotalSalary());
        System.out.println(countEmployeeVisitor.getManagerCount() + "-" + countEmployeeVisitor.getEmployeeCount() + "-" + countEmployeeVisitor.getTotalCount());
    }
}
