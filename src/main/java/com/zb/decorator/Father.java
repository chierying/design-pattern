package com.zb.decorator;

import com.zb.decorator.decorator.HighScoreDecorator;
import com.zb.decorator.decorator.SortDecorator;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class Father {

    public static void main(String[] args) {
        // 原始的汇报
        SchoolReport report = new FouthGradeSchoolReport();
        // 用高分装饰一下
        SchoolReport highScoreReport = new HighScoreDecorator(report);
        // 用排名再装饰一下
        SortDecorator sortReport = new SortDecorator(highScoreReport);

        // 然后就可以汇报了
        sortReport.report();
        sortReport.sign();

    }

}
