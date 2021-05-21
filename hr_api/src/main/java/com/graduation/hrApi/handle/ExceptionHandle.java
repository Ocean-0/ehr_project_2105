package com.graduation.hrApi.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.graduation.hrApi.model.Result;
import com.graduation.hrApi.Utils.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof NullPointerException) {
            return ResultUtil.error(-1,"空指针异常"+e.getMessage());
        }else
        if (e instanceof ArrayIndexOutOfBoundsException) {
            return ResultUtil.error(-1,"数组越界");
        }
        return ResultUtil.error(-1, "未知错误");
    }


}
