package com.zb.command;

/**
 * 删除页面的命令
 * Created by v_zhangbing on 2017/8/19.
 */
public class DeletePageCommand extends Command {
    public void execute() {
        // 找到页面
        pageGroup.find();
        // 删除页面
        pageGroup.delete();
    }
}
