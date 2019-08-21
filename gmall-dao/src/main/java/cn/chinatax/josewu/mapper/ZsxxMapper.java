package cn.chinatax.josewu.mapper;

import cn.chinatax.josewu.base.bean.Zsxx;

public interface ZsxxMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Zsxx record);

    int insertSelective(Zsxx record);

    Zsxx selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Zsxx record);

    int updateByPrimaryKey(Zsxx record);
}