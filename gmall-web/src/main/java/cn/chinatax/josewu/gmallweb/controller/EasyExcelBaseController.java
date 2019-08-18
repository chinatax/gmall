package cn.chinatax.josewu.gmallweb.controller;

import self.body.WebResponse;
import self.enumeration.ResponseEnum;

/**
 * 基础控制器
 */
public class EasyExcelBaseController {

    public static WebResponse success(String msg){
        return new WebResponse(ResponseEnum.SUCCESS,msg);
    }

    public static WebResponse fail(String msg){
        return new WebResponse(ResponseEnum.FAIL,msg);
    }
}
