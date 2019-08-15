package cn.chinatax.josewu.gmallweb.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import cn.chinatax.josewu.base.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class IndexController {


	@Value(value= "${random.value}")
	private String secret;


	@RequestMapping
	public String index() {

		return "hello world!";

	}
	@RequestMapping(value = "get")
	public Map<String, Object> get(@RequestParam String name) {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("name", name);
		map.put("value", "hello world!");
		map.put("secret", secret);
		return map;

	}
	@RequestMapping(value = "find/{id}/{name}")
	public User get(@PathVariable int id, @PathVariable String name) {

		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setDate(new Date());

		return u;

	}


}
