package com.fun.mianshishua.constant;

/**
 * Redis常量
 * 将所有 Redis 的 key 单独定义成常量，便于管理和修改
 *
 * @author FUN
 * @version 1.0
 * @date 2024/12/9 20:48
 */
public interface RedisConstant {
    /**
     * 用户签到记录的 Redis Key 前缀
     */
    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins";

    /**
     * 获取用户签到记录的 Redis Key
     * @param year 年份
     * @param userId 用户 id
     * @return 拼接好的 Redis Key
     */
    static String getUserSignInRedisKey(int year, long userId) {
        return String.format("%s:%s:%s", USER_SIGN_IN_REDIS_KEY_PREFIX, year, userId);
    }
}
