package com.naic.digitalBase.ExceptionHandler;

import com.naic.commonutils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @作者：刘子越（Derrick）
 * @创造日期：2023-01-06-上午11:16
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    //指定出现什么异常执行这个方法
    @ExceptionHandler(Exception.class)
    @ResponseBody //为了返回数据
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.error("执行了全局异常处理..");
    }

    //特定异常
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody //为了返回数据
    public Result error(ArithmeticException e) {
        e.printStackTrace();
        return Result.error("执行了ArithmeticException异常处理..");
    }

    //自定义异常
    @ExceptionHandler(digitalException.class)
    @ResponseBody //为了返回数据
    public Result error(digitalException e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return Result.error(e.getMsg());
//        return Result.error().code().message(e.getMsg());
    }
}
