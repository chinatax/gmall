package cn.chinatax.josewu.gmallweb.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/excel")
public class ExcelController {

    private static final Logger logger = LoggerFactory.getLogger(ExcelController.class);


    @RequestMapping(value = "excel")
    public String index(ModelMap map) {


        map.put("title","Hello World!");
        return "excel";
    }
    @RequestMapping(value = "excelQyyl")
    public String qyylIndexß(ModelMap map) {



        map.put("title","Hello World!企业职工基本养老保险");
        return "excelQyyl";
    }
    @RequestMapping(value = "excelPhb")
    public String phbIndexß(ModelMap map) {



        map.put("title","Hello World!入库排行榜");
        return "excelPhb";
    }
    @RequestMapping(value = "error")
    public String error(ModelMap map) {

        throw new RuntimeException("tigger测试异常!");
    }




}