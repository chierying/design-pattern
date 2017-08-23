package com.zb.factory;

import com.zb.factory.human.Human;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by v_zhangbing on 2017/8/21.
 */
@Slf4j
public class HumanFactory extends AbstractHumanFactory {
    public Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            log.error("人类生成错误,", e);
        }
        return human;
    }
}
