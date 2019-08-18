package cn.chinatax.josewu.gmallweb.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

@Data
public class ExportHydmModel extends BaseRowModel {
    private Integer id ;

    @ExcelProperty(index = 0 ,value = "行业代码")
    private String hydm;
    @ExcelProperty(index = 1 ,value = "行业名称")
    private String hymc;

    @ExcelProperty(index = 2 ,value = "门类标志")
    private String mlbz;
    @ExcelProperty(index = 3 ,value = "大类标志")
    private String dlbz;
    @ExcelProperty(index = 4 ,value = "中类标志")
    private String zlbz;
    @ExcelProperty(index = 5 ,value = "小类标志")
    private String xlbz;

    @ExcelProperty(index = 6 ,value = "上级行业代码")
    private String sjhydm;

    @ExcelProperty(index = 7 ,value = "选用标志")
    private String xybz;
    @ExcelProperty(index = 8 ,value = "有效标志")
    private String yxbz;

    public ExportHydmModel(Integer id) {
        this.id = id;

        this.hydm = "行业代码"+id;
        this.hymc = "行业名称"+id;

        this.mlbz = "门类标志"+id;
        this.dlbz = "大类标志"+id;
        this.zlbz = "中类标志"+id;
        this.xlbz = "小类标志"+id;
        this.sjhydm = "上级行业代码"+id;
        this.xybz = "选用标志"+id;
        this.yxbz = "有效标志"+id;
    }

    /**
     * 无参构造函数是导入的必要条件
     */
    public ExportHydmModel() {}
}
