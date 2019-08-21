package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.base.bean.Hydm;
import cn.chinatax.josewu.base.util.UUIDNumber;
import cn.chinatax.josewu.gmallservice.impl.RedisServiceImpl;
import cn.chinatax.josewu.mapper.HydmMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("hydm")
public class HydmMybatisController extends EasyExcelBaseController{

    @Autowired
    private RedisServiceImpl redisServece;
    @Autowired
    private JdbcTemplate   jdbcTemplate;
    @Autowired
    private RedisTemplate  redisTemplate;
    @Autowired
    private HydmMapper hydmMapper;


    private  static  final Logger log = LoggerFactory.getLogger(HydmMybatisController.class);


    @GetMapping("insertHydm")
    @ResponseBody
    public Object insertAll(HttpServletResponse response){

        try{
            // redis实现模糊查找
            String  keys = "hydm";        //这个*一定要加，否则无法模糊查询
            String  keyString = redisServece.getString(keys);
            String  jsonString = redisServece.getString(keyString);
            List<Hydm> hydmLists = JSON.parseObject(jsonString,new TypeReference<List<Hydm>>(){});
            for(Hydm hydm : hydmLists){
                    short  shortId = Short.parseShort(UUIDNumber.getShortGuid());
                    hydm.setId(shortId);
                    hydmMapper.insert(hydm);
            }
            return success("导出成功");
        }catch(Exception e) {
            log.info(e.toString());
        }
        return fail( "导出失败");
    }

    @GetMapping("/test")
    public String test() {
        return "hymc test";
    }


}
