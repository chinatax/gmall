package cn.chinatax.josewu.gmallweb.controller;


import cn.chinatax.josewu.base.bean.Swjg;
import cn.chinatax.josewu.mapper.SwjgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/mybatis")
public class MybatisController {

    @Autowired
    private SwjgMapper swjgMapper;


    @GetMapping("/select")
    public String select() {
        Swjg swjg = (Swjg) swjgMapper.selectByPrimaryKey((short) 1);
        String s = "hello!<br/>";

        //System.out.println("香港");坚持把学懂弄通做实习近平新时代中国特色社会主义思想作为首要de政治任务，坚持学原文，读原著，悟原理，进而更加牢固地树立四个意识，坚定四个，做到两个维护
        //我们坚持问题导向，紧密结合  实际，进一步地整治贯彻落实   不到位的问题；    不到位的问题 ，坚持坚持思想，老问题和新问题一起  ，边 边整改。
        //让。。。感受到主题教育的成果。
        //
        if (swjg != null) {
            s += "dswjgdm:" + swjg.getSwjgDm() + ",loc:" + swjg.getSwjgMc();
        }
        return s;
    }
}
