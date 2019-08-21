package cn.chinatax.josewu.gmallweb.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QyzgjbylbxModel  extends BaseRowModel {

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表类型：企业职工基本养老保险单位缴纳部分(不含灵活就业人员)","序号","序号"} , index = 0)
    private    String   p1;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表类型：企业职工基本养老保险单位缴纳部分(不含灵活就业人员)","地区","地区"} , index = 1)
    private String p2;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表类型：企业职工基本养老保险单位缴纳部分(不含灵活就业人员)","上年同期","缴费基数"},index = 2)
    private String p3;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","填报单位：国家税务总局","上年同期","缴费金额"},index = 3)
    private String p4;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","填报单位：国家税务总局","当期","缴费人数"},index = 4)
    private String p5;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表所属期：2019年06月","当期","缴费基数"},index = 5)
    private String p6;

    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","报表所属期：2019年06月","当期","缴费金额"},index = 6)
    private String p7;
    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","单位：元、人、户","降率减费情况","小计"},index = 7)
    private String p8;
    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","单位：元、人、户","降率减费情况","其中：1.降率减费额"},index = 8)
    private String p9;
    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","单位：元、人、户","降率减费情况","2.调整社平工资口径减费额"},index = 9)
    private String p10;
    @ExcelProperty(value = {"社会保险费降率减费情况统计表(政策减费账一)(分地区)累计","单位：元、人、户","享受降率政策户数","享受降率政策户数"},index = 10)
    private String p11;

}
