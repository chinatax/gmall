package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.gmallservice.impl.RedisServiceImpl;
import cn.chinatax.josewu.gmallweb.model.ExportHydmModel;
import cn.chinatax.josewu.gmallweb.model.QyzgjbylbxModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.jboss.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xiong.exception.ExcelException;
import xiong.utils.ExcelUtil;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("qyyl")
public class QyzgjbylbxController extends EasyExcelBaseController{

    @Autowired
    private RedisServiceImpl redisServece;

    String keyString;
    List<QyzgjbylbxModel> list = new ArrayList<>();
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(EasyExcelUtilController.class);

    Logger log;

    @GetMapping("qyylExportData")
    @ResponseBody
    public Object getExportData(HttpServletResponse response){

        try {
            ExcelUtil.writeExcel(response,list,"企业职工基本养老保险","养老保险", ExcelTypeEnum.XLSX,QyzgjbylbxModel.class);
        } catch (ExcelException e) {
            log.info(e);
        }
        return success("导出成功");
    }



}
