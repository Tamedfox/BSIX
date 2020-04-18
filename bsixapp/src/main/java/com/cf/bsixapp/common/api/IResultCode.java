package com.cf.bsixapp.common.api;

/**
 * 返回码接口
 */
public interface IResultCode {

    /**
     * 获取错误码
     * @return
     */
    Integer getCode();

    /**
     * 获取返回信息
     * @return
     */
    String getMessage();

}
