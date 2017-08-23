package com.zb.decorator.decorator;

import com.zb.decorator.SchoolReport;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore() {
        System.out.println("最高分才70");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
