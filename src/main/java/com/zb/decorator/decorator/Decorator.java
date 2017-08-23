package com.zb.decorator.decorator;

import com.zb.decorator.SchoolReport;

/**
 * 装饰者
 * Created by v_zhangbing on 2017/8/21.
 */
public abstract class Decorator implements SchoolReport {
    // 被装饰的对象
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    public void report() {
        schoolReport.report();
    }

    public void sign() {
        this.schoolReport.sign();
    }
}
