package cn.chinatax.josewu.gmalldao;

import cn.chinatax.josewu.base.bean.Hydm;
import cn.chinatax.josewu.base.bean.Hymc;
import org.springframework.stereotype.Repository;



public interface HymcDao {


	
	/**
	 * 查找
	 * 
	 * @param id
	 * @return
	 */
	Hydm selectById(int id);


}
