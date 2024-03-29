package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.gmallservice.impl.RedisServiceImpl;
import cn.chinatax.josewu.gmallweb.model.ExportHydmModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.collections4.CollectionUtils;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import xiong.exception.ExcelException;
import xiong.utils.ExcelUtil;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("easyExcelUtil")
public class EasyExcelUtilController extends EasyExcelBaseController {

    @Autowired
    private RedisServiceImpl redisServece;


    protected List<ExportHydmModel> list = new ArrayList<ExportHydmModel>();


    private String keyString;

    Logger log;

    @GetMapping("getExportData")
    @ResponseBody
    public Object getExportData(HttpServletResponse response){
        //logger.info("这里是getExportData!");
        try {
            String jsonString = redisServece.getString(keyString);
            List<ExportHydmModel> hydmLists = JSON.parseObject(jsonString,new TypeReference<List<ExportHydmModel>>(){});
            ExcelUtil.writeExcel(response,hydmLists,"行业代码","行业代码大全", ExcelTypeEnum.XLSX,ExportHydmModel.class);
        } catch (ExcelException e) {
            log.info(e);
        }
        return success("导出成功");
    }

    @PostMapping("importExcel")
    @ResponseBody
    public Object importExcel(MultipartHttpServletRequest request){

        Iterator<String> itr = request.getFileNames();
        String uploadedFile = itr.next();
        List<MultipartFile> files = request.getFiles(uploadedFile);
        if (CollectionUtils.isEmpty(files)) {
            return fail("请选择文件！");
        }
        try {
            list = ExcelUtil.readExcel(files.get(0),ExportHydmModel.class);
            String jsonString = JSON.toJSONString(list, SerializerFeature.PrettyFormat);
            String oldName = files.get(0).getOriginalFilename();
            keyString = UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
            redisServece.setString(keyString, jsonString);
            redisServece.setString("hydm",keyString);

            return success(jsonString);
        } catch (ExcelException e) {
            log.info(e);
            return fail(""+e.getMessage());
        }
    }
}
