package com.zhy.redis;

/**
 * @author: ljh123
 * @Date: 2023/5/14 15:31
 * Describe:
 */
public interface RedisService {

    /**
     * 判断key是否存在
     */
    Boolean hasKey(String key);

}
