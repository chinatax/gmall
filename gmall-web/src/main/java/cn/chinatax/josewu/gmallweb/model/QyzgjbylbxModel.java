package cn.chinatax.josewu.gmallweb.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
public class QyzgjbylbxModel  extends BaseRowModel {

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表类型：企业职工基本养老保险单位缴纳部分(不含灵活就业人员)","序号","序号"} , index = 0)
    private    int   xh;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表类型：企业职工基本养老保险单位缴纳部分(不含灵活就业人员)","地区","地区"} , index = 1)
    private String dq;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表类型：企业职工基本养老保险单位缴纳部分(不含灵活就业人员)","上年同期","缴费人数"},index = 2)
    private BigDecimal jfrsSntq;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表类型：企业职工基本养老保险单位缴纳部分(不含灵活就业人员)","上年同期","缴费基数"},index = 3)
    private BigDecimal jfjsSntq;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","填报单位：国家税务总局","上年同期","缴费金额"},index = 4)
    private BigDecimal jfjeSntq;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","填报单位：国家税务总局","当期","缴费人数"},index = 5)
    private BigDecimal jfrsBq;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表所属期：2019年06月","当期","缴费基数"},index = 6)
    private BigDecimal jfjsBq;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表所属期：2019年06月","当期","缴费金额"},index = 7)
    private BigDecimal jfjeBq;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","单位：元、人、户","降率减费情况","小计"},index = 8)
    private BigDecimal xj;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","单位：元、人、户","降率减费情况","其中：1.降率减费额"},index = 9)
    private BigDecimal jvjf;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","单位：元、人、户","降率减费情况","2.调整社平工资口径减费额"},index = 10)
    private BigDecimal spgzkjjfe;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","单位：元、人、户","享受降率政策户数","享受降率政策户数"},index = 11)
    private BigDecimal xsjfzchs;

}
