package cn.chinatax.josewu.gmallservice.impl;


import cn.chinatax.josewu.base.bean.Hydm;
import cn.chinatax.josewu.gmalldao.HymcDao;
import cn.chinatax.josewu.gmallservice.HymcService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository("hymcServiceImpl")
public class HymcServiceImpl  implements HymcService {


    @Qualifier("hymcDaoImpl")
    @Autowired
    private HymcDao  hymcDao;

    @Override
    public Hydm getHymcList() {
        return hymcDao.selectById(1);

    }

}

