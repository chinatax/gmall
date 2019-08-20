package cn.chinatax.josewu.gmallservice;

import cn.chinatax.josewu.base.bean.Swjg;

public interface SwjgCacheService {
	
	
	/**
	 * 查询
	 *
	 * @param id
	 * @return
	 */
	Swjg selectById(int id);

	/**
	 * 更新
	 *
	 * @param  swjg
	 * @return
	 */
	 void updateById(Swjg swjg);

	/**
	 * 删除
	 *
	 * @param id
	 * @return
	 */
	String deleteById(int id);

}
