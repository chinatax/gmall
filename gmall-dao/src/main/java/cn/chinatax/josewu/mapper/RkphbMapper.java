package cn.chinatax.josewu.mapper;

import cn.chinatax.josewu.base.bean.Rkphb;

import java.util.List;

public interface RkphbMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rkphb record);

    int insertSelective(Rkphb record);

    int insertAllRkphb(List lists);

    Rkphb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rkphb record);

    int updateByPrimaryKey(Rkphb record);
}