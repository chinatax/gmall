package cn.chinatax.josewu.gmallweb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

	@RequestMapping
	public String index() {

		return "hello world!";

	}
	



}
