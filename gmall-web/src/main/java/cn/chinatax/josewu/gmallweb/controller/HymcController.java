package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.base.bean.Hydm;
import cn.chinatax.josewu.base.bean.Hymc;
import cn.chinatax.josewu.base.util.CodeMsg;
import cn.chinatax.josewu.base.util.Result;
import cn.chinatax.josewu.gmallservice.HymcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/hymc")
public class HymcController {


    @Autowired
    private   HymcService  hymcService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String test() {

        return "hymc test";
    }


    // 正常情况
    @GetMapping("/byid")
    public Map<String, Object> selectByUuid() {

        Hydm hydm = new Hydm();

        RowMapper<Hydm> mapper = new BeanPropertyRowMapper<>(Hydm.class);

        String sql = "select id,hydm,hymc from hydm where id=?";
        hydm = jdbcTemplate.queryForObject(sql,mapper,2);

        hydm = hymcService.getHymcList();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hydm",hydm.getHydm());
        map.put("hymc",hydm.getHymc());
        map.put("title","hello 吴虎");

        return map;
    }



}
