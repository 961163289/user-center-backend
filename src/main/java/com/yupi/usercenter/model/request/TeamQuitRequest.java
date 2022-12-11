package com.yupi.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 * @author zi.peng
 */
@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = -6687103214368292232L;

    /**
     * id
     */
    private Long teamId;

}
