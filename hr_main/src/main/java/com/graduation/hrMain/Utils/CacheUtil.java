package com.graduation.hrMain.Utils;

import com.graduation.hrApi.Utils.ResultUtil;
import com.graduation.hrApi.model.Result;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;

public class CacheUtil {

    private static Jedis jedis = new Jedis("127.0.0.1", 6379);

    public static Result checkLoginIn(String token, String userAccount, HttpServletRequest req){
        int saveTime = 360;
        if(jedis.get(userAccount) != null){
//            throw  new LoginInOrRegisterException("请勿重复登录");
        }
        jedis.setex(token,saveTime, req.getRemoteHost());
        jedis.setex(userAccount,saveTime, req.getRemoteHost());
//        logger.info("用户"+userAccount+" 已登录，令牌："+token);
        return ResultUtil.success(1,"登录成功", token, null);
    }

    public static Result checkSignOut(String token, String userAccount ,String msg){
        if(jedis.get(token) == null){
//            throw  new LoginInOrRegisterException("请先登录");
        }
        jedis.del(token);
        jedis.del(userAccount);
//        logger.info("用户"+userAccount+" 已注销，令牌："+token);
        return ResultUtil.success(1,msg, null);
    }

    public boolean checkLoginStatus(String token, String userAccount){
        if(jedis.get(token) == null || jedis.get(userAccount) == null || !jedis.get(token).equals(jedis.get(userAccount)))
            return false;
        return true;
    }

}
