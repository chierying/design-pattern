package com.zb.command.group;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 美术组
 * Created by v_zhangbing on 2017/8/19.
 */

@Slf4j
@Data
public class PageGroup implements Group {

    private String groupName = "美术组";

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
