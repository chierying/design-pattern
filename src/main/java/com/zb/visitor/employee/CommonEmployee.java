package com.zb.visitor.employee;

import com.zb.visitor.visitor.Visitor;

/**
 * Created by v_zhangbing on 2017/8/22.
 */
public class CommonEmployee implements Employee {
    private String job;
    private String name;
    private int age;
    private int salary;


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
