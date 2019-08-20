package cn.chinatax.josewu.gmalldao.impl;

import cn.chinatax.josewu.base.bean.Hymc;
import cn.chinatax.josewu.base.util.JdbcDaoImpl;
import cn.chinatax.josewu.gmalldao.HymcDao;
import org.springframework.stereotype.Repository;


@Repository("hymcDaoImpl")
public class HymcDaoImpl extends JdbcDaoImpl implements HymcDao {

    @Override
    public Hymc selectById(int id) {


        String sql = "select id,hydm,hymc from hydm where id=?";
        return queryForObject(sql, Hymc.class, id);

    }

}
