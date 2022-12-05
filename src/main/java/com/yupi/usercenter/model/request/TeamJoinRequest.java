package com.yupi.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = -6687103214368292232L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;

}
