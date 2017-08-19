package com.zb.command;

/**
 * Created by v_zhangbing on 2017/8/19.
 */
public abstract class Command {
    // 把三个组都定义好.
    protected CodeGroup codeGroup = new CodeGroup();
    protected PageGroup pageGroup = new PageGroup();

    // 执行命令, 要让我做什么, 由具体的命令编写.
    public abstract void execute();
}
