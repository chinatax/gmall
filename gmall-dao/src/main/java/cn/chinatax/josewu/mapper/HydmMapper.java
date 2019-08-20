package cn.chinatax.josewu.mapper;

import cn.chinatax.josewu.base.bean.Hydm;

public interface HydmMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Hydm record);

    int insertSelective(Hydm record);

    Hydm selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Hydm record);

    int updateByPrimaryKey(Hydm record);
}