package com.zb.command;

import com.zb.command.command.Command;
import lombok.Setter;

/**
 * 负责人
 * Created by v_zhangbing on 2017/8/19.
 */
public class Invoker {
    // 什么命令
    @Setter
    private Command command;

    // 执行客户的命令
    public void action() {
        command.execute();
    }

}
