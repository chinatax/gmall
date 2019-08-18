package cn.chinatax.josewu.gmallweb.controller;

import java.util.HashMap;

import cn.chinatax.josewu.base.bean.Hydm;
import cn.chinatax.josewu.base.bean.Swjg;
import cn.chinatax.josewu.gmallservice.SwjgCacheService;
import cn.chinatax.josewu.gmallservice.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/swjgCache")
public class SwjgCacheController {

	@Qualifier("swdjCacheServiceImpl")
	@Autowired   
	private   SwjgCacheService     swjgCacheService;


	@Autowired
	private   RedisServiceImpl     redisServece;
	
	
	@RequestMapping("/setString")
	public String setString(String key,String value) {
		   
		try {
			
			redisServece.setString(key, value);
			
		} catch (Exception e) {
			System.out.print("Redis 存储异常！");
			
		}
		return "redis缓存DONE!";			
		
	}
	@RequestMapping("getKey")
	public String getString(String key) {
		
		return redisServece.getString(key);
	}
	
	
	@CrossOrigin(origins = "http://127.0.0.1:8080")
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public HashMap<String, Object> get(@RequestParam String name) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "hello world");
		map.put("name", name);
		return map;
	}
	
	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public Swjg get(@RequestParam(defaultValue = "1")  int id) {
		return  swjgCacheService.selectById(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public Swjg update(@RequestParam(defaultValue = "1") int id) {
		Swjg bean = swjgCacheService.selectById(id);
		bean.setSwjgDm("13401000000");
		bean.setSwjgMc("国家税务总局合肥市税务局");
		swjgCacheService.updateById(bean);
		return bean;
	}

	@RequestMapping(value = "/del", method = RequestMethod.GET)
	public String del(@RequestParam(defaultValue = "1") int id) {
		return swjgCacheService.deleteById(id);
	}

}
