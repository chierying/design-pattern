package com.zb.decorator;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class FouthGradeSchoolReport implements SchoolReport {
    public void report() {
        System.out.println("汇报本次分数:60");

    }

    public void sign() {
        System.out.println("同意签名");

    }
}
