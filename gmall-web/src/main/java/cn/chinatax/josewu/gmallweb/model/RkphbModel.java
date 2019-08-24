package cn.chinatax.josewu.gmallweb.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class RkphbModel  extends BaseRowModel {

    @ExcelProperty(value = {"序号"} , index = 0)
    private    int   xh;

    @ExcelProperty(value = {"地区"} , index = 1)
    private String dq;
    @ExcelProperty(value = {"登记序号"} , index = 2)
    private String djxh;

    @ExcelProperty(value = {"纳税人识别号"},index = 3)
    private String nsrsbh;

    @ExcelProperty(value = {"纳税人名称"},index = 4)
    private String nsrmc;

    @ExcelProperty(value = {"年度税收合计(万元)"},index = 5)
    private BigDecimal hj;

    @ExcelProperty(value = {"入库日期"},index = 6,format = "yyyy-MM-dd")
    private Date tdate;

}
