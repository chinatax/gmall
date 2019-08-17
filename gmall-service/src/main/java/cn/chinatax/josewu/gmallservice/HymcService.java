package cn.chinatax.josewu.gmallservice;

import cn.chinatax.josewu.base.bean.Hydm;
import cn.chinatax.josewu.base.bean.Hymc;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface HymcService {

    /**
     *  查询全部数据
     */
    public abstract Hydm getHymcList();
}
