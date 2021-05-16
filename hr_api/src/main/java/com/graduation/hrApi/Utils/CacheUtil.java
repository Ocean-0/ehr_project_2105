//package com.graduation.hrApi.Utils;
//
//import redis.clients.jedis.Jedis;
//
//import javax.servlet.http.HttpServletRequest;
//
//public class CacheUtil {
//
//    private static Jedis jedis = new Jedis("127.0.0.1", 6379);
//
//    public static Result checkLoginIn(String token, String userAccount, HttpServletRequest req){
//        int saveTime = 360;
//        if(jedis.get(userAccount) != null){
//            throw  new LoginInOrRegisterException("请勿重复登录");
//        }
//        jedis.setex(token,saveTime, req.getRemoteHost());
//        jedis.setex(userAccount,saveTime, req.getRemoteHost());
//        logger.info("用户"+userAccount+" 已登录，令牌："+token);
//        return ResultUtil.success(1,"登录成功", token, null);
//    }
//
//
//}
