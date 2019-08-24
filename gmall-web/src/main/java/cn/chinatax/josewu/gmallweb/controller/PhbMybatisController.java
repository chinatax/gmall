package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.base.bean.Rkphb;
import cn.chinatax.josewu.base.bean.Zsxx;
import cn.chinatax.josewu.base.util.UUIDNumber;
import cn.chinatax.josewu.gmallservice.impl.RedisServiceImpl;
import cn.chinatax.josewu.mapper.RkphbMapper;
import cn.chinatax.josewu.mapper.ZsxxMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("phb")
public class PhbMybatisController extends EasyExcelBaseController{

    private final  static  String redisKeys  = "phb";
    @Autowired
    private RedisServiceImpl redisServece;

    @Autowired
    private RkphbMapper rkphbMapper;


    private  static  final Logger log = LoggerFactory.getLogger(PhbMybatisController.class);


    @GetMapping("insertPhb")
    @ResponseBody
    public Object insertAll(HttpServletResponse response){

        try{
            String  keyString = redisServece.getString(redisKeys);
            String  jsonString = redisServece.getString(keyString);
            //System.out.println("%%%%%%=>"+jsonString);
            List<Rkphb>  phbLists = JSON.parseObject(jsonString,new TypeReference<List<Rkphb>>(){});
            List<Rkphb>  newPhpLists = new ArrayList<>();
            for(Rkphb rkphb : phbLists){
                long  longId = Long.parseLong(UUIDNumber.getGuid());
                rkphb.setId(longId);
                newPhpLists.add(rkphb);
            }
            rkphbMapper.insertAllRkphb(newPhpLists);

            return success("导出成功");
        }catch(Exception e) {
            log.info(e.toString());
        }
        return fail( "导出失败");
    }

    @GetMapping("/test")
    public String test() {
        return "企业职工基本养老保险 test";
    }





}
