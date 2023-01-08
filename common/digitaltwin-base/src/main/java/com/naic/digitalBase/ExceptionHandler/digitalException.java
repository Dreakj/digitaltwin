package com.naic.digitalBase.ExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @作者：刘子越（Derrick）
 * @创造日期：2023-01-06-上午11:17
 */
@Data
@AllArgsConstructor  //生成有参数构造方法
@NoArgsConstructor   //生成无参数构造
public class digitalException extends RuntimeException {
    private Integer code;//状态码
    private String msg;//异常信息
}
