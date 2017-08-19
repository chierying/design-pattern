package com.zb.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 代码组
 * Created by v_zhangbing on 2017/8/19.
 */

@Slf4j
@Data
public class CodeGroup implements Group {

    private String groupName = "代码组";

    public void find() {
        log.info("{}查找", groupName);
    }

    public void add() {
        log.info("添加需求", groupName);
    }

    public void delete() {
        log.info("{}删除需求", groupName);

    }
}
