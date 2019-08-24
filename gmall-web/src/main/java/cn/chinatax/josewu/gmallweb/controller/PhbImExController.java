package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.gmallservice.impl.RedisServiceImpl;
import cn.chinatax.josewu.gmallweb.model.QyzgjbylbxModel;
import cn.chinatax.josewu.gmallweb.model.RkphbModel;
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
@RequestMapping("phb")
public class PhbImExController extends EasyExcelBaseController{

    protected  static final String redisKeys = "phb";

    @Autowired
    private RedisServiceImpl redisServece;


    Logger log;

    @GetMapping("exportExcel")
    @ResponseBody
    public Object getExportData(HttpServletResponse response){
        try {
            String nameString = redisServece.getString(redisKeys);
            String jsonString = redisServece.getString(nameString);
            //System.out.println("%%%%%%=>"+jsonString);
            List<RkphbModel> lists = JSON.parseObject(jsonString,new TypeReference<List<RkphbModel>>(){});
            ExcelUtil.writeExcel(response,lists,"入库收入排行榜","入库收入排行榜", ExcelTypeEnum.XLSX,RkphbModel.class);
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
            List<RkphbModel> lists ;
            lists = ExcelUtil.readExcel(files.get(0),RkphbModel.class);
            String jsonString = JSON.toJSONString(lists, SerializerFeature.PrettyFormat);
            String oldName = files.get(0).getOriginalFilename();
            String nameString = UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
            redisServece.delString(nameString);
            redisServece.setString(nameString, jsonString);

            redisServece.delString(redisKeys);
            redisServece.setString(redisKeys,nameString);
            return success(jsonString);
        } catch (Exception e) {
            log.info(e);
            return fail(""+e.getMessage());
        }
    }


}
