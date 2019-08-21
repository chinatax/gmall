package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.gmallservice.impl.RedisServiceImpl;
import cn.chinatax.josewu.gmallweb.model.QyzgjbylbxModel;
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
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("qyyl")
public class QyzgjbylbxController extends EasyExcelBaseController{

    protected  static final String qyylKeys = "qyyl";

    @Autowired
    private RedisServiceImpl redisServece;


    Logger log;

    @GetMapping("exportExcel")
    @ResponseBody
    public Object getExportData(HttpServletResponse response){
        try {
            String nameString = redisServece.getString(qyylKeys);
            String jsonString = redisServece.getString(nameString);
            //System.out.println("%%%%%%=>"+jsonString);
            List<QyzgjbylbxModel> qyylLists = JSON.parseObject(jsonString,new TypeReference<List<QyzgjbylbxModel>>(){});
            ExcelUtil.writeExcel(response,qyylLists,"企业职工基本养老保险","养老保险", ExcelTypeEnum.XLSX,QyzgjbylbxModel.class);
            return success("导出成功");
        } catch (ExcelException e) {
            log.info(e);
        }
        return fail("导出失败");
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
            List<QyzgjbylbxModel> list ;
            list = ExcelUtil.readExcel(files.get(0),QyzgjbylbxModel.class,1,4);
            String jsonString = JSON.toJSONString(list, SerializerFeature.PrettyFormat);
            String oldName = files.get(0).getOriginalFilename();
            String nameString = UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
            redisServece.setString(nameString, jsonString);
            redisServece.setString(qyylKeys,nameString);
            //System.out.println(jsonString);
            return success(jsonString);

        } catch (ExcelException e) {
            log.info(e);
            return fail(""+e.getMessage());
        }
    }


}
