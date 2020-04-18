package com.cf.bsixapp.common.api;

public enum ResultCode implements IResultCode{
    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    FORBIDDEN(304,"无权限访问!"),
    NOLOGIN(305,"未登录，请登录后访问!");


    private Integer Code;
    private String message;

    ResultCode(Integer code, String message) {
        Code = code;
        this.message = message;
    }

    public Integer getCode() {
        return Code;
    }

    public String getMessage() {
        return message;
    }
}
