package com.naic.commonutils;

import com.alibaba.nacos.common.model.core.IResultCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @作者：刘子越（Derrick）
 * @创造日期：2023-01-05-上午11:01
 * @description 返回统一结果
 */
@Data
public class Result<T> {
    @ApiModelProperty("结果代码，0为成功，负数为失败")
    private int code;
    @ApiModelProperty("提示信息")
    private String message;
    @ApiModelProperty("数据")
    private T data;


    private Result() {
    }

    public static<T> Result<T> success(){
        Result<T> result= new Result<>();
        result.code = ResultCode.SUCCESS.getCode();
        result.message = ResultCode.SUCCESS.getMessage();
        return result;
    }

    public static<T> Result<T> success(T t){
        Result<T> result= new Result<>();
        result.code = ResultCode.SUCCESS.getCode();
        result.message = ResultCode.SUCCESS.getMessage();
        result.data = t;
        return result;
    }

    public static<T> Result<T> error(IResultCode resultEnum){
        Result<T> result= new Result<>();
        result.code = resultEnum.getCode();
        result.message = resultEnum.getCodeMsg();
        result.data = null;
        return result;
    }

    public static<T> Result<T> error(String msg){
        Result<T> result= new Result<>();
        result.code = ResultCode.FAILURE.getCode();
        result.message = msg;
        result.data = null;
        return result;
    }
}
