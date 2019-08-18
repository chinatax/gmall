package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.gmallweb.model.ExportHydmModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import org.jboss.logging.Logger;
import org.slf4j.LoggerFactory;
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
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("easyExcelUtil")
public class EasyExcelUtilController extends EasyExcelBaseController {

    protected List<ExportHydmModel> list = new ArrayList<ExportHydmModel>();

    //private static final Logger log = LoggerFactory.getLogger(EasyExcelUtilController.class);
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(EasyExcelUtilController.class);

    Logger log;

    @GetMapping("getExportData")
    @ResponseBody
    public Object getExportData(HttpServletResponse response){
        logger.info("这里是getExportData!");
        try {
            ExcelUtil.writeExcel(response,list,"行业代码","行业代码大全", ExcelTypeEnum.XLSX,ExportHydmModel.class);
        } catch (ExcelException e) {


            log.info(e);
        }
        return success("导出成功");
    }

    @PostMapping("importExcel")
    @ResponseBody
    public Object importExcel(MultipartHttpServletRequest request){

        logger.info("进入了importExcel");

        Iterator<String> itr = request.getFileNames();
        String uploadedFile = itr.next();
        List<MultipartFile> files = request.getFiles(uploadedFile);


        if (CollectionUtils.isEmpty(files)) {
            return fail("请选择文件！");
        }
        try {
            //List<ExportHydmModel> list = ExcelUtil.readExcel(files.get(0),ExportHydmModel.class);
            list = ExcelUtil.readExcel(files.get(0),ExportHydmModel.class);
            String jsonString = JSON.toJSONString(list, SerializerFeature.PrettyFormat);

            //下面注释掉的代码是
            //List<ExportHydmModel> hydmLists = JSON.parseObject(jsonString,new TypeReference<List<ExportHydmModel>>(){});

            //System.out.println("************"+hydmLists.size());


            return success(jsonString);

        } catch (ExcelException e) {
            log.info(e);
            return fail(""+e.getMessage());
        }
    }
}
