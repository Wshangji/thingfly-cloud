package com.thingfly.auth.comm.enums;

import lombok.Getter;

/**
 * @ClassName PasswordEncoderTypeEnum
 * @Description
 * @Author Nanf_bunan
 * @Time 2023/3/27 16:02
 * @Version 1.0
 */
public enum PasswordEncoderTypeEnum {

    BCRYPT("{bcrypt}","BCRYPT加密"),
    NOOP("{noop}","无加密明文");

    @Getter
    private String prefix;

    PasswordEncoderTypeEnum(String prefix, String desc){
        this.prefix=prefix;
    }

}
