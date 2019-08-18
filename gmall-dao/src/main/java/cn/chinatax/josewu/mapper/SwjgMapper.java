package cn.chinatax.josewu.mapper;

import cn.chinatax.josewu.base.bean.Swjg;

public interface SwjgMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Swjg record);

    int insertSelective(Swjg record);

    Swjg selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Swjg record);

    int updateByPrimaryKey(Swjg record);
}