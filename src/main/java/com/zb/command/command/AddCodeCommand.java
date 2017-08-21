package com.zb.command.command;

/**
 * 添加代码的需求
 * Created by v_zhangbing on 2017/8/19.
 */
public class AddCodeCommand extends Command {
    public void execute() {
        codeGroup.find();
        codeGroup.add();
    }
}
