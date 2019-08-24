package cn.chinatax.josewu.gmallservice.impl;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository("redisServiceImpl")
@Service
public class RedisServiceImpl {
	
	 @Autowired
	 private StringRedisTemplate redisTemplate;
	 
	 public void setString(String key,String value) {
		 
		 redisTemplate.opsForValue().getAndSet(key, value);
		 
	 }
	 
	 public String  getString(String key) {
		 
		 return redisTemplate.opsForValue().get(key);
	 }

	 public void delString(String key){

	 	 redisTemplate.delete(key);
	 }
	

}
