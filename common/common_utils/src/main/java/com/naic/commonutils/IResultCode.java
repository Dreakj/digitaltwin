package com.naic.commonutils;

/**
 * @作者：刘子越（Derrick）
 * @创造日期：2023-01-09-上午11:20
 */
public interface IResultCode {
    /**
     * 消息
     *
     * @return String
     */
    String getMessage();

    /**
     * 状态码
     *
     * @return int
     */
    Integer getCode();
}
