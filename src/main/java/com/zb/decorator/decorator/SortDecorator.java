package com.zb.decorator.decorator;

import com.zb.decorator.SchoolReport;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportSort() {
        System.out.println("排名居然前30");
    }

    @Override
    public void report() {
        reportSort();
        super.report();
    }
}
