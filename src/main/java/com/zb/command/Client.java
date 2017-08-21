package com.zb.command;

import com.zb.command.command.AddCodeCommand;
import com.zb.command.command.DeletePageCommand;
import lombok.extern.slf4j.Slf4j;

/**
 * 命令模式
 * Created by v_zhangbing on 2017/8/19.
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        // 定义负责人
        Invoker xiaosan = new Invoker();
        // 客户要求增加一项需求
        log.info("客户要求增加需求");
        // 下达命令
        AddCodeCommand command = new AddCodeCommand();
        // 负责人收到命令
        xiaosan.setCommand(command);
        // 负责人执行命令
        xiaosan.action();

        // 删除一个页面的需求
        DeletePageCommand deletePageCommand = new DeletePageCommand();
        xiaosan.setCommand(deletePageCommand);
        xiaosan.action();
    }
}
