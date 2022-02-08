package com.shq.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {

    @Test
    public void conTest(){
        Jedis jedis = new Jedis("123.60.143.166",6379);
        jedis.auth("0018$0018bB");
        String ping = jedis.ping();
        System.out.println(ping);
    }
}
