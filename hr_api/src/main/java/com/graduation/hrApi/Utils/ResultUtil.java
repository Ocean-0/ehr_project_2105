package com.graduation.hrApi.Utils;

import com.graduation.hrApi.model.Result;

public class ResultUtil {

    private static Result result = null;

    public static Result success() {
        return success(null);
    }

    public static Result success(Object object) {
        result = new Result();
        result.setCode(1);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(Integer code, String msg, Object obj){
        result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(obj);
        return result;
    }

    public static Result success(Integer code, String msg, String token, Object obj){
        result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setToken(token);
        result.setData(obj);
        return result;
    }

    public static Result error(Integer code, String msg) {
        result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
